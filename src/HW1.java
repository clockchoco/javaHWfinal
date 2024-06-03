import java.util.HashMap;
import java.util.Scanner;

public class HW1 {
    HashMap<String, Double> map;
    Scanner sc = new Scanner(System.in);
    double cutline;
    public HW1() {
        map = new HashMap<>(5);
        System.out.println("미래장학금관리시스템입니다.");
        for (int i = 0 ; i < 5; i++) {
            System.out.print("이름과 학점>> ");
            map.put(sc.next(), sc.nextDouble());
        }
        System.out.print("장학생 선발 기준 입력>> ");
        cutline = sc.nextDouble();
        System.out.print("장학생 명단 : ");
        for(HashMap.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue() >= cutline) System.out.print(entry.getKey() + " ");
        }
    }

    public static void main(String[] args) {
        new HW1();
    }
}