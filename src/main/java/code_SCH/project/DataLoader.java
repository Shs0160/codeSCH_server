package code_SCH.project;

import code_SCH.project.domain.Menu;
import code_SCH.project.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(MenuRepository menuRepository) {
        return args -> {
            List<String> menuNames = Arrays.asList("Menu1", "Menu2", "Menu3", "Menu4", "Menu5");

            for (String name : menuNames) {
                if (!menuRepository.findByName(name).isPresent()) {
                    menuRepository.save(new Menu(name));
                }
            }
        };
    }
}

