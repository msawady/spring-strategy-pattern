package usecase;

import domain.Situation;
import domain.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Analyze {

    private List<Strategy> strategies;

    public Analyze(@Autowired List<Strategy> strategies) {
        this.strategies = strategies;
    }

    public void doAnalyze(Situation situation) {
        strategies.stream()
                .filter(s -> s.needDecision(situation))
                .forEach(s -> s.showDecision(situation));
    }

}
