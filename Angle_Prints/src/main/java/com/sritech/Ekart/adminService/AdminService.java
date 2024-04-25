package com.sritech.Ekart.adminService;

import com.sritech.Ekart.adminEntity.Admin;

public interface AdminService {
	
	public Admin getAdmin(String id);

	public void savePassword(Admin admin);

}
