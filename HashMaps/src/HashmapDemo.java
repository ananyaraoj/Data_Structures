import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Chiranjeevi", 700);
		m.put("Balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("Nagarjuna", 500);
		
		//System.out.println(m);// {Chiranjeevi=700, Balaiah=800, Venkatesh=200, Nagarjuna=500}
		
		//System.out.println(m.put("Chiranjeevi", 10000));
		
		Set s = m.keySet();
	//	System.out.println(s);// [Chiranjeevi, Balaiah, Venkatesh, Nagarjuna]

		
		Collection c = m.values();
		//System.out.println(c);// [700, 800, 200, 500]
		
		Set s1 = m.entrySet();
		//System.out.println(s1);// [Chiranjeevi=700, Balaiah=800, Venkatesh=200, Nagarjuna=500]
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) {
		  Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + "........" + m1.getValue());
			if(m1.getKey().equals("Nagarjuna"))
			{
				m1.setValue(100000);
			}
			
			
		}
		
		System.out.println(m);
		
		
		
				
	}

}
