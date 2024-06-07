package com.example.PackagesService.repository;

import com.example.PackagesService.entity.PackageItenary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageItenaryRepository extends JpaRepository<PackageItenary,String> {
}
