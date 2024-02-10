package 匿名对象使用;

public class Person_use {
    public static void main(String[] args) {
        Person num=new Person();
        num.name="好东西";
        num.showName();
        new Person().name="匿名对象";//匿名对象只有右边的对象，没有左边的名字和运算符
        /*
         * 格式：
         * new 类名称()
         * 匿名对象只能被使用一次，下次使用时需要再创建一个新对象（不会有上一次的使用记录）
         * 匿名对象只有一次使用机会
         * */
    }
}