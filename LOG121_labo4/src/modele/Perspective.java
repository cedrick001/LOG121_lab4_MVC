package modele;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Perspective extends Image {
		


	private static final long serialVersionUID = 469917637474822L;
	private int valeurZoom;
		
	
	
/*****************
* 	
* Constructeur par copie d'attribut
* @throws IOException 
* 	 
********/	
	
	public Perspective(File image) throws IOException {
		super(image);
		this.valeurZoom = 0;
	}
		
		
		
		
public void zoomIn() {
	valeurZoom += 3;
	int coordonneeX = getCoordonneeX();
	int coordonneeY = getCoordonneeY();
	setCoordonneeX(coordonneeX + valeurZoom);
	setCoordonneeY(coordonneeY + valeurZoom);
}

public void zoomOut(){
	valeurZoom -= 3;
	int coordonneeX = getCoordonneeX();
	int coordonneeY = getCoordonneeY();
	setCoordonneeX(coordonneeX - valeurZoom);
	setCoordonneeY(coordonneeY - valeurZoom);
}

public int calculZoom(int zoom){
	int valeurZoom = 0;
	return valeurZoom;
	
}
}
