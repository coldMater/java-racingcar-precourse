package racingcar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LocationTest {
    @Test()
    @DisplayName("생성된 로케이션은 최초로 0을 가리켜야 합니다.")
    void Location_generation() {
        Location location = new Location();
        assertEquals(location.getX(), 0);
    }

    @Test
    @DisplayName("Location 에서 전진할 때마다 위치는 1씩 증가합니다.")
    void Location_move_forward() {
        Location location = new Location();
        location.moveForward();
        assertEquals(location.getX(), 1);
        location.moveForward();
        assertEquals(location.getX(), 2);
        location.moveForward();
        assertEquals(location.getX(), 3);
    }

}