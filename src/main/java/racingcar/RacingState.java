package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingState {
    List<Car> winner = new ArrayList<>();

    RacingState(CarList carList, MaxTurnCount maxTurnCount) {
        carList.getCarList().forEach((Car car) -> {
            if (car.getLocation().getX() >= maxTurnCount.getMaxTurnCount()) {
                winner.add(car);
            }
        });
    }

    public boolean isRacingEnd() {
        return this.winner.size() > 0;
    }
}
