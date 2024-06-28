package com.example.RestDemo.Controller;


import com.example.RestDemo.Model.CloudVendor;
import com.example.RestDemo.Service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/cloudvendor") // request mapping
public class CloudVendorController {


    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable("vendorId") String vendorId) {

        return cloudVendorService.getCloudVendor(vendorId);

    }


    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVendor cloudvendor) {


        cloudVendorService.createCloudVendor(cloudvendor);

        return "Cloud Vendor is successfully created";
    }

    @PutMapping ("/update")
    public String updateCloudVendor(@RequestBody CloudVendor cloudvendor) {


        cloudVendorService.updateCloudVendor(cloudvendor);

        return "Cloud Vendor is successfully updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){

        cloudVendorService.deleteCloudVendor(vendorId);

        return "Cloud Vendor is successfully deleted";

    }
    @GetMapping
    public List<CloudVendor> getAllDetails(){

        return cloudVendorService.getAllCouldVendors();

    }







}
