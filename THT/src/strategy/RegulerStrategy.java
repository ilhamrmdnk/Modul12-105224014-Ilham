package strategy;

public class RegulerStrategy implements UKTStrategy {

    @Override
    public double calculate(int sks) {
        return sks * 150000;
    }
}