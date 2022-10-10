package racingcar;

import java.util.List;

class RacingCarGame {
    private List<Car> carList;
    private MaxTurnCount maxTurnCount;

    RacingCarGame(List<String> carNameList, MaxTurnCount maxTurnCount) {
        this.validateCarNameDuplicated(carNameList);
        for (String carName : carNameList) {
            this.carList.add(new Car(carName));
        }
        this.maxTurnCount = maxTurnCount;
    }

    private void validateCarNameDuplicated(List<String> carNameList) {
        carNameList.forEach((String carName) -> this.throwCarNameDuplicatedException(carNameList, carName));
    }

    private void throwCarNameDuplicatedException(List<String> carNameList, String carName) {
        if (carNameList.contains(carName)) {
            throw new IllegalArgumentException("[ERROR] 중복된 이름의 Car 가 포함되어있습니다. 다른 이름으로 지정해주세요.");
        }
    }

    public boolean turn() {
        boolean isGameEnd = false;
        for (Car car : carList) {
            car.move();
            isGameEnd = this.isGameEnd(car.getLocation(), this.maxTurnCount);
        }
        return isGameEnd;
    }

    private boolean isGameEnd(Location location, MaxTurnCount maxTurnCount) {
        return location.getX() >= this.maxTurnCount.getMaxTurnCount();
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
