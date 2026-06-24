package strategy;

public class KaryawanStrategy implements UKTStrategy {

    @Override
    public double calculate(int sks) {
        return sks * 200000;
    }
}