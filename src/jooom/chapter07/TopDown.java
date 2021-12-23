package jooom.chapter07;

import java.util.Scanner;

public class TopDown {
    private static double salary = 300;
    /*직원의 급여를 계산한다 */
    public static void main(String[] args) {
        double percent = inputPercent();
        double calculatedSalary = calculateSalary(percent);
        // TODO: 출력
    }
    private static double inputPercent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("소득세율 입력 : ");
        return scanner.nextDouble();
    }

    private static double calculateSalary(double percent){
        return salary * (1 - percent);
    }
}
