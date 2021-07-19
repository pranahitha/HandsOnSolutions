package handson14july;


abstract class Animal
{
	
	public abstract void makeNoise();
	public abstract void eat();
	public void sleep()
	{
		System.out.println("Animals sleep at night");
	}
}
class Feline  implements InterfaceAnimal
{
	public void roam()
	{
		System.out.println("Feline class ");
	}
}
class Hippo extends Animal 
{
	public void makeNoise()
	{
		System.out.println("Hippo makes noise as ghgh");
	}
	public void eat()
	{
		System.out.println("Hippo eats Grass");
	}
}
 class Canine  implements InterfaceAnimal 
{
	public void roam()
	{
		System.out.println("Canine class");
	}
	
}
class Lion extends Feline {
	public void makeNoise()
	{
		System.out.println("Lion makes noise as guhh");
	}
	public void eat()
	{
		System.out.println("Lion Feline are wild eats Non-veg");
	}
}
class Tiger extends Feline {
	public void makeNoise()
	{
		System.out.println("Tiger makes noise as guhh");
	}
	public void eat()
	{
		System.out.println("Tiger Feline are wild eats Non-veg");
	}
}
class Cats extends Feline {
	public void makeNoise()
	{
		System.out.println("Cats makes noise as meow-meow");
	}
	public void eat()
	{
		System.out.println("Feline Cat eats Non-veg and are pet Animals");
	}
}
class Dog extends Canine implements InterfaceAnimal
{
	
		public void makeNoise()
		{
			System.out.println("Dog makes noise as bow-bow");
		}
		public void eat()
		{
			System.out.println("Dog Canine eats Non-veg");
		}
}
class Wolf extends Canine implements InterfaceAnimal
{
		public void makeNoise()
		{
			System.out.println("Wolf makes noise as woooh");
		}
		public void eat()
		{
			System.out.println("Wolf Canine eats Non-veg");
		}
}
public class AbstractInterfaceDemo {
	public static void main(String[] args) {
		Wolf wolf =new Wolf();
		wolf.eat();
		wolf.roam();
		Hippo hippo=new Hippo();
		hippo.eat();
		hippo.sleep();
		Tiger tiger=new Tiger();
		tiger.roam();
		tiger.eat();

}
}

