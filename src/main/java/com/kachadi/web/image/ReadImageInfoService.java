package com.kachadi.web.image;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.kachadi.web.dto.ImageInfoDto;
import com.kachadi.web.enums.ImagePropEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * 读取照片信息
 */
@Service
public class ReadImageInfoService {


    public static void main(String[] args) throws Exception {
        File jpegFile = new File("C:\\Users\\ROOT\\Desktop\\天牛.jpg");
        FileInputStream inputStream = new FileInputStream(jpegFile);

        ImageInfoDto imageInfoDto = new ReadImageInfoService().readImageInfo(inputStream);
        System.out.println(imageInfoDto);
    }

    public ImageInfoDto readImageInfo(InputStream inputStream) {

        Metadata metadata = null;
        try {
            metadata = ImageMetadataReader.readMetadata(inputStream);
        } catch (ImageProcessingException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        if (Objects.isNull(metadata)) {
            throw new RuntimeException("未能读取照片，请换一张原图");
        }

        ImageInfoDto imageInfoDto = new ImageInfoDto();
        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {

                if (ImagePropEnum.Make.prop.equals(tag.getTagName())) {
                    imageInfoDto.setMake(tag.getDescription());
                }
                if (ImagePropEnum.Model.prop.equals(tag.getTagName())) {
                    imageInfoDto.setModel(tag.getDescription());
                }
                if (ImagePropEnum.Date_Time.prop.equals(tag.getTagName())) {
                    imageInfoDto.setDateTime(tag.getDescription());
                }
                if (ImagePropEnum.Image_Height.prop.equals(tag.getTagName())) {
                    imageInfoDto.setHeightPix(tag.getDescription());
                }
                if (ImagePropEnum.Image_Width.prop.equals(tag.getTagName())) {
                    imageInfoDto.setWidthPix(tag.getDescription());
                }
                if (ImagePropEnum.GPS_Longitude.prop.equals(tag.getTagName())) {
                    imageInfoDto.setGpsLongitude(this.transfer(tag.getDescription()));
                }
                if (ImagePropEnum.GPS_Latitude.prop.equals(tag.getTagName())) {
                    imageInfoDto.setGpsLatitude(this.transfer(tag.getDescription()));
                }
            }
        }

        return imageInfoDto;
    }

    private String transfer(String value) {
        if (StringUtils.isBlank(value)) {
            return value;
        }

        return convertToDegree(value.replace(" ", ""));

    }

    //照片的度分秒转gps
    private String convertToDegree(String stringDMS) {
        String du = stringDMS.substring(0, stringDMS.indexOf("°"));
        String fen = stringDMS.substring(stringDMS.indexOf("°") + 1, stringDMS.indexOf("'"));
        String miao = stringDMS.substring(stringDMS.indexOf("'") + 1, stringDMS.indexOf("\""));

        Float result = Float.valueOf(du) + (Float.valueOf(fen) / 60) + (Float.valueOf(miao) / 3600);

        return String.valueOf(result);
    }
}
