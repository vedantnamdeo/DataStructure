public class CircularQueue
{
    private int arr[];
    private int size;
    private int front;
    private int rear;

    public int[] getArr()
    {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public CircularQueue(int size) {

        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }
    public boolean isFull()
    {
        if((rear+1)%size==front)
            return true;
        return false;
    }
    public boolean isEmpty()
    {
        if(front==-1 && rear==-1)
            return true;
        return false;
    }
    public boolean insert(int data)
    {
        if(isFull())
            return false;

        if(isEmpty())
        {
            rear=(rear+1) % size;
            arr[rear]=data;
            front=0;
            return true;
        }
        rear=(rear+1) % size;
        arr[rear]=data;
        return true;
    }
    public int delete()
    {
        if(isEmpty())
            return -1;

        front=(front+1)% size;
        return arr[front];
    }
    public void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]+" ");

        }
        System.out.println();
    }
}
