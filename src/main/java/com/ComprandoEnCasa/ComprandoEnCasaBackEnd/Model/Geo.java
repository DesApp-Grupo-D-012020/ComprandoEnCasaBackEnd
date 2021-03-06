package com.ComprandoEnCasa.ComprandoEnCasaBackEnd.Model;

import javax.persistence.*;

@Entity
@Table(name = "BSGeo")
public class Geo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long  geoID;

    private Double latitude;
    private Double longitude;
    private String name;

    public Double getLatitude() { return latitude; }

    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }

    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Geo(Double latitude, Double longitude, String name){

        this.setLatitude(latitude);
        this.setLongitude(longitude);
        this.setName(name);
    }
}
