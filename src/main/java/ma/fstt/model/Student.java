package ma.fstt.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_student;

    private String lastName;
    private String firstName;
    private String cne;
    private String address;
    private String level;

    public Student(Long id_student, String lastName, String firstName, String cne, String address, String level) {
        this.id_student = id_student;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cne = cne;
        this.address = address;
        this.level = level;
    }

    public Student() {}

    public void setId(Long id) {
        this.id_student = id;
    }

    public Long getId() {
        return id_student;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", cne='" + cne + '\'' +
                ", address='" + address + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
