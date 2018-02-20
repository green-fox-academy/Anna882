public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String myTodo = "My todo\n";
        String todo2 = " - Download games\n";
        String todo2_1 = "    - Diablo";

        todoText = myTodo + todoText + todo2 + todo2_1;
        System.out.println(todoText);
    }
}