package composition;

public class Driver {

	public static void main(String[] args) {

Animal animal = new Animal();

animal.setBody("round", 2);

Head head = new Head();

head.setColorOfEyes("blue");
head.setColorOfHair("black");

animal.setHead(head);

System.out.println(animal.getBody().getType() +" " + animal.getBody().getNumOfLegs());
System.out.println(animal.getHead().getColorOfEyes() + " " + animal.getHead().getColorOfHair());
	}

}
