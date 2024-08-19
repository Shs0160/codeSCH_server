package code_SCH.project.service;

import code_SCH.project.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import code_SCH.project.domain.Menu;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void processPayment(String menuName) {
        Optional<Menu> menuOptional = menuRepository.findByName(menuName);
        if (menuOptional.isPresent()) {
            Menu menu = menuOptional.get();
            if (menu.isMaxCountReached()) {
                throw new IllegalStateException("더 이상 결제가 불가능합니다: " + menuName);
            }
            menu.incrementCount();
            menuRepository.save(menu); // 카운트가 증가된 메뉴 저장
        } else {
            throw new IllegalArgumentException("존재하지 않는 메뉴: " + menuName);
        }
    }

    public Long getCurrentCount(String menuName) {
        return menuRepository.findByName(menuName)
                .map(Menu::getCount)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 메뉴: " + menuName));
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
}
