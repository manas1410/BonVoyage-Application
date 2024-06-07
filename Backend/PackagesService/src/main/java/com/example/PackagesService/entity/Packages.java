package com.example.PackagesService.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="packages")
public class Packages {
    @Id
    @Column(name="packageId")
    private String packageID;

    @Column(name="packageCountry")
    private String packageCountry;

    @Column(name="packageCity")
    private String packageCity;

    @Column(name="packageName")
    private String packageName;

    @Column(name="packageDesc")
    private String packageDesc;

    @Column(name="packageRating")
    private String packageRating;

    @Column(name="packageReviews")
    private String packageReviews;

    @Column(name="packagePrice")
    private String packagePrice;

    @Column(name="packageDuration")
    private  String packageDuration;

    @Column(name ="minAge")
    private String minAge;

    @Column(name="maxPeople")
    private String maxPeople;

    @Column(name="packagePickup")
    private String availableDate;

    @Column(name="packageLanguage")
    private String packageLanguage;

    @Column(name="packageImage")
    private String packageImage;
}
