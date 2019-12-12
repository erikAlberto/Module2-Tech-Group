package data_structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private Integer size;

    MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
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

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Node node = new Node(t);
        if (first == null){
            first = node;
            last = node;
            size++;
        }
        else {
            this.last.setNext(node);
            last = node;
            size++;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        Node current = first;
        Node temp = first;
        while (temp != null) {
            if (temp.getValue().equals(o)) {
                //current.setNext(current.getNext());
                first = current.getNext();
                last = first;
                size--;
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
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

    /*@Override
    public T get(int index) {
        Node<T> current = first;
        for (int i = 0; i < this.size; i++) {
            if (i == index){
                return  current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }*/

    @Override
    public T get(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> auxNode = first;

        for (int i = 0; i < index; i++) {
            auxNode = auxNode.getNext();
        }

        return auxNode.getValue();
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        String value = "[";
        Node nodeAux = first;
        while(nodeAux != null){
            if (nodeAux == last){
                value = value + nodeAux.getValue().toString();
            }
            else {
                value = value + nodeAux.getValue().toString() + ", ";
            }
            nodeAux = nodeAux.getNext();
        }
        return value + "]";
    }
}
