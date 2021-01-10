package Methodchuangdi;

public class ZCD {

    public static void main(String[] args) {
        int a=5;
        Z1(a);
        System.out.println("输出值为执行Z1方法的值："+a);
    }
    /*

    局部变量只在括号内起作用*/
    public static void Z1(int b){
        b=6;
        System.out.println("输出值为a的克隆值，没有改变，a传递给b的值："+b);

    }
}
