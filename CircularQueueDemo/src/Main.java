public class Main
{
    public static void main(String[] args) {
            CircularQueue c=new CircularQueue(5);
            c.insert(10);
        c.insert(20);
        c.insert(30);
        c.insert(40);
        c.insert(50);
        c.insert(60);
            c.display();
            c.delete();
            c.display();
            c.insert(70);
            c.display();


        System.out.println("Front "+c.getFront());
        System.out.println("Rear "+c.getRear());
    }
}
