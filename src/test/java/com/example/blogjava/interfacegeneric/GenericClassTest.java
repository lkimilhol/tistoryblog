package com.example.blogjava.interfacegeneric;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GenericClassTest {

    @DisplayName("제네릭 생성 테스트")
    @Test
    void create() {
        // given
        GenericClass<String> genericClass = new GenericClass<>();
        final String input = "test";
        // when
        genericClass.setData(input);
        String data = genericClass.getData();
        // then
        assertThat(data).isEqualTo(input);
    }

    @DisplayName("제네릭 에러 테스트")
    @Test
    void parse() {
        // given
        UseClass useClass = new UseClass();
        // when
        // then
        assertThatThrownBy(useClass::exceptionExample).isInstanceOf(ClassCastException.class);
    }

    @DisplayName("제네릭 메서드 테스트")
    @Test
    void method() {
        // given
        // when
        Set<Integer> set = GenericClass.genericMethod(100);
        set.add(100);
        // then
        assertThat(set.size()).isEqualTo(1);
    }
}
