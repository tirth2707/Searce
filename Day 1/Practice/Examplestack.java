import java.util.Stack;
public class Examplestack {

    public static void main(String args[])
    {
        Stack<String> temp= new Stack<>();

        temp.push("Searce");
        temp.push("Google");
        temp.push("Eng");

        System.out.println("Stack: "+temp);

        temp.pop();

        System.out.println("Stack: "+temp);

    }
    
}
