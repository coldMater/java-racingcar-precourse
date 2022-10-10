package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Objects;

public class Car {
    private Location location;
    private String name;

    Car(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("자동차의 이름이 5글자를 초과하였습니다. 5글자 이하의 자동차 이름을 입력해주세요. input:" + name);
        this.location = new Location();
        this.name = name;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum > 3) {
            this.location.moveForward();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
