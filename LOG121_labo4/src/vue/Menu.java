package vue;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

/******************************************************************************
 * Classe qui permet de creer un menu
 * 
 * @author DJ
 *
 *****************************************************************************/
public class Menu extends JMenuBar{

	private JMenu menu1;
	private JMenuBar menuBar;
	
	/**************************************************************************
	 * Constructeur par defaut
	 *************************************************************************/
	public Menu() {}
	
	/**************************************************************************
	 * Constructeur par passage d'attribut qui cre un menu ainsi que ses
	 * differentes options
	 * 
	 * @param nom Le texte sur le menu
	 *************************************************************************/
	public Menu(String nom) {
		
		//Prmiere option du menu
		menu1 = new JMenu(nom);
		
		//Les sous-options du menu1
		JMenuItem itemMenu1 = new JMenuItem("Nouveau");
		JMenuItem itemMenu2 = new JMenuItem("Sauvegarder");
		JMenuItem itemMenu3 = new JMenuItem("Supprimer");
		JMenuItem itemMenu4 = new JMenuItem("Copier");
		JMenuItem itemMenu5 = new JMenuItem("Coller");
		JMenuItem itemMenu6 = new JMenuItem("Refaire");
		JMenuItem itemMenu7 = new JMenuItem("Defaire");
		
		//Ajout des sous-options aux menu1
		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);
		menu1.add(itemMenu4);
		menu1.add(itemMenu5);
		menu1.add(itemMenu6);
		menu1.add(itemMenu7);
		
		//creation d'une barre de menu
		menuBar = new JMenuBar();
		
		//ajout du menu1 dans la barre de menu
		menuBar.add(menu1);		
	}
	
	/**************************************************************************
	 * Accesseur de la variable "menuBar"
	 * 
	 * @return Une barre de menu
	 *************************************************************************/
	public JMenuBar getJMenuBar() {
		
		return menuBar;
	}
}
