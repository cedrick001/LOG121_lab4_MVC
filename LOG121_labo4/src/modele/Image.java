

package modele;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Observable;


import javax.imageio.ImageIO;




public class Image extends Observable implements Serializable {

	
	private static final long serialVersionUID = -984752116648850748L;
	private transient BufferedImage image;
	private int coordonneeX = 0;
	private int coordonneeY = 0;
	
	
	
/*****************
* 	
* Constructeur par copie d'attribut
 * @throws IOException 
* 	 
********/
	public Image (File image) throws IOException{
		setImage(ImageIO.read(image));
		setChanged();
		notifyObservers(image);
		}


	
/*****************
*
*	Setters/getters
* 
***************/
public BufferedImage getImage() {
	return image;
}

public void setImage(BufferedImage image) {
	this.image = image;
}

public int getCoordonneeX() {
	return coordonneeX;
}

public void setCoordonneeX(int coordonneeX) {
	this.coordonneeX = coordonneeX;
}

public int getCoordonneeY() {
	return coordonneeY;
}

public void setCoordonneeY(int coordonneeY) {
	this.coordonneeY = coordonneeY;
}


/*****************
*
*	METHODES
*	@throws IOException 
* 
***************/

public void importImage(String image) throws IOException {
	
	setImage(ImageIO.read((new File(image))));
}


/*****************
*
*	Permet la sauvegarde de l'image en fichier .serial
* 	@throws IOException 
* 
***************/

public void sauvegarderImage() throws IOException{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez saisir le nom du fichier de destination :");
	String fileName = sc.nextLine();
	
	
	//Création du répertoire de destination et du flux de sortie
	FileOutputStream fileOut = new FileOutputStream("d:"+ fileName + ".serial");
	ObjectOutputStream oos =  new ObjectOutputStream(fileOut) ;
	
	

	
	//Ecriture dans un fichier
	oos.writeObject(this);
	oos.flush();
	
	// Vidage de la mémoire
	oos.close();
	fileOut.close();

}

// Méthode qui donne le choix du fichier source de l'image a charger
public void ouvrirImage() throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez choisir le fichier source :");
	String fileName = sc.nextLine();
	File image = new File(fileName);
	new Image(image);

}
}
