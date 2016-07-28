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



/**
 * Interface qui permette d'executer ou bien d'annuler une commande
 * 
 * @author HICHAM
 *
 */
public interface Command {
	
/**
 * Executer une commande 
 * 
 */
	
	void executer();
	
/**
 * annulerune commande 
 * 
 */
   void unexecute ();


}
