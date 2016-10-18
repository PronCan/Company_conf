import java.awt.List;
import java.util.*;

public class Test {

	public static void main(String args[]) {
		//static int argCount = args.length;
		
//		Person a = new Person();
//		a.setAge(10);
//		a.setName("Alice");
//		
//		Person b = new Person();
//		b.age = 10;
//		a.name = "Jhon";
//		
//		print(a);
//		print(b);
	}
	
	private static void print(Person p) {
		System.out.println("name : " + p.name + ", age : " + p.age);
	}
	
	class Person {
		private String name;
		private int age;
		
		public Person() {
			
		}
		
		public Person(int age) {
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public String setName(String name) {
			return this.name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
	}
}
