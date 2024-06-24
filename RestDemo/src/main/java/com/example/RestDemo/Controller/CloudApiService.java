package com.example.RestDemo.Controller;


import com.example.RestDemo.Model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/cloudvendor") // request mapping
public class CloudApiService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(String vendorId) {

        return cloudVendor;

    }


    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVendor cloudvendor) {

        this.cloudVendor = cloudvendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping ("/update")
    public String updateCloudVendor(@RequestBody CloudVendor cloudvendor) {

        this.cloudVendor = cloudvendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){

        this.cloudVendor = null;

        return "Cloud Vendor is Deleted Successfully";


    }







}
