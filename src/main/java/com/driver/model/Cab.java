package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int perKmRate;

    private Boolean avilable;

    @OneToOne
    @JoinColumn
    private Driver driver;
    public Cab() {

    }

    public Cab(int id, int perKmRate, Boolean avilable, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.avilable = avilable;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Boolean getAvilable() {
        return avilable;
    }

    public void setAvilable(Boolean avilable) {
        this.avilable = avilable;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}