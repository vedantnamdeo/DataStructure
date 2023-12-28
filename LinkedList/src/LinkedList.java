
    public class LinkedList {
        private Node head;

        public LinkedList() {
            this.head = null;
        }

        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }


        public boolean insert(int data) {
            Node newNode = new Node(data);
            if (newNode == null) //can be due to memory allocation failure of data
            {
                System.out.println("Data not inserted");
                return false;

            }
            if (head == null) {
//            Initially head is null,i.e.,Linked List Empty
//            for 1st Insertion
                head = newNode;
                return true;

            }
            Node last = head;//Linked List is not empty so to insert at the end
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
            return true;
        }

        public void display() {
            Node temp = head; //if data is inserted then newNode will be the head ,it will display it
            //if data not inserted then head is null,so it doesn't display

            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();

            }
            //  or for excluding last node
//        if(temp==null || temp.getNext()==null) //either list is empty or has only one node
//            return ;//return without performing further operations
//        while(temp.getNext()!=null)
//        {
//            System.out.println(temp.getData()+" ");
//            temp=temp.getNext();
//        }
        }

        public boolean insert(int data, int position) {
            Node newNode = new Node(data);
            if (position == 1) {
                newNode.setNext(head);
                head = newNode;
                return true;
            }

                Node prev = head;
                for (int i = 1; i < position - 1; i++) {
                    prev = prev.getNext();

                }
                newNode.setNext(prev.getNext());
                prev.setNext(newNode);

            return true;

        }
        public boolean deleteByVal(int data)
        {
           Node prev=head;
           Node del=head;
           if(del==null)
           {
               return false;
           }
           if(del.getData()==data)
           {
               head=del.getNext();
               return true;

           }
           while(del.getData()!=data)
           {
               prev=del;
               del=del.getNext();
           }
           prev.setNext(del.getNext());
            return true;
        }
        public boolean deleteByPos(int position)
        {
            Node del=head;
            if(position==1)
            {
                head=del.getNext();
                return true;
            }
            Node prev=head;
            for(int i=1;i<position-1;i++)
            {
                prev=prev.getNext();

            }
            del=prev.getNext();
           prev.setNext(del.getNext());
            return true;
        }
        //Using recursion
        public void displayRev(Node lastNode)
        {

           if(lastNode==null)
           {
               System.out.println();
               return;
           }
            displayRev(lastNode.getNext());
            System.out.print(lastNode.getData()+" ");
        }
        //Using simple method
        public int size()
        {
            int count=0;
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.getNext();
            }
            return count;
        }
        public void displayRev()
        {
            //Using array

//            Node temp=head;
//            int size=size();
//            int arr[]=new int[size];
//           for(int i=0;i<size;i++)
//            {
//                arr[i]=temp.getData();
//                temp=temp.getNext();
//            }
//           for(int i=size-1;i>=0;i--)
//           {
//               System.out.print(arr[i]+" ");
//           }
            rev();
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }


        }
        public void rev()
        {
            //using 3 nodes

            Node prev=null;
            Node temp=head;
            Node next;

            while(temp!=null)
            {
                next=temp.getNext();
                temp.setNext(prev);
                prev=temp;
                temp=next;

            }
            head=prev;

        }



}