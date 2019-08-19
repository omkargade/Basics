/*
 * Collections, Set, List, map, etc etc
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable{
	int roll_no;
	String name;
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}
	@Override
	public int compareTo(java.lang.Object arg0) {
		// compare it
		return 0;
	}
	
	
}

public class CollectionDemo {

	public static void main(String[] args) {
		Collection values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(2);
		
		Iterator it = values.iterator();
		
		//while(it.hasNext())
			//System.out.println(it.next());
		
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(4); 
		list.add(2,3);
		Collections.sort(list);
		//for(int i=0;i<list.size();i++)
			//System.out.println(list.get(i));
		
		List<Student> student = new ArrayList();
		student.add(new Student(1,"Chamman Jhinga"));
		student.add(new Student(2,"Ibu Hatela"));
		//for(Student s : student)
			//System.out.println(s);
		
		Set<Integer> set = new HashSet(); //random
		set.add(5);
		set.add(9);
		set.add(9);
		//for(int i : set)
			//System.out.println(i);
		
		Set<Integer> set1 = new TreeSet(); //sorts in accending order
		set1.add(5);
		set1.add(9);
		set1.add(2);
		//for(int i : set1)
			//System.out.println(i);
		
		Map<String,String> map = new HashMap();//HashTable can also be used for synchronized
		map.put("key", "Jhinga");
		map.put("kya","Ibu Hatela");
		//System.out.println(map.get("key"));
	}

}
