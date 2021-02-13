package io.hari.profiletest;

import lombok.ToString;

/**
 * @author HariomYadav
 * @since 13/02/21
 */
@ToString
public class Customer {
    int id;
    String name;
    String email;

    public Customer(int id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
