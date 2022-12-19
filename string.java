public class string {
    public static void main(String[] args) {
        String sorteio = ("0123456789");
        char número = sorteio.charAt(2);
        System.out.println(
                "O número sorteado foi " + número); /* charAt serve para puxar um número ou uma letra da string */
        ///////////////////////////////////////////////////////////////
        String censura = ("Quero que todos vocês sejam mortos");
        censura = censura.replace("mortos", "felizes"); /* trocou mortos por felizes */
        System.out.println(censura);
        /////////////////////////////////////////
        String s = "Escola";
        System.out.println(s.substring(2)); /* retorna após 2 letras (lembrando que começa a contar pelo 0) */
    }
}
