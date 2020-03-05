import java.math.BigDecimal;

public class Fibonacci {

    public static BigDecimal of(int num) {     //建立一个函数，用于计算数列中的每一项
        if(num==0) {
            return BigDecimal.valueOf(0);                   //初始值为0
        }
        if(num==1) {
            return BigDecimal.valueOf(1);                   //定义of（1）为1，否者结果都是0；
        }
        BigDecimal result= BigDecimal.valueOf(0);
        BigDecimal r1 = BigDecimal.valueOf(0);
        BigDecimal r2 = BigDecimal.valueOf(1);
        for(int i = 2;i<=num; i++) {    //斐波那契数列求解
            result = r1.add(r2);
            r1=r2;
            r2=result;
        }
        return result;                  //返回结果
    }

    public static void main(String[] args) {

        for(int i = 1;i <= 200;i++) {   //建立一个for循环，用于打印第1个至第200个数字
            //调用函数进行打印
            System.out.print("Fibonacci.of(" + i + ") " + "== "+Fibonacci.of(i) + "\n");
        }
    }
}