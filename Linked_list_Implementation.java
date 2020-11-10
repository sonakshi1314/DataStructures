    
public  class Linked_list_Implementation {
	static class Node{
		 int data;
		 public static  Node next;
		
		   Node(int data){
			   this.data=data;
			  this.next=null;
		   }
  }
	      public static class LinkedList{
	    	  Node head;
	    	  Node tail;
	    	  int size;
	     
	       void  addLast(int val){
	    	  Node newnode=new Node(val);
	    	  Node newnode1=new Node(val);	
	    	  Node newnode2=new Node(val);
	    	  newnode.next=newnode1;
	    	  newnode1.next=newnode2;
	    	  
	    	  
	    	  newnode.data=val;
	    	  newnode.next=null;
	    	  if(size==0) {
	    		tail= head=newnode;
	    		 size++;
	    	  }
	    	  else {
	    		   Node temp;
	    		  temp=head;
	    		  while(temp.next!=null) {
	    	          temp=temp.next;
	    			  temp=tail;
	    			  size++;
	    		  }
	    		  temp.next=newnode;
	    		  tail=newnode;
	    		  newnode=null;
	    		  
	    		  /*
	    		  tail.next=newnode;
	    		  tail=newnode;
	    		  size++;
	    		  */
	    		   }
	    	 }
	       
	       void addFirst(int val) {
	    	      Node newnode=new Node(val);
	    	      newnode.data=val;
		    	  newnode.next=null;
		    	  if(size==0) {
		    		tail= head=newnode;
		    		 size++;
		    	  }
		    	  else {
		    		  newnode.next=head;
		    		  head=newnode;
		    		  size++;
		    	  }
	       }
	       
	       void addAtIndex(int idx,int val) {
	    	   
	    	   if(idx<0 || idx>size)
	    		   System.out.println("Invalid index");
	    	   else if(idx==0) {
	    		   addFirst(val);
	    		   }
	    	   else if(idx==size) {
	    		   addLast(val);
	    	   }
	    	   else {
	    	   
	    	 Node newnode=new Node(val);
	    	 newnode.data=val;
		     newnode.next=null;
		     Node temp=head;
		     for(int i=0;i<idx-1;i++) {
		    	 temp=temp.next;
		     }
		     newnode.next=temp.next;
		     temp.next=newnode;
		     size++;
	       }
	       
	       }  
	       
	       void removeLast() {
	    	   if(size==0) {
	    		   System.out.println("List is empty");
	    	   }
	    	   else if(size==1) {
	    		   head=tail=null;
	    		   size=0;
	    	   }
	    	   else {
	    	   Node temp;
	    	   temp=head;
	    	   while(temp.next!=null) {
	    		   temp=temp.next;
	    	   }
	    	   tail=temp;
	    	   temp.next=null;
	    	   size--;
	    	   
	       }
	       
	       }
	       
	       void removeFirst() {
	    	   if(size==0)
	    		   System.out.println("List is empty");
	    	   else if(size==1) {
	    		head=tail=null;
	    		size=0;
	    	   }
	    	   else {
	    		   head=head.next;
	    		   size--;
	    	   }
	       }
	       
	       void remove_At_Index(int idx) {
	    	   if(idx<0 || idx>size)
	    		   System.out.println("Invalid Index");
	    	   else if(idx==0)
	    		   removeFirst();
	    	   else if(idx==size-1)
	    		   removeLast();
	    	   else {
	    		   Node temp=head;
	    		   for(int  i=0;i<idx-2;i++)
	    			   temp=temp.next;
	    		   temp.next=temp.next.next;
	    		   size--;
	    	   }
	       }
	       
	        void getFirst() {
	        	if(size==0)
	        		System.out.println("List is empty");
	        	else {
	        		System.out.println(head.data);
	        	}
	        }
	       
	       void getLast() {
	    	   if(size==0)
	        		System.out.println("List is empty");
	        	else {
	        		//System.out.println(tail.data);
	        		Node temp=head;
	        		while(temp.next!=null)
	        			temp=temp.next;
	        		 System.out.println(temp.next.data);
	        	}
	    	  
	       }
	       void get_At_Index(int idx) {}
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	  }
            
	      
	      
	  public static void testList(LinkedList list) {
	    	   Node temp=list.head;
	    	     while(temp.next!=null) {
	    	      System.out.println(temp.data);
	    		   temp=temp.next;
	    		   
	    	     }
	    	     System.out.println(list.size);
	    	   if(list.size==1)
	    		   System.out.println(list.head.data);
	  
	  }
	      
	      
	      
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);		
		testList(list);
	}

}
