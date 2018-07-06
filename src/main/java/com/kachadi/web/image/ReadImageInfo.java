package com.kachadi.web.image;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;
import java.io.IOException;

/**
 * 读取照片信息
 */
public class ReadImageInfo {

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
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println((System.currentTimeMillis() - now) / 1000D);
    }
}
