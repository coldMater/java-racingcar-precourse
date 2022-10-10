package racingcar;

import java.util.List;

class RacingCarGame {
    private List<Car> carList;
    private MaxTurnCount maxTurnCount;

    RacingCarGame(List<Car> carList, MaxTurnCount maxTurnCount) {
        this.carList = carList;
        this.maxTurnCount = maxTurnCount;
    }

    public RacingState turnAndGetState() {
        for (Car car : carList) {
            car.move();
        }
        return new RacingState(carList, maxTurnCount);
    }
}
