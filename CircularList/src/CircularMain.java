
public class CircularMain
{
	public static void main(String[] args)
	{
		CircularLinkedList c1=new CircularLinkedList();
		c1.insert(150);
		c1.display();
		c1.insert(250);
		c1.display();
		c1.insert(350);
		c1.display();
		c1.insert(30,1);
		c1.display();
		c1.insert(20,2);
		c1.display();
		c1.insert(50,3);
		c1.display();
		c1.insert(65,9);
		c1.display();
		c1.insert(40,1);
		c1.display();
		c1.insert(30);
		c1.display();



		System.out.println("Delete BY Value");
		c1.deleteByVal(30);
		c1.display();
//		System.out.println("Delete BY Position");
//		c1.deleteByPos(1);
//		c1.display();
//		c1.deleteByPos(10);
//		c1.display();

	}
}
