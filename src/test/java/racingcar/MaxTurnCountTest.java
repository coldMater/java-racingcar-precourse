package racingcar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxTurnCountTest {
    @Test
    @DisplayName("이동횟수로 0 이하의 값이 들어오는 경우 예외가 발생합니다.")
    void maxTurnCountMustBeLargerThan0() {
        assertThrows(IllegalArgumentException.class, () -> new MaxTurnCount(0));
    }
}