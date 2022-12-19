public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(1.2, 2.3);
        System.out.println(retangulo.area());
        System.out.println("É quadrado? " + retangulo.quadrado());
        System.out.println(retangulo.imprimirClasse());
        System.out.println("..............................");
        Retangulo retangulo2 = new Retangulo();
        System.out.println(retangulo2.area());
        System.out.println("É quadrado? " + retangulo2.quadrado());
        System.out.println(retangulo2.imprimirClasse());
    }
}
