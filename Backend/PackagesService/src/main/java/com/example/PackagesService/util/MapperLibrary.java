package com.example.PackagesService.util;

import com.example.PackagesService.PackagesServiceApplication;
import com.example.PackagesService.entity.Package;
import com.example.PackagesService.payload.PackageDTO;
import org.springframework.stereotype.Component;

@Component
public class MapperLibrary {
    public Package mapToPackage(PackageDTO packageDTO){
        return PackagesServiceApplication.modelMapper().map(packageDTO,Package.class);
    }

    public PackageDTO mapToPackageDTO(Package pack){
        return PackagesServiceApplication.modelMapper().map(pack,PackageDTO.class);
    }
}
