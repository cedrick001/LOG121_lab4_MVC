package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.image.BufferedImage;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileOutputStream fileOut =
		         new FileOutputStream("image.serial");
		
		
		ObjectOutputStream oos =  new ObjectOutputStream(fileOut) ;
		
		
		// Création de l'objet
		BufferedImage test = new BufferedImage(50,50,BufferedImage.TYPE_INT_BGR);
		Image image = new Image(test);
		
		
		//Ecriture dans un fichier
		oos.writeObject(image);
		oos.flush();
		oos.close();
		fileOut.close();
        
	}

}
