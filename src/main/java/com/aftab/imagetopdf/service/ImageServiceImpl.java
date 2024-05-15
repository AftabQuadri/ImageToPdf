package com.aftab.imagetopdf.service;

import java.io.InputStream;

import org.springframework.stereotype.Service;

import com.aftab.imagetopdf.data.ImageData;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class ImageServiceImpl implements ImageService {

	
	public void convertImageToPdf(ImageData data,HttpServletResponse response) {
		Document document=new Document();
		
		try {
			PdfWriter pdfWriter=PdfWriter.getInstance(document, response.getOutputStream());
			pdfWriter.open();
			document.open();
			InputStream input=data.getUser_image().getInputStream();
	        byte[] imageData = input.readAllBytes();
            Image image = Image.getInstance(imageData);
			document.add(Image.getInstance(image));
			pdfWriter.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
