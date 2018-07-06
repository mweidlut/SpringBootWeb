package com.kachadi.web.image;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.kachadi.web.dto.ImageInfoDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * 读取照片信息
 */
@Service
public class ReadImageInfoService {

    public ImageInfoDto readImageInfo(InputStream inputStream){
        ImageInfoDto imageInfoDto = new ImageInfoDto();



        return imageInfoDto;
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();

        File jpegFile = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\image-1.jpg");
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    System.out.println(tag);
                }
            }
        } catch (ImageProcessingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println((System.currentTimeMillis() - now) / 1000D);
    }
}
