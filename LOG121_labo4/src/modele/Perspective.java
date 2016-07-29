package modele;

//import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.io.Serializable;
//import java.util.Observable;

public class Perspective extends Image {
		

	private static final long serialVersionUID = 469917637474822L;
	private int valeurZoom;

		
	public Perspective(File image) throws IOException {
		super(image);
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

public void calculZoom(int zoom){
	valeurZoom += zoom;
	
	setChanged();
	notifyObservers();
	
}
}
