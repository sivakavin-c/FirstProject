import java.util.*;
public class Maps {
	@SuppressWarnings("rawtypes")
	public static void main(String[]args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();  
	    map.put(1,"HashMap");  
	    Set<?> set=map.entrySet(); 
	    Iterator<?> itr=set.iterator();  
	    while(itr.hasNext()){   
			Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	    
	    LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
	    hm.put(2,"LinkedHashMap");   
	    for(Map.Entry m:hm.entrySet()){  
	     System.out.println(m.getKey()+" "+m.getValue());  
	    }  
	    
	    TreeMap<Integer,String> map1=new TreeMap<Integer,String>();    
	    map1.put(3,"TreeMap");    
	    for(Map.Entry m:map1.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	    }    
	}
}
