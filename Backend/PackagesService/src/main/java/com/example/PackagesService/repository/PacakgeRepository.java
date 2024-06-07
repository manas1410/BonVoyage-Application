package com.example.PackagesService.repository;

import com.example.PackagesService.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacakgeRepository extends JpaRepository<Package,String> {
}
