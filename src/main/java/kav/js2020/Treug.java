package kav.js2020;

public class Treug implements Figura{

    //double polu_perim;
    private Integer a;
    private Integer b;
    private Integer c;

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    // polu_perim = 3.0;

    @Override
    public String Name() {
        return "Треугольник";
    }

    @Override
    public Integer Perim() {
        //this.Sush(a,b,c);
        return (a+b+c);
    }

    @Override
    public Double Plosh() {
        //this.Sush(a,b,c);
        return (Math.sqrt(this.Perim()/2*(this.Perim()/2-a)*(this.Perim()/2-b)*(this.Perim()/2-c)));
    }


    public void Sush(Integer a, Integer b, Integer c) {
        if ( (a+b>c) && (b+c>a) && (c+a>b) )
        {
            System.out.println( "Треугольник существует!");
        }
        else
        {
            System.out.println( "Треугольник с такими сторонами нельзя составить!");
            System.exit(1);
        }
    }
}
