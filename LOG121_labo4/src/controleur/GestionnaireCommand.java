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

import java.util.ArrayList;
import java.util.List;

public class GestionnaireCommand {

	private static GestionnaireCommand Instance;

	private List<Command> CommandAdd;
	private List<Command> CommandMove;

	/**
	 * 
	 * Constructeur prive pour specifie le pattern singleton
	 * 
	 */

	private GestionnaireCommand() {

		CommandAdd = new ArrayList<Command>();
		CommandMove = new ArrayList<Command>();

	}

	public static GestionnaireCommand getInstance() {

		if (Instance == null) {
			Instance = new GestionnaireCommand();
		}
		return Instance;
	}

	public void executer(Command cmd) {

		CommandAdd.add(cmd);
		cmd.executer();

	}

	public void undo() {

		CommandAdd.remove(CommandAdd.size() - 1);

	}

	public void redo() {

	}
}
