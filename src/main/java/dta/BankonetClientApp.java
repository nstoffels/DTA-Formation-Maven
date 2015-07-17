/**
 * 
 */
package dta;

/**
 * @author ETY
 *
 */
public class BankonetClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestServerInfoHelper restserverinfohelper = new RestServerInfoHelper(); // instanciation de la classe RestServerInfoHelper()
		String urlactuelle = restserverinfohelper.getRestServerInfo().getBaseUrl();//restserverinfohelper appel la classe getRestServerInfo() qui appel la méthode getBaseUrl() 
		
		System.out.println(""+urlactuelle);
	}

}
