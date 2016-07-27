package vue;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

/******************************************************************************
 * Classe principale de l'interface graphique.
 * 
 * @author DJ
 *
 *****************************************************************************/
public class FrameApp implements Runnable {

	private JFrame frame;
	private Menu menu;
	private PanneauOrigine panneauOrigine;
	private PanneauPerspectives panneauPerspectives;
	
	/**************************************************************************
	 * Methode "main" de l'application qui cree un thread pour l'interface
	 * graphique
	 * 
	 * @param args
	 *************************************************************************/
	public static void main(String[] args) {
		
		FrameApp fa = new FrameApp();
		Thread t = new Thread(fa);
		t.start();
	}

	/**************************************************************************
	 * Methode qui fait rouler l'application
	 *************************************************************************/
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		creerInterface();
	}
	
	/**************************************************************************
	 * Methode qui cree l'interface principale de l'application
	 *************************************************************************/
	public void creerInterface() {
		
		frame = new JFrame();
		menu = new Menu("Fichier");
		panneauOrigine = new PanneauOrigine();
		panneauPerspectives = new PanneauPerspectives();
		
		frame.getContentPane().add(panneauOrigine, BorderLayout.WEST);
		frame.getContentPane().add(panneauPerspectives, BorderLayout.EAST);
		frame.setJMenuBar(menu.getJMenuBar());
		
		//Configuration et comportement du cadre
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setTitle("QUIZ");
		this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				
		//Affiche le frame
		this.frame.setVisible(true);
	}

}
