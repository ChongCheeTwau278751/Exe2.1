package Example1;

public class Main{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird Animal1 = new Bird(); 
		System.out.println("There are a kind of bird called " + Animal1.breed + ".");
		System.out.println("There are commonly recognized in " + Animal1.color + " colour.");
		System.out.println("There are mostly " + Animal1.size + " in size.");
		System.out.println("There are classified as " + Animal1.classification + ".");
		Animal1.eat();
		Animal1.sleep();
		Animal1.fly();
		Animal1.climb();
		Animal1.play();
		
		System.out.println();
		
		Dog Animal = new Dog(); 
		System.out.println("There are a kind of dog called " + Animal.breed + ".");
		System.out.println("There are commonly recognized in " + Animal.color + " colour.");
		System.out.println("There are mostly " + Animal.size + " in size.");
		System.out.println("There are classified as " + Animal.type + ".");
		Animal.eat();
		Animal.sleep();
		Animal.sit();
		Animal.work();
		Animal.play();
		Animal.run();
	
	}
}
