package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.image.BufferedImage;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Image image = new Image(new File("d:Amulet.jpg"));
		image.sauvegarderImage();
		System.out.print(image.getImage().toString());
		image.importImage("d:Amulet.jpg");
		System.out.print(image.getImage().toString());
		
	}

}
