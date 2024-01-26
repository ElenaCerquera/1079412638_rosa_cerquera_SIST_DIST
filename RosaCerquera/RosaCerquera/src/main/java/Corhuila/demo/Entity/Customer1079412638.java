package Corhuila.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer_1079412638")
public class Customer1079412638 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String String;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getString() {
        return String;
    }

    public void setString(java.lang.String string) {
        String = string;
    }
}
