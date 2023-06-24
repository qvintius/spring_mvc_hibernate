package mainpackage.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private int id_person;

    @Getter
    @Setter
    @NotEmpty(message = "Name shouldn't be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    @Column(name = "name_person")
    private String name_person;

    @Getter
    @Setter
    @Min(value = 1, message = "Age should be greater than 0")
    @Column(name = "age")
    private int age;

    @Getter
    @Setter
    @NotEmpty(message = "Email shouldn't be empty")
    @Email(message = "Email should be valid")
    @Column(name = "email")
    private String email;

    public Person(String name_person, int age) {
        this.name_person = name_person;
        this.age = age;
    }
    public Person(String name_person, int age, String email) {
        this.name_person = name_person;
        this.age = age;
        this.email = email;
    }

}
