class MyLinkedList {
    ListNode head ;
    
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        ListNode curr=head;
        for(int i = 0;i<index;i++){
            if(curr==null){
                return -1;
            }
            curr=curr.next;
        }
        if(curr==null){
            return -1;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
    
        newNode.next=head;
        head=newNode;

    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
    
        curr.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        ListNode curr= head;
        for(int i = 0 ; i<index-1;i++){
            if(curr==null){
                return;
            }
            curr=curr.next;

        }
        if(curr==null){
            return;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        ListNode curr=head;
        if(head==null){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        for(int i = 0;i<index-1;i++){
            if(curr==null){
                return;
            }
            curr=curr.next;
        }
        if(curr==null || curr.next==null){
                return;
        }
        curr.next=curr.next.next;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */