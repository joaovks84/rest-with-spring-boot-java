package br.com.erudio.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String fistName;
    private String lastName;
    private String address;
    private String gender;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        if (this.fistName == null) {
            this.fistName = fistName;
        } else {
            System.out.println("FistName is null");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (this.lastName == null) {
            this.lastName = lastName;
        } else {
            System.out.println("LastName is null");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (this.address == null) {
            this.address = address;
        } else {
           System.out.println("Address is null");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (this.gender == null) {
            this.gender = gender;
        } else {
            System.out.println("Gender is null");
        }
    }
    public void Pessoa(){
        System.out.println("Person id: " + this.id);
        System.out.println("Fist name: " + this.fistName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Address: " + this.address);
        System.out.println("Gender: " + this.gender);
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getFistName(), person.getFistName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getAddress(), person.getAddress());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFistName(), getLastName(), getAddress(), getGender());
    }
}
