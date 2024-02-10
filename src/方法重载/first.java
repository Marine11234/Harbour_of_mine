package 方法重载;

public class first {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[]args)
    {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}
//方法重载：与以下因素有关
//参数个数，参数类型，参数多类型顺序
//与参数名称，方法返回值类型无关
