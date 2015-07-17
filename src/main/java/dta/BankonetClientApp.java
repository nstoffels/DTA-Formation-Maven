/**
 * 
 */
package dta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;




import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import dta.ihm.Action;
import dta.ihm.ArreterProgrammeAction;

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
//		RestServerInfoHelper restserverinfohelper = new RestServerInfoHelper(); // instanciation de la classe RestServerInfoHelper()
//		String urlactuelle = restserverinfohelper.getRestServerInfo().getBaseUrl();//restserverinfohelper appel la classe getRestServerInfo() qui appel la méthode getBaseUrl() 
//		
//		System.out.println(""+urlactuelle);
		Reflections reflections = new Reflections("dta");

		 Set<Class<? extends Action>> action = reflections.getSubTypesOf(Action.class);
		
		List<Action> list = new ArrayList<Action>();
		
//		TreeSet<Action> actions = new TreeSet<>(new Comparator<Action>() {
//			@Override
//			public int compare(Action o1, Action o2){
//				return o1.getId().compareTo(o2.getId());
//			}
//		});
//		actions.addAll(actions);
		
		
		
		
		Collection.sort(list,(o1,o2)->o1.getId().compareTo(o2.getId()));
		TreeSet<Action> actionsJava8 = new TreeSet<>((o1,o2)->o1.getId().compareTo(o2.getId()));

	}

}
