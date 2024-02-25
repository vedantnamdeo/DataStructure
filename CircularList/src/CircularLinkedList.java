
public class CircularLinkedList 
{
	private Node head;

	public CircularLinkedList() 
	{
		this.head = null;
	}

	public Node getHead() 
	{
		return head;
	}

	public void setHead(Node head) 
	{
		this.head = head;
	}
	
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=newNode;
			newNode.setNext(head);
			return true;
		}
		Node last=head;
		while(last.getNext()!=head)
		{
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	public boolean insert(int data,int position)
	{
		Node newNode=new Node(data);

		if(position==1)
		{
			if(head==null)
			{
				head=newNode;
				newNode.setNext(newNode);
				return true;
			}

			newNode.setNext(head);
			Node last=head;
			while (last.getNext()!=head)
			{
				last=last.getNext();
			}
			last.setNext(newNode);
			head=newNode;
			return true;
		}
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
//			if(prev==head)
//			{
//				return false;
//			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}


	public boolean deleteByVal(int data)
	{

		if(head==null)
		{
			return false;
		}
		if(head.getData()==data)
		{
			if(head.getNext()==head)
			{
				head=null;
				return true;
			}
			Node last=head;
			while(last.getNext()!=head)
			{
				last=last.getNext();
			}
			last.setNext(head.getNext());
			head=head.getNext();
				return true;


		}
		Node prev=head;
		Node del=head;
		while(del.getData()!=data)
		{
			prev=del;
			del=del.getNext();
			//it means that del value is not found until the end ,so deletion failed
			if(del==head)
			{
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	public boolean deleteByPos(int position)
	{
		Node del=head;
		if(head==null)
		{
			return false;
		}
		if(position==1)
		{
				if(head.getNext()==head)
				{
					head=null;
					return true;
				}
				Node last=head;
				while(last.getNext()!=head)
				{
					last=last.getNext();
				}
				last.setNext(head.getNext());
				head=head.getNext();
				return true;
		}
		Node prev=head;
		for(int i=1;i<position;i++)
		{
			prev=del;
			del=del.getNext();
		}
		prev.setNext(del.getNext());

		return true;
	}

	public void display()
	{
		Node temp=head;
//		while(temp.getNext()!=head)
//		{
//			System.out.print(temp.getData()+" ");
//			temp=temp.getNext();
//
//		}
		do{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		while(temp!=head);
		System.out.println();
	}
	
}
