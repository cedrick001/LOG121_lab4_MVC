/******************************************************
	Cours : LOG121
	Session : été 2014
	Groupe : 02
	Projet : Laboratoire #4
	Étudiants : 	- Hicham Bennajeh 
	                -
	                -
	Codes perm. :	- BENH01017908
					- 
					-
	Chargé de cours  : 
	Chargés de labo  : 
	Nom du fichier   : Command.java
	Date créé        : 2016‐07-09
	Date dern. modif : 2014‐07‐
	*******************************************************
	Historique des modifications
	*******************************************************
	2014‐07‐09	Version initiale (Hicham Bennajeh)
	*******************************************************/

package controleur;

import modele.Image;

/**
 * cette classe permete de faire les translation sur l'image 
 * 
 * @author HICHAM
 *
 */

public class CommandTranslation implements Command{
	
	int coordonne_x ;
	int coordonne_y ;
	
/**
 * Constructeur permettant de creer une translation avec les coordonnees necessaire
 * 	
 */
	public CommandTranslation (int x , int y ){
		
		this.coordonne_x = x ;
		this.coordonne_y = y ;
		
		
	}

	@Override
	public void executer() {
		
		
		
		
	}

	@Override
	public void unexecute() {
		
		
	}

}
