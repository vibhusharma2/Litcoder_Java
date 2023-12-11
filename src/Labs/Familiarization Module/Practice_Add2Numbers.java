import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Practice_Add2Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ret = add(a,b);
        System.out.println(ret);
    }

    public static int add(int x, int y) {
        //Hint : Type return x + y below
        return x+y;
    }
}