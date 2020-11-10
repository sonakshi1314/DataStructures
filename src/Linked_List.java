import java.util.LinkedList;
  
class Linked_Node
{
	int data;
	Linked_Node next;
	Linked_Node(int d){
		data=d;
		next=null;
	}
}
    
public class Linked_List {
	
	public static int count1=0;
	public static void main(String[] args) {
		  Linked_Node first=new Linked_Node(10);
		  Linked_Node second=new Linked_Node(20);
		  Linked_Node third=new Linked_Node(30);
		  Linked_Node fourth=new Linked_Node(40);
		  Linked_Node fifth=new Linked_Node(50);
		  first.next=second;
		  second.next=third;
		  third.next=fourth;
		  fourth.next=fifth;
		  fifth.next=null;
		  Linked_Node head=first;
		  Linked_Node temp=first;
		  int elements=0;
		  while(temp!=null)
		  {
			  elements=elements+1;
			  //System.out.println(temp.data);
			  temp=temp.next;
		  }
		  System.out.println(elements);
		  int mid=elements/2;
		  int a=0;
		  temp=first;
		  while(a!=mid)
		  {
			  a=a+1;
			  System.out.println(temp.data);
			  temp=temp.next;
			  
		  }
		  System.out.println("Mid data  " + temp.data);

	}
	
}

	