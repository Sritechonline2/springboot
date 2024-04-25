package com.sritech.Ekart.adminServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sritech.Ekart.adminEntity.Admin;
import com.sritech.Ekart.adminService.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private JpaRepository<Admin, String> jpaRepository ;

	@Override
	public Admin getAdmin(String adminId) {
		System.out.println("entered into serviceImpl getAdmin method");
		Admin admin = jpaRepository.getById(adminId);
		
		return admin;
	}

	@Override
	public void savePassword(Admin admin) {
		System.out.println("entered inti serviceImpl save password method");
		jpaRepository.save(admin);
		
	}
	
	
	
}
