package extra;

public class LLInsertNPos {
    Node head;

    public void insertNPos(int value, int index) {
        if (index == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 1; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Out of bounds");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public static void main(String[] args) {
        LLInsertNPos list = new LLInsertNPos();
        list.insertNPos(1, 1);
        list.insertNPos(2, 2);
        list.insertNPos(4, 3);
        list.insertNPos(3, 3);
        
        list.display();
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
