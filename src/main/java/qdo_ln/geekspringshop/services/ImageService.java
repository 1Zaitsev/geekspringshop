package qdo_ln.geekspringshop.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import qdo_ln.geekspringshop.persistence.repositories.ImageRepository;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    private String getImageForProduct(UUID id){
        return imageRepository.obtainImageNameByProductId(id);
    }

    public BufferedImage loadFileAsResource(String id) throws IOException {
        try{
            String imageName = getImageForProduct(UUID.fromString(id));
            Resource resource = new ClassPathResource("/static/images/" + imageName);
            if(resource.exists()){
                return ImageIO.read(resource.getFile());
            }else{
                log.error("Image not found!");
                throw new FileNotFoundException("Image not found!");
            }
        }catch (MalformedInputException | FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}
