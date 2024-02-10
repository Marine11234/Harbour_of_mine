package 局部变量使用;
import java.util.Scanner;
public class first {
    //int占用4字节范围(-2^31~~~~~~2^31)
        //变量类型 int double float long short(短整型，占2字节，范围2^15) byte(短短整形，占1字节，范围128) char
    public static void main(String[] args) {
        char zifu = 'A';
        System.out.println(zifu);
        {
            int num7;//局部变量，只能在大括号里使用
        }
        //可以同时创建变量
    }



}
