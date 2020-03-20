package qdo_ln.geekspringshop.persistence.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Data
public class Image {

    @Id
    private UUID id;

    private String name;

    @OneToOne(mappedBy = "image")
    private Product product;
}
