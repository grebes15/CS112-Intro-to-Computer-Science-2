
public class QueueDemonstration {

    public static void main(String[] args) {
		
	Object o;
	//output for the ArrayQueue
	ArrayQueue<Integer> A = new ArrayQueue<Integer>(3);//size of the array is 3
	A.size();
	System.out.println("This is the size of the array:" +A);
	A.enqueue(5);
	System.out.println("Enqueuing a 5 onto the Queue:" +A);
	A.size();
	System.out.println("This is the size of the array:" +A.size());
	A.enqueue(3);
	System.out.println("Enqueuing a 3 onto the Queue:" +A);
	A.size();
	System.out.println("This is the size of the array:" +A.size());
	int i1 = A.front();
	System.out.println("Testing the front method: " + i1);
	int i2 = A.dequeue();
	System.out.println("We Just Dequeued a "+ i2);
	int i3 = A.dequeue();
	System.out.println("We just Dequeued a " + i3);
	int i4 = 0;
	//will catch a QueueEmptyException 
	try{
		System.out.println("Attempting to dequeue");
		i4 = A.dequeue();

	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("Caught a QueueEmptyException");
	}
	A.enqueue(15);
	System.out.println("Enqueuing a 15 onto the Queue");
	A.enqueue(30);
	System.out.println("Enqueuing a 30 onto the Queue");
	//will catch a QueueFullException
	try{
		A.enqueue(45);
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("Caught a QueueFullException");
	}

	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println("Now Testing the NodeQueue");
	
	System.out.println();
	//output for the NodeQueue
	NodeQueue<String> B = new NodeQueue<String>();
	B.enqueue("Computer");
	System.out.println("Enqueuing a 'Computer' onto the Queue: " + B);
	B.enqueue("Science");
	System.out.println("Enqueuing a 'Science' onto the Queue:" + B);
	B.enqueue("Is");
	System.out.println("Enqueuing a 'Is' onto the Queue:" + B);
	B.enqueue("Interesting");
	System.out.println("Enqueuing a 'Interesting' onto the Queue:" + B);
	B.size();
	System.out.println("This is the size of the array:" +B.size());
	String s1 = B.front();
	System.out.println("Displays the top of the queue which is: "  + s1);
	String s2 = B.dequeue();
	System.out.println("We just dequeued a: " + s2);
	String s3 = B.dequeue();
	System.out.println("We just dequeued a: " + s3);
	String s4 = B.dequeue();
	System.out.println("We just dequeued a: " + s4);
	String s5 = B.dequeue();
	System.out.println("We just dequeued a: " + s5);
	
	String s6 = "";
	//will catch the QueueEmptyException
	try{
		System.out.println("Attempting to dequeue" + s6);
		s6 = B.dequeue();
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("Caught a QueueEmptyException");
	}
			
    }

}
