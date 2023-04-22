package pl.sda.OrangeJavaPL2.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "breads")
public class Bread {

    @Id
    Long id;
    String name;
    @Column(name = "price_in_pln")
    Double price;

}
