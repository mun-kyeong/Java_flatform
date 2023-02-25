import java.util.ArrayList;
import java.util.Scanner;

public class no1_Switch_Statement {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        while (true){
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine().toUpperCase();
            //System.out.println(word);

            if(word.startsWith("ADD")){
                switch (word){
                    case "ADD 1" : arr.add("Jan"); break;
                    case "ADD 2" : arr.add("Feb"); break;
                    case "ADD 3" : arr.add("Mar"); break;
                    case "ADD 4" : arr.add("Apr"); break;
                    case "ADD 5" : arr.add("May"); break;
                    case "ADD 6" : arr.add("Jun"); break;
                    case "ADD 7" : arr.add("Jul"); break;
                    case "ADD 8" : arr.add("Aug"); break;
                    case "ADD 9" : arr.add("Sep"); break;
                    case "ADD 10" : arr.add("Oct"); break;
                    case "ADD 11" : arr.add("Nov"); break;
                    case "ADD 12" : arr.add("Dec"); break;
                    default: System.out.println("Please enter the correct command"); break;
                }
            }
            else if ("PRINT".equals(word)){
                System.out.println(arr );
            } else if ("QUIT".equals(word)) {
                System.out.println("Bye");
                break;
            }
            else System.out.println("Invalid Command");
        }

    }
}
