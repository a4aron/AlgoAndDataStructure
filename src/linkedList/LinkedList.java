package linkedList;

public class LinkedList <T> {

    Node<T> head;

    public void add(Node node) {
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void delete (T data) {
        Node temp = head;

        if (temp.data.equals(data)) {
            head = head.next;
        }

        while (temp.next != null) {
            if(temp.next.data.equals(data)) {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }

    public static void main(String [] args) {
        LinkedList <String> list = new LinkedList();
        list.display();
        list.add(new Node("arun"));
        list.add(new Node("thapa"));

        list.add(new Node("magar"));
        list.display();

        list.delete("magar");
        list.display();


    }


}
