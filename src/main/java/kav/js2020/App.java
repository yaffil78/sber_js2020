package kav.js2020;
import java.util.Scanner;

/**
 Считаем площадь и периметр фигур
 */

public class App
{
    public static void main( String[] args ) {
        int[] fig_dan;
        fig_dan = new int[5];
        int i_st = 0;
        double plosh = 0;
        int perim = 0;
        double polu_perim = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите фигуру: \n 1 - треугольник \n 2 - квадрат \n 3 - прямоугольник \n");
        int figura = in.nextInt();

        if (figura > 3 || figura < 1) {
            System.out.println("Неопознанная фигура, выберите число из указанных!");
            System.exit(1);
        }

        while (i_st < 3)
        {
            System.out.print("Укажите длинну стороны " + (i_st + 1) + " в мм :");
            fig_dan[i_st] = in.nextInt();
            if (figura == 2 || (figura == 3 && i_st == 1)) {
                i_st = 3;
            }
            i_st++;
        }

        in.close();

        if (figura==1 && (fig_dan[0]+fig_dan[1]>fig_dan[2]) && (fig_dan[1]+fig_dan[2]>fig_dan[0]) && (fig_dan[2]+fig_dan[0]>fig_dan[1]) )
        {
            System.out.println( "Треугольник существует!");
        }
        else if (figura==1)
        {
            System.out.println( "Треугольник с такими сторонами нельзя составить!");
            System.exit(1);
        }


        if (figura==1)
        {
            perim = fig_dan[0]+fig_dan[1]+fig_dan[2];
            polu_perim = perim/2;
            plosh = Math.sqrt(polu_perim*(polu_perim-fig_dan[0])*(polu_perim-fig_dan[1])*(polu_perim-fig_dan[2]));

        }
        else if (figura==2)
        {
            perim = fig_dan[0]*4;
            plosh = fig_dan[0]*2;
        }
        else if (figura==3)
        {
            perim = fig_dan[0]*2+fig_dan[1]*2;
            plosh = fig_dan[0]*fig_dan[1];
        }


        System.out.println( "Выбрана фигура:" + figura );

        i_st = 0;
        while (i_st < 3)
        {
            System.out.print("Сторона " + (i_st + 1) + ": " + fig_dan[i_st] + "\n");
            if (figura == 2 || (figura == 3 && i_st == 1)) {
                i_st = 3;
            }
            i_st++;
        }
        System.out.println( "Площадь:" + plosh );
        System.out.println( "Периметр:" + perim );

    }
}
