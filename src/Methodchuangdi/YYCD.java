package Methodchuangdi;

public class YYCD {
    public static void main(String[] args) {
        int a[]={1,2,3};
        Y(a);
        for(int i=0;i<a.length;i++){
            System.out.println("输出值："+a[i]);
        }
    }
    public static void  Y(int[] b){
     b[2]=66;
    }
}
