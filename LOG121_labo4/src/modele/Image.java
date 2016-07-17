

package modele;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.Serializable;




public class Image implements Serializable {

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	
	
/*****************
* 	
* Constructeur par copie d'attribut
* 	 
********/
	public Image (BufferedImage image){
		this.image = image;
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
/*****************
*
*	Méthodes
* 
***************/

public void importImage(BufferedImage image) {
	this.image = image;
}

public void sauvegarderImage(){

}

}
