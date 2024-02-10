package static类变量;

public class use {
    static String name;
    static int num=100;
    //类变量
    int age;
    //实例变量
    //静态不需要new 实例需要，静态的全局(class内)变量是唯一的(共享的) ；实例的变量是独立的(class内)，实例可以访问静态变量；静态则不能访问实例变量
    public static int printo()
    {
        System.out.println("你好哇");
        return 0;
    }//静态方法
    public void printof(int x)
    {
        System.out.println("成绩 "+(x>=60?"及格":"不及格"));
    }
    //静态代码块
    static {
        System.out.println("静态代码块");
    }
    //实例代码块
    {
        System.out.println("实例代码块");
    }
    public use()
    {
        System.out.println("无参数构造器");
    }//直接写use()时执行

}
