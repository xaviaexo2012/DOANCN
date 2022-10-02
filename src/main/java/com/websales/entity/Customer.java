package com.websales.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "Customers")
public class Customer {
    @NotEmpty(message = "Vui lòng nhập tài khoản!")
    @Id
    @Column(name = "Id")
    String id;

    @NotEmpty(message = "Vui lòng nhập mật khẩu")
    @Column(name = "Password")
    String password;

    @NotEmpty(message = "Vui lòng nhập tên khách hàng")
    @Column(name = "Fullname")
    String fullname;

    @NotEmpty(message = "Vui lòng nhập email")
    @Email
    @Column(name = "Email")
    String email;

    @Column(name = "Photo")
    String photo = "user.png";

    @Column(name = "Activated")
    boolean activated = false;

    @Column(name = "Admin")
    boolean admin = false;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    List<Order> orders;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Customer(@NotBlank String id) {
        super();
        this.id = id;
    }

    public Customer() {

    }
}
