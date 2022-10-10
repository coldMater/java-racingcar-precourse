package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static List<Car> readCarList() {
        List<Car> carList = new ArrayList<>();
        try {
            String[] carNameArr = Console.readLine().split(",");
            for (String carName : carNameArr) {
                carList.add(new Car(carName));
            }
            return carList;
        } catch (Exception e) {
            System.out.println("[ERROR]" + e);
            return null;
        }
    }

    public static MaxTurnCount readMaxMovingCount() {
        try {
            return new MaxTurnCount(Integer.parseInt(Console.readLine()));
        } catch (Exception e) {
            System.out.println("[ERROR]" + e);
            return null;
        }
    }
}
