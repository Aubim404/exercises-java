public class Retangulo {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Retangulo() {
        this.altura = 1;
        this.base = 2;
    }

    public double area() {
        return this.altura * this.base;
    }

    public boolean quadrado() {
        if (base == altura) {
            return true;
        }
        return false;
    }

    public String imprimirClasse() {
        return "Base = " + this.base + " Altura = " + this.altura + " Area = " + area() + " É quadrado? = "
                + quadrado();
    }
}
