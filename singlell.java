
//Linked list program 
public class singlell{
    class node{
        int data;
        node next;
        node(){//constructor
        this.data=item;
        this.next=null;

        }
    }
    public node head = null;
    void insert(int x){
        node newnode=new node(x);
        if(head==null)
        head=newnode;
    }else{
        newnode.next=head;
        head=newnode;
   }
}
void dispaly(){
    if(head==null)
        System.out.println(x: "list is empty");
        else{
            node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }    
    }
     public static void main(String[] args){
        singlell = new.singlell();
        s.insert(x:10);
         s.insert(x:20);
          s.insert(x:30);
           s.display();

     }
}