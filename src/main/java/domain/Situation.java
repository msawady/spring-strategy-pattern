package domain;

public class Situation {


    private String trend;

    private boolean neutral;

    public Situation(String trend, boolean neutral) {
        this.trend = trend;
        this.neutral = neutral;
    }

    public String getTrend() {
        return trend;
    }

    public boolean isNeutral() {
        return neutral;
    }

}
