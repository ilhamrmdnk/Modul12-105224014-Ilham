package service;

import strategy.UKTStrategy;

public class UKTCalculator {

    private UKTStrategy strategy;

    public UKTCalculator(UKTStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(int sks) {
        return strategy.calculate(sks);
    }
}