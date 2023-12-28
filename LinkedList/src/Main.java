public class Main
{
    public static void main(String args[])
    {
        LinkedList l1=new LinkedList();
        l1.display();
        l1.insert(14);
        l1.insert(19);
        l1.insert(10);
        System.out.println("Displaying all inserted data");
        l1.display();
        System.out.println();
        System.out.println("-----------------");
        System.out.println("At position 1");
        l1.insert(30,1);
        l1.insert(40,1);
        l1.insert(60,1);
        l1.display();
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Insert At specified position");
         l1.insert(70,5);
//         l1.insert(80,4);
        l1.display();
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Delete For specified Value");
        l1.deleteByVal(60);
        l1.display();
        System.out.println();
        l1.deleteByVal(19);
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Delete at specified Position");
        l1.deleteByPos(4);
        l1.display();
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Display in Reverse");
//        l1.displayRev(l1.getHead());
        l1.displayRev();

    }
}
