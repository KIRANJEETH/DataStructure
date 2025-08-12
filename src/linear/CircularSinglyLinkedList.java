package linear;

class CSnode {
    int data;
    CSnode next;

    CSnode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CSmethods {
    static CSnode head, tail;
    static int length = 0;

    public static void InsertAtBegin(int data) {
        CSnode newNode = new CSnode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    
    public static void display() {
        CSnode temp = head;
        do{
            System.out.println(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
    }
}

public class CircularSinglyLinkedList extends CSmethods {
    public static void main(String[] args) {
        InsertAtBegin(35344);
        InsertAtBegin(7546);
        InsertAtBegin(935465);
        InsertAtBegin(568);
        InsertAtBegin(654);
        InsertAtBegin(77);
        display();
    }
}
