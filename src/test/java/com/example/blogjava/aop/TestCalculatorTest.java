package com.example.blogjava.aop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCalculatorTest {

    @DisplayName("생성")
    @Test
    void create() {
        // given
        Calculator calculator = new Calculator(10);
        // when
        calculator.add(10);
        // then
        assertThat(calculator.get()).isEqualTo(20);
    }
}