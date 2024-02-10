package 输入;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        System.out.println(num);
        //普通调用

        int numm=new Scanner(System.in).nextInt();
        System.out.println();
        //匿名使用

        Scanner b=new Scanner(System.in);//将b作为参数传到方法中（见下）
        Scanner_use_b(b);
        //普通传参

        Scanner_use_b(new Scanner(System.in));
        //匿名传参
    }
    public static void Scanner_use_b(Scanner b)
    {
        int num=b.nextInt();
        System.out.println(num);//输出
    }
}

