package com.example.RestDemo.Repository;

import com.example.RestDemo.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

    //JpaRepository<modelClassName, type of primaryKey>
}
