package racingcar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    @DisplayName("자동차의 이름이 5글자를 넘었을 때 예외가 발생합니다.")
    void carNameMax5() {
        assertThrows(IllegalArgumentException.class, () -> new Car("자동차의이름"));
    }
}