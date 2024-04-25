package com.sritech.Ekart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sritech.Ekart.adminEntity.Admin;
import com.sritech.Ekart.adminService.AdminService;

import jakarta.persistence.EntityNotFoundException;

@ResponseBody
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String method() {
		System.out.println("entered unto controller");
		adminService.getAdmin("hii");
		System.out.println("back to controller");
		return "Done";
	}

	@GetMapping("/hello")
	public String display() {
		return "Hello Syam";
	}

	@GetMapping("/index")
	public ModelAndView ShowIndexPage(ModelAndView model) {

		model.setViewName("AdminPanel");
		return model;
	}

	@GetMapping("/formLogIn")
	public ModelAndView ShowLogInPage(ModelAndView model) {

		model.setViewName("LogIn");
		return model;
	}

	@PostMapping("/login")
	public ModelAndView postAdminCredentials(@RequestParam String adminId, @RequestParam String pwd) {
		ModelAndView model = new ModelAndView();

		try {
			System.out.println("adminId =" + adminId + "\t" + "Password =" + pwd);
			Admin admin = adminService.getAdmin(adminId);

			if (admin != null && adminId.equals(admin.getUserLoginId()) && pwd.equals(admin.getUserPassword())) {
				model.setViewName("SuccessfullyLogged");
			} else {
				model.setViewName("LogIn");
				model.addObject("message", "Incorrect password");
			}
		} catch (EntityNotFoundException ex) {
			// when the adminid is not found in that case

			model.setViewName("LogIn");
			model.addObject("message", "Admin ID not found");
		} catch (Exception e) {
			e.printStackTrace();
			model.setViewName("ErrorPage");
		}
		return model;
	}
	
	@GetMapping("/formReset")
	public ModelAndView ShowResetPage(ModelAndView model) {

		model.setViewName("Reset");
		return model;
	}
	
	@GetMapping("/reset")
	public ModelAndView validateResettingPassword(@RequestParam String adminId, @RequestParam String oldPwd ,@RequestParam String newPwd) {
		ModelAndView model = new ModelAndView();
		System.out.println("inside validate restting password method");
		
		try {
			System.out.println("adminId =" + adminId + "\t" + "OldPassword =" + oldPwd+ "\t" + "NewPassword =" + newPwd);

			Admin admin = adminService.getAdmin(adminId);
			
			if (admin != null && adminId.equals(admin.getUserLoginId()) && oldPwd.equals(admin.getUserPassword())) {
				
				admin.setUserPassword(newPwd);
				adminService.savePassword(admin);
				System.out.println("password updated successfully");
				model.setViewName("SuccessfullyUpdated");
			} else {

				model.setViewName("Reset");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
		
	}

}
