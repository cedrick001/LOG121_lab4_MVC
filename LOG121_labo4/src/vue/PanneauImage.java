package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.BorderFactory;

/******************************************************************************
 * Classe qui permet de creer des panneaux d'images
 * 
 * @author DJ
 *
 *****************************************************************************/
public class PanneauImage extends JPanel {

	JTextPane panImage;
	ImageIcon image;
	
	/**************************************************************************
	 * Constructeur par defut
	 *************************************************************************/
	public PanneauImage() {}
	
	/**************************************************************************
	 * Constructeur d'un panneau d'image type
	 * 
	 * @param titre Le texte du JLabel
	 * @param image L'image qui sera affiche
	 * @param largeur Largeur du panneau
	 * @param longueur Longueur du panneau
	 *************************************************************************/
	public PanneauImage(JLabel titre, ImageIcon image,
			int largeur, int longueur) {

		//Creation type d'un panneau d'image
		panImage = new JTextPane();
		
		//Definit si le panneau est editable ou pas
		panImage.setEditable(false);

		//Taille preferee du panneau type
		panImage.setPreferredSize(new Dimension(largeur, longueur));
		
		//Recupere le titre et la liste recu en parametre
		this.image = image;

		//Ajout des elements du panneau et ajuste la mise en forme
		setLayout(new BorderLayout());
		add(panImage, BorderLayout.CENTER);
		add(titre, BorderLayout.PAGE_START);
		titre.setFont(new Font("Arial", Font.PLAIN, 24));
		//panImage.insertIcon(image);
		panImage.setBackground(new Color(235, 235, 235));
		panImage.setBorder(BorderFactory.createLineBorder(
				new Color(0, 0, 0), 1));
	}
}
