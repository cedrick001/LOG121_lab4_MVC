package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/******************************************************************************
 * Classe qui permet de creer le panneau de gauche de l'application qui 
 * contiendra un panneau d'image
 * 
 * @author DJ
 *
 *****************************************************************************/
public class PanneauOrigine extends JPanel{

	JLabel label;
	PanneauImage panImage;
	
	/**************************************************************************
	 * Constructeur du panneau qui contiendra l'image d'origine
	 *************************************************************************/
	public PanneauOrigine() {
		
		//Taille du panneau
		setPreferredSize(new Dimension(900, 980));
		
		//Ajout d'un label indiquant a quoi sert le panneau
		label = new JLabel("Image d'origine");
		label.setFont(new Font("Arial", Font.PLAIN, 24));
		label.setOpaque(true);
		
		//Creation du panneau d'image
		panImage = new PanneauImage(label, null, 800, 980);
		panImage.setBorder(BorderFactory.createLineBorder(
				new Color(0, 0, 0), 1));
		
		//ajout du panneau d'image a celle de gauche
		add(panImage);
		
		//Definition du layout
		setLayout(new FlowLayout());
	}
}
