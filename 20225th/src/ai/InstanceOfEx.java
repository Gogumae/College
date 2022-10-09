package ai;

class Person{}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class InstanceOfEx {
	static void print(Person P) {
		if(P instanceof Person)
			System.out.print("Person ");
		if(P instanceof Student)
			System.out.print("Student ");
		if(P instanceof Researcher)
			System.out.print("Researcher ");
		if(P instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() >> \t"); print(new Student());
		System.out.print("new Researcher() >> \t"); print(new Researcher());
		System.out.print("new Professort() >> \t"); print(new Professor());
		
	}
}
