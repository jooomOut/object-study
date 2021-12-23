package jooom.chapter07;

import java.util.Scanner;

public class TopDown {
    /*직원의 급여를 계산한다 */
    public static void main(String[] args) {
        double percent = inputPercent();
        // TODO: 급여 계산
        // TODO: 출력
    }
    private static double inputPercent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("소득세율 입력 : ");
        return scanner.nextDouble();
    }
}
