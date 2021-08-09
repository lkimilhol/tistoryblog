package com.example.blogjava.object;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValueReferenceTest {

    class Color {
        String name;

        public Color(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @DisplayName("원시값 swap")
    @Test
    void swapPrimitive() {
        // given
        int a = 10;
        int b = 20;
        // when
        swap(a, b);
        // then
        assertThat(a).isEqualTo(10);
        assertThat(b).isEqualTo(20);
    }

    @DisplayName("Integer swap")
    @Test
    void swapInteger() {
        // given
        Integer a = 10;
        Integer b = 20;
        // when
        swap(a, b);
        // then
        assertThat(a).isEqualTo(10);
        assertThat(b).isEqualTo(20);
    }

    @DisplayName("Object swap")
    @Test
    void swapObject() {
        // given
        Object a = new Object();
        Object b = new Object();
        // when
        printReference(a, b);
        // then
        System.out.println("a ori: " + a);
        System.out.println("b ori: " + b);
    }

    @DisplayName("pass-by-value")
    @Test
    void passByValue() {
        // given
        Color 빨강 = new Color("빨강");
        Color 빨강_복제 = 빨강;
        // when
        newColor(빨강);
        // then
        assertThat(빨강.getName()).isEqualTo("빨강");
        assertThat(빨강 == 빨강_복제).isTrue();
    }

    @DisplayName("reference test")
    @Test
    void reference() {
        // given
        Color 빨강 = new Color("빨강");
        // when
        changeColor(빨강);
        // then
        assertThat(빨강.getName()).isEqualTo("파랑");
    }

    private void changeColor(Color color) {
        color.setName("파랑");
    }

    private void newColor(Color color) {
        color = new Color("파랑");
    }

    private void printReference(Object a, Object b) {
        System.out.println("a ref: " + a);
        System.out.println("b ref: " + b);
    }

    private void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
