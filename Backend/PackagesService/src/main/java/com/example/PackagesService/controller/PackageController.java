package com.example.PackagesService.controller;

import com.example.PackagesService.payload.PackageDTO;
import com.example.PackagesService.service.impl.PackageServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("packages")
@AllArgsConstructor
public class PackageController {

    private final PackageServiceImpl packageService;

    @GetMapping("/{packgeID}")
    public PackageDTO getByPackageID(@PathVariable(value = "packgeID") String packageID){
        return packageService.getById(packageID);
    }
    @PostMapping()
    public PackageDTO createPackage(@RequestBody PackageDTO packageDTO){
        return packageService.createPackage(packageDTO);
    }
}
