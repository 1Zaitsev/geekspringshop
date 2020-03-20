package qdo_ln.geekspringshop.persistence.entities;

import lombok.Data;
import qdo_ln.geekspringshop.persistence.entities.enums.ProductCategory;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Product {

    @Id
    private UUID id;

    private String title;

    private Date added;

    private Double price;

    private String description;

    private boolean available;

    @OneToMany(mappedBy = "product")
    private List<Image> image;

    @Enumerated(EnumType.ORDINAL)
    private ProductCategory category;


}
