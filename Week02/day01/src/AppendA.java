public class AppendA {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};

        for (String nimal : nimals) {
        int i = 0;
        nimals[i] = nimal + "a";
        System.out.println(nimals[i]);
        }

    }
}
