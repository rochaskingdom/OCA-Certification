package academy.learnprogramming.basic;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import  static academy.learnprogramming.basic.Config.*;

public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5, 7);
        out.println("min= " + min);
        out.println(PI);

        printCoonfig();

        out.println("name= " + NAME);
        out.println("columnCount" + MAX_COLUMN_COUNT);
    }
}