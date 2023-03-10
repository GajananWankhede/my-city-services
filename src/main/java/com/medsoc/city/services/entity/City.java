package com.medsoc.city.services.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Table(name = "cities")
public class City {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id", nullable = false)
    private Long cityId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;


    private int population;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public City() {
    }

    public City(String name, int population) {

        this.name = name;
        this.population = population;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPopulation() {

        return population;
    }

    public void setPopulation(int population) {

        this.population = population;
    }

//    @Override
//    public int hashCode() {
//
//        int hash = 7;
//        hash = 79 * hash + Objects.hashCode(this.id);
//        hash = 79 * hash + Objects.hashCode(this.name);
//        hash = 79 * hash + this.population;
//
//        return hash;
//    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null) {
//            return false;
//        }
//
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//
//        final City other = (City) obj;
//        if (this.population != other.population) {
//            return false;
//        }
//
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//
//        return Objects.equals(this.id, other.id);
//    }

//    @Override
//    public String toString() {
//
//        var builder = new StringBuilder();
//        builder.append("City{id=").append(id).append(", name=")
//                .append(name).append(", population=")
//                .append(population).append("}");
//
//        return builder.toString();
//    }
}
