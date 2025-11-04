public class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    //would normally run in Main file but for brevity I will run in this file
    public static void main(String[] args) {
        //Create Linked with with initial element
        LinkedList myLinkedList = new LinkedList("A");
        //append elements
        myLinkedList.append("B");
        myLinkedList.append("C");
        myLinkedList.append("D");
        //Remove element C at index 2
        System.out.println(myLinkedList.remove(2).element);

    }

    class Node{
        String element;
        Node next;

        Node(String element){
            this.element = element;
        }
    }

    public LinkedList(String element){
        Node newNode = new Node(element);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(String element){
        Node newNode = new Node(element);

        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
        length+=1;
    }

    public Node removeLast(){
        if (length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst(){
        if (length == 0){
            return null;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if (length ==0){;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index > length){
            return null;
        }
        Node temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node remove(int index){
        if (index < 0 || index >= length){
            return null;
        }else if(index == 0){
            return removeFirst();
        }else if (index == length-1){
            return removeLast();
        }else{
            Node prev = get(index-1);
            Node curr = get(index);
            prev.next = curr.next;
            curr.next = null;
            length--;
            return curr;
        }
    }
}

