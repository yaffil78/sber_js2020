package kav.js2020;

public class Kvadrat implements Figura{

    private Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    @Override
    public String Name() {
        return "Квадрат";
    }

    @Override
    public Integer Perim() {
        return (a * 4);
    }

    @Override
    public Double Plosh() {
        return (a * 2.0);
    }
}
