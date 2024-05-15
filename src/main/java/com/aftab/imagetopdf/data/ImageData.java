package com.aftab.imagetopdf.data;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Component
@Data
public class ImageData {
private MultipartFile user_image;
}
