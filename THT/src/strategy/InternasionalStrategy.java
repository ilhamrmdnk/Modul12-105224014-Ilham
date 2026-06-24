package strategy;

public class InternasionalStrategy implements UKTStrategy {

    @Override
    public double calculate(int sks) {
        return sks * 300000;
    }
}