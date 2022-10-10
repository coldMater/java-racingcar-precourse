package racingcar;

import java.util.List;

class RacingCarGame {
    private List<Car> carList;
    private MaxTurnCount maxTurnCount;

    RacingCarGame(List<Car> carList, MaxTurnCount maxTurnCount) {
        this.carList = carList;
        this.maxTurnCount = maxTurnCount;
    }

    public boolean turnAndGetIsGameEnd() {
        boolean isGameEnd = false;
        for (Car car : carList) {
            car.move();
            isGameEnd |= this.isGameEnd(car.getLocation(), this.maxTurnCount);
        }
        return isGameEnd;
    }

    private boolean isGameEnd(Location location, MaxTurnCount maxTurnCount) {
        return location.getX() >= maxTurnCount.getMaxTurnCount();
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
