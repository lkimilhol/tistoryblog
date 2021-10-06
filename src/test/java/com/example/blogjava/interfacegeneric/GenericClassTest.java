package com.example.blogjava.interfacegeneric;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
}
