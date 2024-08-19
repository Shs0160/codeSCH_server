package code_SCH.project;

import code_SCH.project.domain.Menu;
import code_SCH.project.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(MenuRepository menuRepository) {
        return args -> {
            menuRepository.save(new Menu("Menu1"));
            menuRepository.save(new Menu("Menu2"));
            menuRepository.save(new Menu("Menu3"));
            menuRepository.save(new Menu("Menu4"));
            menuRepository.save(new Menu("Menu5"));
        };
    }
}
