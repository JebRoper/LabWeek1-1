/**
 * Created by admin on 3/31/17.
 */
public class LinkedStringListImpl implements StringList {
    private Node head;

    @Override
    public void add(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node newNode = new Node(value);
            temp.setNext(newNode);
        }

    }

    @Override
    public void remove(int index) {


    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            int count = 1;
            while (temp.getNext() != null) {
                temp = temp.getNext();
                ++count;
            }
            return count;
        }
    }

    @Override
    public String get(int index) {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            if (index == 0){
                return temp.getValue();
            }
            int count = 0;
            while (temp.getNext() != null) {
                temp = temp.getNext();
                ++count;
                if (count == index){
                    return temp.getValue();
                }
            }
        }
        return null;

    }


    @Override
    public String toString() {
        return "LinkedStringListImpl{" +
                "head=" + head +
                '}';
    }
}
