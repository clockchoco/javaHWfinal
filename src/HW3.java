import java.util.*;

public class HW3
{
    Scanner sc = new Scanner(System.in);
    ArrayList<Word> Voca;
    public HW3() {
        Voca = new ArrayList<>();
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        Voca.add(new Word("love","사랑"));
        Voca.add(new Word("animal","동물"));
        Voca.add(new Word("emotion","감정"));
        Voca.add(new Word("human","인간"));
        Voca.add(new Word("stock","주식"));
        Voca.add(new Word("trade","거래"));
        Voca.add(new Word("society","사회"));
        Voca.add(new Word("baby","아기"));
        Voca.add(new Word("honey","애인"));
        Voca.add(new Word("doll","인형"));
        Voca.add(new Word("bear","곰"));
        Voca.add(new Word("picture","사진"));
        Voca.add(new Word("painting","그림"));
        Voca.add(new Word("fault","오류"));
        Voca.add(new Word("example","보기"));
        Voca.add(new Word("eye","눈"));
        Voca.add(new Word("statue","조각상"));
        menu();
    }
    void menu() {
        while(true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            switch(sc.nextInt()) {
                case 1:
                    vocaTest();
                    break;
                case 2:
                    insertVoca();
                    break;
                case 3:
                    System.out.println("\"명품영어\"를 종료합니다.");
                    System.exit(0);
            }
        }
    }
    void vocaTest() {
        Iterator it = Voca.iterator();
        if (Voca.size() == 0) {
            System.out.println("단어가 없습니다. 테스트를 종료합니다.");
            return;
        }
        System.out.println("현재 " + Voca.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");

        while(true) {
            int QnA = (int) (Math.random() * Voca.size());
            int rand1, rand2, rand3;

            List<Integer> temp;
            while(true) {
                rand1 = (int) (Math.random() * Voca.size());
                rand2 = (int) (Math.random() * Voca.size());
                rand3 = (int) (Math.random() * Voca.size());
                if (QnA != rand1 && rand1 != rand2 && rand2 != rand3 && rand3 != QnA && rand2 != QnA && rand1 != rand3) break;
            }
            Integer[] select = {QnA, rand1, rand2, rand3};
            temp = Arrays.asList(select);
            Collections.shuffle(temp);
            temp.toArray(select);




            System.out.println(Voca.get(QnA).english + "?");
            System.out.print("(1)" + Voca.get(select[0]).korean);
            System.out.print(" (2)" + Voca.get(select[1]).korean);
            System.out.print(" (3)" + Voca.get(select[2]).korean);
            System.out.print(" (4)" + Voca.get(select[3]).korean + " :> ");
            int user_selection = sc.nextInt();
            if (user_selection == -1){
                return;
            }
            if (select[user_selection - 1] == QnA) {
                System.out.println("Excellent !!");
            }
            else {
                System.out.println("No. !!");
            }

        }
    }
    void insertVoca() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while (true) {
            System.out.print("영어 한글 입력 >> ");
            String newE = sc.next();
            if (newE.equals("그만")) return;
            String newK = sc.next();
            Voca.add(new Word(newE, newK));
        }
    }
    public static void main(String[] args) {
        new HW3();
    }
}
class Word{
    String english;
    String korean;
    Word(String e, String k) {
        english = e;
        korean = k;
    }
}