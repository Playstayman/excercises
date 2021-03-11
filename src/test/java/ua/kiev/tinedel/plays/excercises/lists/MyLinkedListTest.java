package ua.kiev.tinedel.plays.excercises.lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MyLinkedListTest {

    @Test
    void testNewList_shouldBeEmpty() {
        assertThat(new MyLinkedList<String>().size()).isEqualTo(0);
    }

    @Test
    void testNewListWithOneElement_shouldHaveSize1() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("new string");

        assertThat(list.size()).isEqualTo(1);
    }

    @Test
    void testGet() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(2);
        assertThat(list.get(2)).isEqualTo(3);
    }

    @Test
    void testLastAndAdd() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertThat(list.findLast().data).isEqualTo(3);
    }

    @Test
    void testInsertAndGet() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(1, 10);

        assertThat(list.get(1)).isEqualTo(10);
        assertThat(list.get(2)).isEqualTo(2);
    }

    @Test
    void testDelete() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertThat(list.delete(1)).isEqualTo(2);
        assertThat(list.get(1)).isEqualTo(3);
    }

    @Test
    void testSetAndGet() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertThat(list.set(1, 10)).isEqualTo(2);
        assertThat(list.get(1)).isEqualTo(10);
    }

    @Test
    void testGetOutOfBound() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertThatThrownBy(() -> list.get(1)).isExactlyInstanceOf(IndexOutOfBoundsException.class);
    }
}