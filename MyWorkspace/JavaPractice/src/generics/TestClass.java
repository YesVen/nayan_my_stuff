package generics;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		/*TestClass c = new TestClass();
		c.method();*/
	
		List<Cat> cats = new ArrayList<Cat>();
		List<Dog> dogs = new ArrayList<Dog>();
		List<Animal> animals = new ArrayList<Animal>();

		//new TestClass().takeList(cats); // not allowed
		//new TestClass().takeList(dogs); // not allowed
		new TestClass().takeList(animals); 
		
		Dog[] dogsArr = new Dog[2];
		Cat[] catsArr = new Cat[2];
		
		new TestClass().takeArray(dogsArr);
	
	}
	
	
	// example 1.
	public void method() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(67);
		
		method2(list);
		System.out.println(list);
		
	}
	
	public void method2(List list) {
		list.add("abc");
	}

	//example 2
	public void takeList(List<Animal> list) {
		list.add(new Dog());
		list.add(new Cat());
	}
	
	public void takeArray(Animal[] array) {
		array[0] = new Cat();
		array[1] = new Dog();
	}
	

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
