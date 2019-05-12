package domain;


import org.springframework.stereotype.Component;

@Component
public class AgainstTrendStrategy implements Strategy {

    @Override
    public boolean needDecision(Situation situation) {
        return !situation.isNeutral();
    }

    @Override
    public void showDecision(Situation situation) {
        System.out.print("Analysis by AgainstTrendStrategy: ");
        System.out.println(situation.getTrend().equals("up") ? "Lets Sell!" : "Lets Buy!");
    }
}
