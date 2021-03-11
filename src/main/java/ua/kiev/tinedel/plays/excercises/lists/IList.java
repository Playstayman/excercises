package ua.kiev.tinedel.plays.excercises.lists;

public interface IList<V> {
    int add(V element);
    void insert(int position, V element);
    V set(int position, V element);
    V delete(int position);
    V get(int position);
    int size();
}
