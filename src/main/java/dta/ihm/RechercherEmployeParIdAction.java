/**
 * 
 */
package dta.ihm;

/**
 * @author ETY
 *
 */
public abstract class RechercherEmployeParIdAction implements Action {

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getId()
	 */
	public Integer getId() {
		// TODO Auto-generated method stub
		return 2;
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getMenu()
	 */
	public String getMenu() {
		// TODO Auto-generated method stub
		return "Rechercher un employer par Id";
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#execute()
	 */
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Employé");
	}
	
}
