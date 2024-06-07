package com.example.PackagesService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="packageItenary")
public class PackageItenary {
    @Id
    @Column(name="itenaryId")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="packageID", nullable = false)
    private Package aPackage;

    @Column(name="day")
    private String day;

    @Column(name="title")
    private String title;

    @Column(name="activities")
    private String activities;

}
