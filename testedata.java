public class testedata {
    public static void main(String args[]) {
        Data data = new Data(03, 11, 2008);
        System.out.println("Data: " + data.toString());

        data.setData(31, 02, 2008);
        System.out.println("Data: " + data.toString());
    }
}
