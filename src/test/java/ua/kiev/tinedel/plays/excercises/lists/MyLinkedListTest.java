package ua.kiev.tinedel.plays.excercises.lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}