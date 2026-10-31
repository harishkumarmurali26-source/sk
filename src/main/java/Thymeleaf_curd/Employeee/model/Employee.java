package Thymeleaf_curd.Employeee.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table( name ="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    @NotEmpty(message = "FirstName is required")
    @Size(min = 2, message = "First name must be at least 2 characters")
    private String firstName;

    @Column(name = "lastName")
    @NotEmpty(message = "LastName is required")
    @Size(min = 2, message = "Last name must be at least 2 characters")
    private String lastName;

    @NotEmpty(message = "Email is required")
    @Email(message = "Please enter a valid email address")
    private String email;

    @Column(name = "department")
    @NotEmpty(message = "Please select department")
    private String department;

    @Column(name = "gender")
    @NotEmpty(message = "Please select gender")
    private String gender;

    @Column(name = "skills")
    @NotEmpty(message = "Please select Skills")
    private List<String> skills;

    @Column(name = "location")
    @NotEmpty(message = "Please select your location")
    private String location;

    public Employee() {
    }

    public Employee(String firstName, String lastName,String email,String department, String gender, List<String> skills, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email    = email;
        this.department = department;
        this.gender = gender;
        this.skills = skills;
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", skills=" + skills +
                ", location='" + location + '\'' +
                '}';
    }
}
