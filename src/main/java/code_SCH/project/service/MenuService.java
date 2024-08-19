package code_SCH.project.service;

import code_SCH.project.domain.Menu;
import code_SCH.project.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
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
            System.out.println("Current count: " + menu.getCount());

            menu.incrementCount();
            menu.setUpdatedAt(LocalDateTime.now());  // 결제 시간 설정
            System.out.println("Updated count: " + menu.getCount());

            menuRepository.save(menu);
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
