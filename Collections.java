import java.util.*;
public class Collections {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ArrayList");  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}
		LinkedList<String> al=new LinkedList<String>();  
		al.add("LinkedList");  
		Iterator<String> itr1=al.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
		Vector<String> v=new Vector<String>();  
		v.add("Vector");   
		Iterator<String> itr2=v.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}
		Stack<String> stack = new Stack<String>();  
		stack.push("Stack");  
		Iterator<String> itr3=stack.iterator();  
		while(itr3.hasNext()){  
		System.out.println(itr3.next());  
		}  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("PriorityQueue");    
		Iterator<String> itr4=queue.iterator();  
		while(itr4.hasNext()){  
		System.out.println(itr4.next());  
		}  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Deque");  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		HashSet<String> set=new HashSet<String>();  
		set.add("HashSet");    
		Iterator<String> itr5=set.iterator();  
		while(itr5.hasNext()){  
		System.out.println(itr5.next());  
		}  
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set.add("LinkedHashSet");    
		Iterator<String> itr6=set1.iterator();  
		while(itr6.hasNext()){  
		System.out.println(itr6.next());  
		}  
		TreeSet<String> set3=new TreeSet<String>();  
		set.add("TreeSet");  
		Iterator<String> itr7=set3.iterator();  
		while(itr7.hasNext()){  
		System.out.println(itr7.next());  
		}  

	}
}
