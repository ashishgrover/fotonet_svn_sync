package com.nagarro.fotonet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.*;
import com.nagarro.fotonet.entity.Photo;
import com.nagarro.fotonet.services.PhotoService;

@Controller
@RequestMapping(value = "upload")
public class UploadFileController {

	@Autowired
	private PhotoService photoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getUploadForm(Model model) {
		model.addAttribute(new Photo());
		return "upload";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String create(Photo uploadedPhoto, BindingResult result,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				System.err.println("Error: " + error.getCode() + " - "
						+ error.getDefaultMessage());
			}
			return "upload";
		}
		photoService.uploadPhoto(uploadedPhoto);
		return "home";
	}
	
	public PhotoService getPhotoService() {
		return photoService;
	}

	public void setPhotoService(PhotoService photoService) {
		this.photoService = photoService;
	}

}