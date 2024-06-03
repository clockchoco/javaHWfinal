import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HW2 {
    HashMap<String, Integer> map;
    Scanner sc = new Scanner(System.in);
    public HW2() {
        System.out.println("** 포인트 관리 시스템입니다. **");
        map = new HashMap<>();
        getInput();
    }
    void getInput() {
        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = sc.next();
            if(name.equals("그만")) break;
            int point = sc.nextInt();
            map.put(name, point);
            printData();
        }
    }
    void printData() {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry entry=(HashMap.Entry)it.next();
            String key=(String)entry.getKey();
            Integer value=(Integer)entry.getValue();
            System.out.print("("+key+","+value+")");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new HW2();
    }
}
