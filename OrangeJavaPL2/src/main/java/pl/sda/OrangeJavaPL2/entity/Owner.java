package pl.sda.OrangeJavaPL2.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {

    String firstName; // -> by default in db = first_name
    String lastName;
    int age;


}
