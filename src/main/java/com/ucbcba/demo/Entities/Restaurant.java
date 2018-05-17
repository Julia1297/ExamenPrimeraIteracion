package com.ucbcba.demo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer score = 0;

    @NotNull
    @NotEmpty(message = "Ingrese nombre de restaurante")
    private String name;

    @NotNull
    @NotEmpty(message = "Ingrese la dirección")
    private String direction;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "levelPrice_id")
    private LevelPrice levelPrice;


    @NotNull
    @NotEmpty(message = "Ingrese el telefono")
    private String phone;


    private String foto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFoto() { return foto; }

    public void setFoto(String foto) { this.foto = foto; }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LevelPrice getLevelPrice() {
        return levelPrice;
    }

    public void setLevelPrice(LevelPrice levelPrice) {
        this.levelPrice = levelPrice;
    }
}
