package tochka;

import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(), y1 = in.nextInt(); //координаты точки
        int x2 = in.nextInt(), y2 = in.nextInt();
        int r = in.nextInt(); //радиус окружности
        Tochka t1 = new Tochka(x1, y1);
        Tochka t2 = new Tochka(x2, y2);
        boolean popal = t1.okruzh(r); //находится ли точка в окружности
        System.out.println(popal);
        double dlina = t1.dlina(t2); //длина от точки до точки
        System.out.printf("%.4f\n", dlina);
        int chet = t1.chet();
        System.out.println(chet);
    }
}
