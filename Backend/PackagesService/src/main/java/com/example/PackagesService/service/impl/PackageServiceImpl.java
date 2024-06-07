package com.example.PackagesService.service.impl;

import com.example.PackagesService.entity.Package;
import com.example.PackagesService.entity.PackageItenary;
import com.example.PackagesService.exception.ResourceNotFoundException;
import com.example.PackagesService.payload.PackageDTO;
import com.example.PackagesService.repository.PacakgeRepository;
import com.example.PackagesService.service.PackageService;
import com.example.PackagesService.util.MapperLibrary;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PackageServiceImpl implements PackageService {

    private final PacakgeRepository pacakgeRepository;
    private final MapperLibrary mapperLibrary;

    @Override
    public PackageDTO createPackage(PackageDTO packageDTO) {
        Package aPackage = pacakgeRepository.save(mapperLibrary.mapToPackage(packageDTO));
        return mapperLibrary.mapToPackageDTO(aPackage);
    }

    @Override
    public PackageDTO getById(String packageID) {
        Package aPackage = pacakgeRepository.findById(packageID).orElseThrow(
                ()-> new ResourceNotFoundException("Package","id",packageID)
        );
        return mapperLibrary.mapToPackageDTO(aPackage);
    }
}
