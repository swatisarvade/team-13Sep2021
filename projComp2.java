class LL{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	void addLast(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
		}
		else{
			Node trv=head;
			while(trv.next!=null){
				//trv.next=n;
				trv=trv.next;
			}
			trv.next=n;
			n.next=null;
		}
	}
	void display(){
		if(head==null){
			return;
		}
		else{
			Node trv=head;
			while(trv!=null){
				System.out.print(trv.data+" ");
				trv=trv.next;
		}
	}	
}
   void replaceFun(){
	   if(head==null){
		  return; 
	   }
	   else if(head.next==null){
		   //System.out.print(head.data+" ");
		   return;
	   }
	   else{
		   Node prev=head;
		   Node curr=head.next;
		   head=curr;
		   while(true){
			   Node next=curr.next;
			   curr.next=prev;
			   if(next==null || next.next==null){
				   prev.next=next;
				   break;
			   }
			   prev.next=next.next;
			   prev=next;
			   curr=prev.next;
		   }
	   }
   }


}
class projComp2{
	public static void main(String args[]){
		LL link=new LL();
		link.addLast(10);
		link.addLast(20);
		link.addLast(30);
		link.addLast(40);
		//link.display();
		link.replaceFun();
		link.display();
	}
}