package br.com.dio.lccf;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        byte y = 1;
        short h = 25;
        int i1 = 110, i2 = 120;
        long l1 = 1597L;
        float f1 = 4.5F;
        double d1 = 59.5D;
        char c1 ='x', c2 = 'y';
        String s1 = "Fulano", s2 = "Fulano", s3 = "y";
        boolean b1 = true, b2= false;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 < i2 " + (i1 < i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 >= i2 " + (i1 >= i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));
        System.out.println();

        // o char no seu baixo nível ele um códico númerico
        System.out.println("c1:"+c1+"  cod:" + (c1+0));
        System.out.println("c2:"+c2+"  cod:" + (c2+0));
        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));
        System.out.println();

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 =! s2 " + (s1 != s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        //não se aplica em comparação de temanho (Desta forma)
//      System.out.println("s1 > s2 " + (s1 > s2));
//      System.out.println("s1 >= s2 " + (s1 >= s2));
        System.out.println();

        System.out.println("b1 == b2" + (b1 == b2));
        System.out.println("b1 == b2" + (b1 == b2));
        //não a logica realizar comparação de tamanho
//      System.out.println("b1 >= b2" + (b1 >= b2));
//      System.out.println("b1 < b2" + (b1 < b2));
        System.out.println();

        System.out.println("i2 == c1 "+ (i2 == c1));
        System.out.println("i2 >= c1 "+ (i2 >= c1));
        i2 = c1;
//      System.out.println("s3 == c2 "+ (s3 == c2));
        System.out.println("s1 == s2 "+ (s1 == s2));
        System.out.println("d1 == i2 "+ (d1 > i1));
        System.out.println("d1 == i2 "+ (d1 > i1));

//      System.out.println("b2 == c2 "+ (b2 == c2));
        System.out.println("b1 == (i2 == c1) " + (b1 == (i2 == c1)));

    }
}
