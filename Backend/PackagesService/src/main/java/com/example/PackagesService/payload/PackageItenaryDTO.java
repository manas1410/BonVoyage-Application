package com.example.PackagesService.payload;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PackageItenaryDTO {
    private Long itenaryId;
    private Long packageID;
    private String day;
    private String title;
    private String activities;
    private String itenaryImage;
}
