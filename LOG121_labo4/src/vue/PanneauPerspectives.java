package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/******************************************************************************
 * Classe qui permet de creer le panneau de droite de l'application qui 
 * contiendra les deux panneaux de perspectives
 * 
 * @author DJ
 *
 *****************************************************************************/
public class PanneauPerspectives extends JPanel{

	JLabel labelP1;
	JLabel labelP2;
	PanneauImage panImage1;
	PanneauImage panImage2;
	
	/**************************************************************************
	 * Constructeur du panneau qui contiendra les perspectives
	 *************************************************************************/
	public PanneauPerspectives() {
		
		//Taille du panneau
		setPreferredSize(new Dimension(900, 980));
		
		//Creation des labels pour les deux perspectives
		labelP1 = new JLabel("Perspective 1");
		labelP1.setFont(new Font("Arial", Font.PLAIN, 24));
		labelP1.setOpaque(true);
		
		labelP2 = new JLabel("Perspective 2");
		labelP2.setFont(new Font("Arial", Font.PLAIN, 24));
		labelP2.setOpaque(true);
		
		//Creation des panneaux de perspectives
		panImage1 = new PanneauImage(labelP1, null, 700, 400);
		panImage2 = new PanneauImage(labelP2, null, 700, 400);
		panImage1.setBorder(BorderFactory.createLineBorder(
				new Color(0, 0, 0), 1));
		panImage2.setBorder(BorderFactory.createLineBorder(
				new Color(0, 0, 0), 1));
		
		//Ajout des panneaux de perspectives au panneau de droite
		add(panImage1);
		add(panImage2);
		
		setLayout(new GridLayout(2, 1));
	}
}
