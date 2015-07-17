/**
 * 
 */
package dta.ihm;

/**
 * @author ETY
 *
 */
public abstract class ArreterProgrammeAction implements Action{

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getId()
	 */
	public Integer getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getMenu()
	 */
	public String getMenu() {
		// TODO Auto-generated method stub
		return "Arrêter programme";
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#execute()
	 */
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("extinction");
	}

	
}
