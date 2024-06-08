package com.example.PackagesService.payload;

import com.example.PackagesService.entity.PackageItenary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PackageDTO {
    private Long packageID;
    private String packageCountry;
    private String packageCity;
    private String packageName;
    private String packageDesc;
    private String packageRating;
    private String packageReviews;
    private String packagePrice;
    private  String packageDuration;
    private String minAge;
    private String maxPeople;
    private String availableDate;
    private String packageLanguage;
    private String packageImage;
    List<PackageItenary> packageItenaryList = new ArrayList<>();
}
