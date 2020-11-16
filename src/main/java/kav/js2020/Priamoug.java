package kav.js2020;

public class Priamoug extends Kvadrat{

    private Integer b;
    Kvadrat kv = new Kvadrat();

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String Name() {
        return "Прямоугольник";
    }

    @Override
    public Integer Perim() {
        return (kv.getA()*2 + b*2);
    }

    @Override
    public Double Plosh() {
        return (kv.getA()*b+0.0);
    }
}
