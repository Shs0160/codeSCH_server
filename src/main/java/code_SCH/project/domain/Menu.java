package code_SCH.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long count = 0L;
    private final Long maxCount = 100L;

    // Constructors, Getters, Setters, and Increment Logic

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void incrementCount() {
        if (this.count < this.maxCount) {
            this.count++;
        } else {
            throw new IllegalStateException("Maximum count reached for " + name);
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getMaxCount() {
        return maxCount;
    }

    public boolean isMaxCountReached() {
        return this.count >= this.maxCount;
    }
}
