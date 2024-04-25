package com.sritech.Ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sritech.Ekart.adminEntity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
