package pl.sda.OrangeJavaPL2.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Bakery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(cascade = CascadeType.ALL)
    List<Bread> breadList;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    @OneToOne(cascade = CascadeType.ALL)
    Owner owner;

    public Bakery(List<Bread> breadList, Address address, Owner owner) {
        this.breadList = breadList;
        this.address = address;
        this.owner = owner;
    }
//    -> unpack to below fields
//    String firstName;
//    String lastName;
//    int age;
}
