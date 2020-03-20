package qdo_ln.geekspringshop.persistence.entities.enums;

import lombok.Getter;

public enum ProductCategory {
    FOOD("Продукты"),
    DRINKS("Напитки");

    @Getter
    private String name;

    ProductCategory(String name){
        this.name = name;
    }
}
