package String;



public class StringDeom {
    public static void main(String[] args) {
       String str="hechi";
        char c[]={str.charAt(0)};/*抽取一个字母的构造方法*/
        String  string=new String(c);
        String  part1=string.toUpperCase();/*将字母转为大写字母*/
        String  part2=str.substring(1);//从**开始截取字符串
        System.out.println("最终结果："+part1.concat(part2));
    }


}
