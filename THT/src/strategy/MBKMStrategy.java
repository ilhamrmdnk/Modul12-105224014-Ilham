package strategy;

public class MBKMStrategy implements UKTStrategy {

    @Override
    public double calculate(int sks) {
        return sks * 100000;
    }
}