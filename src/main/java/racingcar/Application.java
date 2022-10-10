package racingcar;

public class Application {
    public static void main(String[] args) {
        CarList carList = null;
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

        RacingState racingState = new RacingState(carList, maxTurnCount);
        while (!racingState.isRacingEnd()) {
            racingState = racingCarGame.turnAndGetState();
            OutputView.showGameState(carList);
        }

        OutputView.printFinalResult(racingState);
    }
}
