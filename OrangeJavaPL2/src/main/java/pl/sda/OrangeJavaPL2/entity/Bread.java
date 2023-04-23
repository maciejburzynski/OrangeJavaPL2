package pl.sda.OrangeJavaPL2.entity;

import lombok.*;

import javax.persistence.*;

@Entity // Database entity-object to map
@Setter // Required for entity
@Getter // Required for entity
@NoArgsConstructor // Required for entity
@AllArgsConstructor
@ToString
@Table(name = "breads") // Change default name to custom one
public class Bread {

    @Id // Required for entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement id with every single object
    Long id;
    String name;
    @Column(name = "price_in_pln") // Change default name to custom one
    Double price;

    public Bread(String name, Double price) { // Every single field included except id
        this.name = name;
        this.price = price;
    }
}
