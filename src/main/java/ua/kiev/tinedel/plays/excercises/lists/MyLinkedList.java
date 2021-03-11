package ua.kiev.tinedel.plays.excercises.lists;

public class MyLinkedList<V> implements IList<V> {

    static class Node<V> {
        V data;
        Node<V> next;
    }

    final Node<V> root = new Node<>();

    @Override
    public boolean isEmpty() {
        return root.next == null;
    }

    @Override
    public void add(V element) {
        Node<V> last = findLast();
        last.next = new Node<>();
        last.next.data = element;
    }

    @Override
    public void insert(int position, V element) {
        Node<V> curr = new Node<>();
        curr.data = element;
        curr.next = getByIndex(position);
        getByIndex(position - 1).next = curr;
    }


    @Override
    public V set(int position, V element) {
        Node<V> left = getByIndex(position);
        V data = left.data;
        left.data = element;
        return data;
    }

    @Override
    public V delete(int position) {
        V data;
        Node<V> left = getByIndex(position - 1);
        data = left.next.data;
        left.next = left.next.next;
        return data;
    }

    @Override
    public V get(int position) {
        return getByIndex(position).data;
    }

    @Override
    public int size() {
        int size = 0;
        Node<V> left = root;
        while (left.next != null) {
            left = left.next;
            size++;
        }
        return size;
    }

    @Override
    public Node<V> findLast() {
        Node<V> left = root;
        while (left.next != null) {
            left = left.next;
        }
        return left;
    }

    private Node<V> getByIndex(int position) {
        Node<V> left = root;
        for (int i = 0; i < position+1; i++) {
            if (left.next == null) {
                throw new IndexOutOfBoundsException();
            } else {
                left = left.next;
            }
        }
        return left;
    }
}
