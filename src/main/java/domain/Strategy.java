package domain;

public interface Strategy {

    boolean needDecision(Situation situation);

    void showDecision(Situation situation);
}
