package data_structures;

public class DoublyCircularLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private Integer size;

    public DoublyCircularLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Node<T> add(T value) {
        Node newNode = new Node<>(value);
        if (first == null){
            this.first = newNode;
            this.first.setNext(null);
            this.first.setPrevious(null);
            last = first;
        }
        else {
            last.setNext(newNode);
            newNode.setPrevious(last);
            newNode.setNext(null);
            this.last = newNode;
        }
        size++;
        return newNode;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        Node<T> current = first;
        for (int i = 0; i < this.size; i++) {
            if (i == index){
                return  current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }


    public boolean contains(Object o) {
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void clear() {
        Node nodeAux = first;
        for(int i =0; i< size;i++) {
            Node aux = nodeAux.getNext();
            nodeAux.setNext(null);
            nodeAux.setValue(null);
            nodeAux = aux;
        }
        size= 0;
        last=null;
        first=null;
    }
}
