package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    List<Car> carList = new ArrayList<>();

    public void add(Car car) {
        if (carList.contains(car)) throw new IllegalArgumentException("[ERROR] 중복된 자동차의 이름이 존재합니다.");
        this.carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
