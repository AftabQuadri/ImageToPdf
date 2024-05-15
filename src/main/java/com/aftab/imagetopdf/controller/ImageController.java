package com.aftab.imagetopdf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aftab.imagetopdf.data.ImageData;
import com.aftab.imagetopdf.service.ImageService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ImageController {
	@Autowired
	ImageService imageService;
	@GetMapping("/")
  public String home() {
	  return "index";
  }
	
	
	@PostMapping("/convert")
	public void convertImageToPdf(@ModelAttribute ImageData data,HttpServletResponse response) {
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition","attachment;filename=imagetopdf.pdf");
		imageService.convertImageToPdf(data, response);

	}
}
