package racingcar;

import java.util.List;

class RacingCarGame {
    private CarList carList;
    private MaxTurnCount maxTurnCount;

    RacingCarGame(CarList carList, MaxTurnCount maxTurnCount) {
        this.carList = carList;
        this.maxTurnCount = maxTurnCount;
    }

    public RacingState turnAndGetState() {
        for (Car car : carList.getCarList()) {
            car.move();
        }
        return new RacingState(carList, maxTurnCount);
    }
}
