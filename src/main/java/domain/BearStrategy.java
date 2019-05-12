package domain;

import org.springframework.stereotype.Component;

@Component
public class BearStrategy implements Strategy {

    @Override
    public boolean needDecision(Situation situation) {
        return situation.isNeutral();
    }

    @Override
    public void showDecision(Situation situation) {
        System.out.print("Analysis by BearStrategy: ");
        System.out.println("Lets Sell!");
    }
}
