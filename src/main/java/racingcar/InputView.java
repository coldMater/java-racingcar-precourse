package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static CarList readCarList() {
        CarList carList = new CarList();
        try {
            String read = Console.readLine();
            String[] carNameArr = read.split(",");
            for (String carName : carNameArr) {
                carList.add(new Car(carName));
            }
            return carList;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR]" + e.getMessage());
            return null;
        }
    }

    public static MaxTurnCount readMaxMovingCount() {
        try {
            return new MaxTurnCount(Integer.parseInt(Console.readLine()));
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR]" + e.getMessage());
            return null;
        }
    }
}
