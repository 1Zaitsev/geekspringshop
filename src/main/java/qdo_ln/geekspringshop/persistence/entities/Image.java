package qdo_ln.geekspringshop.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Image {

    @Id
    private UUID id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id")
    private Product product;
}
