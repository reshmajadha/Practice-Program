package toturial;

interface  mul{
    int mul1(int a,int b);
}

public class MultiLambdaExpression {
    public static void main(String[] args) {

        mul m1=(a,b)->(a*b);
        System.out.println(m1.mul1(12,12));

        mul m2=(int a1,int b2)->(a1*b2);
        System.out.println(m2.mul1(3,2));
    }
}
