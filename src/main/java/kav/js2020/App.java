package kav.js2020;
import java.util.Scanner;

/**
 Считаем площадь и периметр фигур
 */

public class App
{
    public static void main( String[] args ) {

        Figura figura = new Figura() {
            @Override
            public String Name() {
                return null;
            }

            @Override
            public Integer Perim() {
                return null;
            }

            @Override
            public Double Plosh() {
                return null;
            }
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите фигуру: \n 1 - треугольник \n 2 - квадрат \n 3 - прямоугольник \n");
        int fig = in.nextInt();

        if (fig == 1)
            {
                Treug treug = new Treug();
                System.out.print("Укажите длинну стороны A в мм :");
                treug.setA(in.nextInt());
                System.out.print("Укажите длинну стороны B в мм :");
                treug.setB(in.nextInt());
                System.out.print("Укажите длинну стороны C в мм :");
                treug.setC(in.nextInt());
                treug.Sush(treug.getA(), treug.getB(),treug.getC());
                figura = treug;
            }
        else if (fig == 2)
            {
                Kvadrat kvadrat = new Kvadrat();
                System.out.print("Укажите длинну стороны A в мм :");
                kvadrat.setA(in.nextInt());
                figura = kvadrat;
               // System.out.println( "Выбрана фигура: " + kvadrat.Name());
               // System.out.println( "Площадь: " + kvadrat.Plosh());
               // System.out.println( "Периметр :" + kvadrat.Perim());
            }
        else if (fig == 3)
            {
                Priamoug priamoug = new Priamoug();
                System.out.print("Укажите длинну стороны A в мм :");
                priamoug.setA(in.nextInt());
                System.out.print("Укажите длинну стороны B в мм :");
                priamoug.setB(in.nextInt());
                figura = priamoug;
            }
        else {

            System.out.println("Неопознанная фигура, выберите число из указанных!");
            System.exit(1);
        }

        System.out.println( "Выбрана фигура: " + figura.Name() );
        System.out.println( "Её площадь: " + figura.Plosh() );
        System.out.println( "Её периметр: " + figura.Perim() );
     //   System.out.println( "Выбрана фигура:" + );
/*
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
*/
    }
}
