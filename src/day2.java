import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double grade = s.nextDouble();
        if(grade <0||grade >100){
            System.out.println("成绩输入有误");
        } else{
            switch ((int)grade/10){
                case 10:
                    ;
                case 9:
                    System.out.println("成绩为:A");
                case 8:
                    System.out.println("成绩为:B");
                case 7:
                    System.out.println("成绩为:C");
                case 6:
                    System.out.println("成绩为:D");
                default:
                    System.out.println("成绩为:E");
            }
            
        }

    }
}
