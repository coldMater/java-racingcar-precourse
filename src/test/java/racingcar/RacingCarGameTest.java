package racingcar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarGameTest {
    @Test
    @DisplayName("자동차의 이름이 중복되었을 때 예외가 발생합니다.")
    void throwToIllegalCarName() {
        CarList carList = new CarList();
        carList.add(new Car("하나"));
        carList.add(new Car("둘"));
        carList.add(new Car("셋"));
        carList.add(new Car("셋"));

        assertThrows(IllegalArgumentException.class, () -> new RacingCarGame(carList, new MaxTurnCount(1)));
    }
}