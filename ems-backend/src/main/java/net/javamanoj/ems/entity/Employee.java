package net.javamanoj.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Id variable
    private Long id;

    //firstName variable
    @Column(name = "first_name")
    private String firstName;

    //lastName variable
    @Column(name = "last_name")
    private String lastName;

    //email variable
    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}
