package com.aftab.imagetopdf.service;

import com.aftab.imagetopdf.data.ImageData;

import jakarta.servlet.http.HttpServletResponse;

public interface ImageService {
 public void convertImageToPdf(ImageData data,HttpServletResponse response);
}
