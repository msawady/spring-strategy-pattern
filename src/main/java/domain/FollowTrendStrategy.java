package domain;


import org.springframework.stereotype.Component;

@Component
public class FollowTrendStrategy implements Strategy {

    @Override
    public boolean needDecision(Situation situation) {
        return true;
    }

    @Override
    public void showDecision(Situation situation) {
        System.out.print("Analysis by FollowTrendStrategy: ");
        System.out.println(situation.getTrend().equals("up") ? "Lets Buy!!" : "Lets Sell!");
    }
}
