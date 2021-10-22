package org.robertwmurphy.cw8kyuSumArrays;

public class SumArray {

    public static double sum(double[] numbers){
        double sum = 0.0d;

        if(numbers.length > 0) {
            for(int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;
        }

        return sum;
    }
}
