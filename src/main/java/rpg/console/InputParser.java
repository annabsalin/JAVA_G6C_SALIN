package rpg.console;
import java.io.InputStream;
import java.util.Scanner;
public class InputParser {
    static Scanner sc;
    public InputParser(InputStream is) {
        this.sc = new Scanner(is);
    }
    public static int getInt(){
        while(!sc.hasNextInt()){
            sc.nextLine();  // flushes line
        }
        return sc.nextInt();
    }
    public int getIntInRange(int low, int high){
        int val = getInt();
        while(val < low || val > high){
            val = getInt();
        }
        return val;
    }

    public String readInput(){
        return sc.nextLine();
    }
    public int readInt(){
        return sc.nextInt();
    }
    public void closeScanner(){
        sc.close();
    }


}
