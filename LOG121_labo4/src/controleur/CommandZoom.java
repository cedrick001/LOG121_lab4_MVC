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
	Nom du fichier   : CommandZoom.java
	Date créé        : 2016‐07-09
	Date dern. modif : 2014‐07‐
	*******************************************************
	Historique des modifications
	*******************************************************
	2014‐07‐09	Version initiale (Hicham Bennajeh)
	*******************************************************/

package controleur;

import modele.Perspective;

/**
 * 
 * cette classe permete de faire des zooms sur l'image 
 * 
 * @author HICHAM
 *
 */

public class CommandZoom implements Command{
	
   private int zoom ;
   private Perspective perspective ;
   
	
	public CommandZoom (Perspective perspective , int zoom){
		
		this.perspective = perspective ;
		this.zoom        = perspective.calculZoom(zoom);
			
		
	}


	@Override
	public void executer() {
		perspective.setCoordonneeX(perspective.getCoordonneeX()*zoom);
		perspective.setCoordonneeY(perspective.getCoordonneeY()*zoom);
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
