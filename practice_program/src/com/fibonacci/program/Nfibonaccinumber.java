package com.fibonacci.program;

public class Nfibonaccinumber {
    private int[] fibSeries;

    public Nfibonaccinumber() {
        this.fibSeries = new int[0];
    }

    /**
     * @return the fibSeries
     */
    public int[] getFibSeries() {
        return fibSeries;
    }

    /**
     * @param fibSeries the fibSeries to set
     */
    public void setFibSeries(int[] fibSeries) {
        this.fibSeries = fibSeries;
    }

    public void calculateUpToN(int n) {
        if (n <= 0)
            return;

        fibSeries = new int[n];
        fibSeries[0] = 0;
        if (n > 1)
            fibSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
    }
}
