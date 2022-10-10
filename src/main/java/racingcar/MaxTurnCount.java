package racingcar;

public class MaxTurnCount {
    private int maxTurnCount;

    MaxTurnCount(int maxTurnCount) {
        if (maxTurnCount <= 0) throw new IllegalArgumentException("[ERROR] 최대 이동횟수는 1 이상의 정수이어야 합니다.");
        this.maxTurnCount = maxTurnCount;
    }

    public int getMaxTurnCount() {
        return maxTurnCount;
    }
}
