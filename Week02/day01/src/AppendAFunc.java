public class AppendAFunc {
    public static void main (String[] args){
        String am = "kuty";
        System.out.println(appendA(am));
    }
    public static String appendA(String input) {
        String inputAAppended = input + "a";
        return inputAAppended;
    }
}
