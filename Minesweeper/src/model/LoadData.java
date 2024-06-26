package model;

import java.util.HashMap;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoadData {
    private HashMap<String, BufferedImage> listImage;
    
    public LoadData() {
        listImage = new HashMap<String, BufferedImage>();

        try {
            BufferedImage img = ImageIO.read(new File("minesweeper.png"));              /*Không đọc đươc */
            listImage.put("title", img.getSubimage(0, 84, 114, 25));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, BufferedImage> getListImage() {
        return listImage;
    }

    public void setListImage(HashMap<String, BufferedImage> listImage) {
        this.listImage = listImage;
    }
}
