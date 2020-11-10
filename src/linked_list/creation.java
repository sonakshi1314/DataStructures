package linked_list;
class Node{
	int data;
	Node next;
}

public class creation {
      
	static Node get_new_node(int data) {
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=null;
		
		return newnode;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Node head=null;
		creation create=new creation();
		 head=create_a_list(12,head);
		 head=create_a_list(1,head);
		 head=create_a_list(13,head);
		 head=create_a_list(2,head);
		 head=create_a_list(19,head);
		 head=create_a_list(11,head);
		 head=create_a_list(14,head);
		 head=create_a_list(21,head);
		 
		
		/*Node first=new Node(12);
		Node second=new Node(1);
		Node third=new Node(13);
		Node fourth=new Node(2);
		Node fifth=new Node(42);
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
	*/	
		
          print(head);
          System.out.println();
          size(head);
          head= insert_at_begnning(76,head);
          print(head);
          System.out.println();
          head= insert_at_given_position(85,3,head);
          print(head);
          System.out.println();
          head=delete_last_node(head);
          print(head);
          System.out.println();
          head=delete_first_node(head);
          print(head);
          System.out.println();
          head=delete_at_given_position(head,3);
          print(head);
          System.out.println();
          boolean ans= search_node_in_list(head,85);
          System.out.println(ans);
      //    head= rotate_clockwise_by_k_nodes(head,3);
       //   print(head);
       //   System.out.println();
          head=rotate_anticlockwise_by_k_nodes(head,4);
          print(head);
          System.out.println();
          Node middle=middle_node_of_list(head);
          System.out.println("data of middle node is:"+middle.data);
          System.out.println();
          head=reverse_a_list_recursively(head);
          print(head);
          System.out.println();
          head=reverse_a_list_iteratively(head);
          print(head);
          System.out.println();
          head=sort_a_list(head);
          print(head);
          System.out.println();
          
	}
    
	
	
	
	private static Node sort_a_list(Node head) {
		if(head==null||head.next==null)
			return head;
		Node temp=head;
		Node mid=middle_node_of_list(head);
		Node a=sort_a_list( head);
		Node b=sort_a_list( mid.next);
		merge(a,b);
		
		return null;
	}








	private static void merge(Node a, Node b) {
		if(a.data<b.data) {
			
		}
		else if(a.data>b.data) {
			
		}
		
	}








	private static Node reverse_a_list_iteratively(Node head) {
		// TODO Auto-generated method stub
		return null;
	}








	private static Node reverse_a_list_recursively(Node head) {
		// TODO Auto-generated method stub
		return null;
	}








	private static Node middle_node_of_list(Node head) {
		if(head==null)
		return null;
		
		Node slow=head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
		
	}








	private static Node rotate_anticlockwise_by_k_nodes(Node head, int i) {
		if(head==null||i<0)
			return null;
			i=i%size(head);
		
		
			Node temp=head;
			int count=1;
			while(count!=i) {
				temp=temp.next;
				count++;
			}
			Node temp1=temp;
			Node head1=temp.next;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=head;
			head=head1;
			temp1.next=null;
		    return head;
	}




	private static Node rotate_clockwise_by_k_nodes(Node head, int i) {
		if(head==null||i<0)
			return null;
		i=i%size(head);
		
		return null;
		
	}








	private static boolean search_node_in_list(Node head, int value) {
		if(head==null)
			return false;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==value)
				return true;
			temp=temp.next;
		}
		
		return false;
	}








	private static Node delete_first_node(Node head) {
		if(head==null)
			return null;
		
	       head=head.next;
	   	
		return head;
	}








	private static Node delete_at_given_position(Node head, int pos) {
		if(head==null)
			return null;
		
		Node temp=head;
		int count=1;
		while(count!=pos-1) {
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
		return head;
	}








	private static Node delete_last_node(Node head) {
		
		if(head==null)
			return null;
		Node temp=head;
		while(temp.next.next!=null)
			temp=temp.next;
		
		temp.next=null;
		
	    return head;
	}








	private static Node insert_at_given_position(int i,int pos, Node temp) {
		Node head=temp;
		if(size(temp)==0) {
			 head=get_new_node( i);
			return temp;
		}
		int value=1;
		while(value!=pos-1) {
			temp=temp.next;
			value++;
		}
		Node temp2=get_new_node( i);
		temp2.next=temp.next;
		temp.next=temp2;
		return head;
	}








	private static int size(Node head) {
		int count=0;
		if(head==null)
			return -1;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}








	private static Node insert_at_begnning(int i,Node temp) {
		
		if(size(temp)==0) {
			Node head=get_new_node( i);
			return temp;
		}
		
			Node head=temp;
			 Node head1=get_new_node( i);
			 head1.next=temp;
			 head=head1;
			 
		
		  return head;
	}








	private static Node create_a_list(int i, Node head) {
	     if(head==null) {
	    	 return get_new_node(i) ;
	     }
	     else {
	    	head.next= create_a_list( i,  head.next);
	     }
	     return head;
	}
	
	
	
	
	
	

	private static void print(Node head) {
		Node temp=head;
		if(temp==null)
			return;
		System.out.print(temp.data+" ");
		print(temp.next);
	}
	
	
	
	
	
}
