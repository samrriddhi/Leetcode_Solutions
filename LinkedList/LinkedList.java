public class LinkedList{
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    public void PrintList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public int size(){
        int count =0;
        Node current =head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public boolean search(int key){
        Node current= head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current=current.next;
            
        }
        return false;
    }
    public void insertatIndex(int index,int data){
        Node newNode=new Node(data);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++){
            if(current==null){
                throw new IndexOutOfBoundsException("Index: "+index);
            }
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        Node n1=list.new Node(10);
        Node n2=list.new Node(20);  
        Node n3=list.new Node(30);
        list.head=n1;
        n1.next=n2;
        n2.next=n3;
        list.PrintList();
        System.out.println("Size of the list: "+list.size());
        System.out.println("Searching for 20: "+list.search(20));
        System.out.println("Inserting 15 at index 1");
        list.insertatIndex(1, 15);
        list.PrintList();
    }
}