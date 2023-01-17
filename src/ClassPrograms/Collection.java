package ClassPrograms;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
	ArrayList obj = new ArrayList();
		obj.add("Priya");
		obj.add("Akshata");
		obj.add("Poo");
		obj.add("sadam");
		obj.add("Suhaib");

		System.out.println(obj);
		System.out.println(obj.get(3));
		
		obj.add(1, "Sommera");
		System.out.println(obj);
		
		obj.remove("sadam");
		System.out.println(obj);
		
		System.out.println(obj.contains("sadam"));
		
		obj.add("Sommera");
		//obj.removeAll(obj);
		System.out.println(obj);
		
		System.out.println(obj.get(3));
		
		obj.add(6, "Aarthi");
		System.out.println(obj);
		
		System.out.println();
		obj.add(10);
		System.out.println(obj);



		for (int i =0; i<obj.size();i++)
		{
		System.out.println(obj.get(i));
		}
		
		

		//HashSet
		   
		/*HashSet obj = new HashSet();
		obj.add("Rohini");
		obj.add("saritha");
		obj.add("sravanthi");
		obj.add("Anees");
		obj.add("Anusha");
		obj.add("sravanthi");
		obj.add(100);
		obj.add("Rohini");

		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.remove("Anees"));
		System.out.println(obj);
		//System.out.println(obj.isEmpty());
		//System.out.println(obj.removeAll(obj));
		//System.out.println(obj.isEmpty());

		System.out.println(obj);
		Iterator i = obj.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());

		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		*/


		//HashMAP
	/*	HashMap obj = new HashMap();
		obj.put(0, "Testing");
		obj.put(2, "Selenium");
		obj.put(10, "Automation");
		obj.put(45, "Training");


		System.out.println(obj);
		System.out.println(obj.get(10));
		obj.put(2, "Anees");

		Set sm = obj.entrySet();
		System.out.println(sm);
		System.out.println(obj.get(10));

		Iterator i = sm.iterator();
	/*	System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());    */   /////or while

	/*	while (i.hasNext())
		{
		Map.Entry mp = (Entry)i.next();
		//System.out.println(mp.getKey());
		System.out.println(mp.getValue());

		}
*/
		}

		

	}


