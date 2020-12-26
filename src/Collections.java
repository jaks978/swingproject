import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//_ArrayListMethod();
		
		//_LinkedListMethod();
		//_VectorMethod();
		//_StackMethod();
		//_PrioritQueueMethod();
		//_ArrayDequeMethod();
		//_HashSetMethod();
		//_LinkedHashSetMethod();
		_TreeSetMethod();
	}
	
	public static void _ArrayListMethod()
	{
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void _LinkedListMethod()
	{
		LinkedList<String> al = new LinkedList<String>(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void _VectorMethod()
	{
		Vector<String> al = new Vector(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void _StackMethod()
	{
		Stack<String> al = new Stack(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void _PrioritQueueMethod()
	{
		PriorityQueue<String> al = new PriorityQueue(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void _ArrayDequeMethod()
	{
		Deque<String> al = new ArrayDeque<String>(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");
		
		/*
		 * Iterator itr = al.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		for(String str:al)
		{
			 System.out.println(str);
		}
	}
	
	public static void _HashSetMethod()
	{
		HashSet<String> al = new HashSet<String>(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");		
		
	    Iterator itr = al.iterator(); 
	    while(itr.hasNext()) {
	    System.out.println(itr.next()); }
		 
		
		/*
		 * for(String str:al) { System.out.println(str); }
		 */
	}
	
	public static void _LinkedHashSetMethod()
	{
		LinkedHashSet<String> al = new LinkedHashSet<String>(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");		
		
	    Iterator itr = al.iterator(); 
	    while(itr.hasNext()) {
	    System.out.println(itr.next()); }
		 
		
		/*
		 * for(String str:al) { System.out.println(str); }
		 */
	}
	
	public static void _TreeSetMethod()
	{
		TreeSet<String> al = new TreeSet<String>(); 
		al.add("zebrea");
		al.add("zebrea");
		al.add("yellow");
		al.add("xenon");		
		
	    Iterator itr = al.iterator(); 
	    while(itr.hasNext()) {
	    System.out.println(itr.next()); }
		 
		
		/*
		 * for(String str:al) { System.out.println(str); }
		 */
	}
	
	

}
