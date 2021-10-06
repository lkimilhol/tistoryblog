package com.example.blogjava.interfacegeneric;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GenericImplementsTest {

    @DisplayName("제네릭 인터페이스 생성 후 값 비교")
    @Test
    void create() {
        // given
        GenericImplements genericImplements = new GenericImplements();
        // when
        Number data = genericImplements.getSquared(5);
//        Number data = genericImplements.getSquared("test");
        // then
        assertThat(data).isEqualTo(25);
    }
}
