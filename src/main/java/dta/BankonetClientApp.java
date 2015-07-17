/**
 * 
 */
package dta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
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
		RestServerInfoHelper restserverinfohelper = new RestServerInfoHelper(); // instanciation de la classe RestServerInfoHelper()
		String urlactuelle = restserverinfohelper.getRestServerInfo().getBaseUrl();//restserverinfohelper appel la classe getRestServerInfo() qui appel la méthode getBaseUrl() 
		
		System.out.println(""+urlactuelle);
		
		Reflections reflections = new Reflections("dta");

		 Set<Class<? extends Action>> actions = reflections.getSubTypesOf(Action.class);
		
		List<Action> list = new ArrayList<Action>();
		
//		TreeSet<Action> actions = new TreeSet<>(new Comparator<Action>() {
//			@Override
//			public int compare(Action o1, Action o2){
//				return o1.getId().compareTo(o2.getId());
//			}
//		});
//		actions.addAll(actions);
		
		/*
		 * 
		 * à finir
		 * 
		 */
		for (Class<? extends Action> subType : actions){ 
 			 
 			try { 
 				Action newInstance = subType.newInstance(); 
 				list.add(newInstance); 
 			} catch (InstantiationException e) { 
 				// TODO Auto-generated catch block 
 				e.printStackTrace(); 
 			} catch (IllegalAccessException e) { 
 				// TODO Auto-generated catch block 
 				e.printStackTrace(); 
 			} 
 			 
     	} 
 
		Collections.sort(list,(o1,o2)->o1.getId().compareTo(o2.getId()));
		//TreeSet<Action> actionsJava8 = new TreeSet<>((o1,o2)->o1.getId().compareTo(o2.getId()));
		
		for (Action instance : list){ 
 			System.out.println(instance.getId().toString() +" "+ instance.getMenu()); 
 		} 
 		 
 		Scanner sc = new Scanner(System.in); 
 		Integer choice = sc.nextInt(); 
 		sc.close(); 
 		 
 		for (Action instance : list ) 
 		{ 
 			if (choice == instance.getId()) 
 			{ 
 				instance.execute(); 
 			} 
 		} 


	}

}
