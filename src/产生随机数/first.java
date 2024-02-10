package 产生随机数;
import java.util.Random;

public class first {
    public static void main(String[] args) {
        Random r = new Random();//实体化了一个对象
        int num = r.nextInt();//nextInt产生的随机数是int范围
        int a = r.nextInt(5);//这是在0-5之间取随机数
        int b = r.nextInt(-10, 10);//可以有开头和结尾
        System.out.println(num);
    }
}
