package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		Student s1=new Student(1,"Rohiht");
		Student s2=new Student(2,"vinay");
		ll.add(s1);
		ll.add(s2);
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			Student s3=(Student)i.next();
			System.out.println(s3.id+" "+s3.name);
		}	
	}
}
class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}}

