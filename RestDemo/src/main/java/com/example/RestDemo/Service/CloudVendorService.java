package com.example.RestDemo.Service;

import com.example.RestDemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(Integer vendorId);
    public CloudVendor getCloudVendor(Integer vendorId);
    public List<CloudVendor> getAllCouldVendors();
}
