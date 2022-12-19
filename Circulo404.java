public class Circulo {
    public double raio;

    public Circulo(double r) {
        raio = r;
    }

    public void setRaio(double r) {
        if (r < 0)
            System.out.println("É impossível o raio ser negativo");
        else
            raio = r;
    }

    public double PegaRaio() {
        return (raio);
    }

    public double Diametro() {
        return raio * 2;
    }

    public double Area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double circunferencia() {
        return 2 * Math.PI * raio;
    }

    public void exibeDados() {
        System.out.printf("Dados do circuito:   %.2f %n", PegaRaio());
        System.out.printf("Diametro:   %.2f %n", Diametro());
        System.out.printf("Circunferencia: %.2f %n", circunferencia());
        System.out.printf("Area : %.2f %n", Area());
    }
}