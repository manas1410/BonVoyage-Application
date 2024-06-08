package com.example.PackagesService.controller;

import com.example.PackagesService.payload.PackageDTO;
import com.example.PackagesService.service.impl.PackageServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("packages")
@AllArgsConstructor
public class PackageController {

    private final PackageServiceImpl packageService;

    @GetMapping("/{packgeID}")
    public PackageDTO getByPackageID(@PathVariable(value = "packgeID") Long packageID){
        return packageService.getById(packageID);
    }
    @GetMapping("/package/{packageName}")
    public List<PackageDTO> getByName(@PathVariable(value = "packageName") String packageName){
        return packageService.getByPackageName(packageName);
    }
    @PostMapping()
    public PackageDTO createPackage(@RequestBody PackageDTO packageDTO){
        return packageService.createPackage(packageDTO);
    }
}
