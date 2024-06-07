package com.example.PackagesService.service;

import com.example.PackagesService.entity.Package;
import com.example.PackagesService.payload.PackageDTO;

public interface PackageService {
    PackageDTO createPackage(PackageDTO packageDTO);
    PackageDTO getById(String packageID);
}
