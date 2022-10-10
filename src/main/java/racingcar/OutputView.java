package racingcar;

import java.util.List;

public class OutputView {
    public static void inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void inputMaxMovingCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public static void showResult() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void showGameState(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car.getName() + ": " + getProgressAsMinusSign(car.getLocation()));
        }
        System.out.println();
    }

    private static String getProgressAsMinusSign(Location location) {
        StringBuilder progressAsMinusSign = new StringBuilder();
        for (int i = 0; i < location.getX(); i++) {
            progressAsMinusSign.append("-");
        }
        return progressAsMinusSign.toString();
    }
}
