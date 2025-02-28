package com.example.RestDemo.Repository;

import com.example.RestDemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer> {

    //JpaRepository<modelClassName, type of primaryKey>
}
