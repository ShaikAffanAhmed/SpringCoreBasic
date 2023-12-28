package oops;

public class Archer extends GameCharacter
{
   
	@Override
	public void Attack() 
	{
		System.out.println("Archer Attack Like :"+" "+"He will attack Through Arrow");
	}
	@Override
	public void Defend()
	{
		System.out.println("Archer Defend Like :"+" "+"Defend Less Compare to wizard");
	}

	public static void main(String[] args) 
	{
		Knight k = new Knight();
		k.Attack();
		k.Defend();
		System.out.println("");
		
		Wizard w = new Wizard();
		w.Attack();
		w.Defend();
		System.out.println("");
		
		Archer a= new Archer();
		a.Attack();
		a.Defend();

	}

}
