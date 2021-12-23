package jooom.chapter07;

import java.util.List;
import java.util.Scanner;

public class EmployModule {
    private static String[] employees = new String[]{"직원1", "직원2", "직원3", "직원4"};
    private static double[] basePays = new double[]{400, 300, 2, 3};
    private static boolean[] hourly = new boolean[]{false, false, true, true};
    private static int[] timeCards = new int[]{0,0, 120, 100};

    private double calculate(int index, double taxRate){
        if(hourly[index]){
            return calculateHourlyPayFor(index, taxRate);
        } else {
            return calculatePayFor(index, taxRate);
        }
    }
    private static double calculateHourlyPayFor(int index, double taxRate){
        double pay = timeCards[index] * basePays[index];
        return pay * (1 - taxRate);
    }
    private static double calculatePayFor(int index, double percent) {
        return basePays[index] * (1 - percent);
    }
}
