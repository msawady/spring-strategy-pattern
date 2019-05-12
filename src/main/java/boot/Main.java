package boot;

import domain.Situation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import usecase.Analyze;

public class Main {

    public static void main(String... args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Situation s1 = new Situation("up", true);
        Situation s2 = new Situation("up", false);
        Situation s3 = new Situation("down", true);
        Situation s4 = new Situation("down", false);

        Analyze analyze = context.getBean(Analyze.class);
        System.out.println("Analyze1");
        analyze.doAnalyze(s1);
        System.out.println("Analyze2");
        analyze.doAnalyze(s2);
        System.out.println("Analyze3");
        analyze.doAnalyze(s3);
        System.out.println("Analyze4");
        analyze.doAnalyze(s4);
    }
}
