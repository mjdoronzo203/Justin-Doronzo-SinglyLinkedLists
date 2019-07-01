public class SinglyLinkedList {
    public Node head;
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }
        else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        Node secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void printValues(){
        Node n = head;
        while(n != null){
            System.out.println(n + " ");
            n = n.next;
        }
    }
}