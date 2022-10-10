package racingcar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RacingCarGameTest {
    @Test
    @DisplayName("자동차의 이름이 중복되었을 때 예외가 발생합니다.")
    void throwToIllegalCarName() {
        List<String> carNameList = new ArrayList<>();
        carNameList.add("하나");
        carNameList.add("둘");
        carNameList.add("셋");
        carNameList.add("셋");

        assertThrows(IllegalArgumentException.class, () -> new RacingCarGame(carNameList, new MaxTurnCount(1)));
    }
}