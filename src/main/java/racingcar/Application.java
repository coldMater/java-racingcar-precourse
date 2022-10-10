package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> carList = null;
        MaxTurnCount maxTurnCount = null;

        while (carList == null) {
            OutputView.inputCarNames();
            carList = InputView.readCarList();
        }

        while (maxTurnCount == null) {
            OutputView.inputMaxMovingCount();
            maxTurnCount = InputView.readMaxMovingCount();
        }

        RacingCarGame racingCarGame = new RacingCarGame(carList, maxTurnCount);

        OutputView.showResult();

        while (!racingCarGame.turnAndGetIsGameEnd()) {
            OutputView.showGameState(carList);
        }

        OutputView.showGameState(carList);
        String result = "최종우승자: ";
        List<String> winner = new ArrayList<>();
        for (Car car : carList) {
            if (car.getLocation().getX() >= maxTurnCount.getMaxTurnCount()) winner.add(car.getName());
        }

        System.out.println();
        System.out.println("최종우승자: " + String.join(",", winner));
    }
}
