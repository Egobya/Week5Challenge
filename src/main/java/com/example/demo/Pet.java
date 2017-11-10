package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 4)
    private String pet_name;

    @NotNull
    @Size(min = 2)
    private int pet_age;

    @NotNull
    @Size(min = 10)
    private String animal_type;

    @NotNull
    @Size(min = 3)
    private String pet_color;

    @NotNull
    @Size(min = 3)
    private String petowner;

    @NotNull
    @Size(min = 10)
    private String Petowner_contactnum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public int getPet_age() {
        return pet_age;
    }

    public void setPet_age(int pet_age) {
        this.pet_age = pet_age;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getPet_color() {
        return pet_color;
    }

    public void setPet_color(String pet_color) {
        this.pet_color = pet_color;
    }

    public String getPetowner() {
        return petowner;
    }

    public void setPetowner(String petowner) {
        this.petowner = petowner;
    }

    public String getPetowner_contactnum() {
        return Petowner_contactnum;
    }

    public void setPetowner_contactnum(String petowner_contactnum) {
        Petowner_contactnum = petowner_contactnum;
    }

}


