package wordcounter;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class WordCounter {
    String data = "";

    public WordCounter(String data, boolean isFile) {
        if (isFile) {
            // Read the file and store the data in the data variable
            try {
                Scanner scanner = new Scanner(new File(data));
                while (scanner.hasNext())
                    this.data += scanner.nextLine().toLowerCase() + "\n";
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        } else {
            // Store the data in the data variable
            this.data = data;

        }
    }

    public int countTotalWords() {

        int num = 0;
//        num = methodOne();
        num = methodTwo();
//        num = methodThree();
        return num;
    }


    public Map<String, Integer> countWordOccurrences() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] words = data.trim().replaceAll("[^a-zA-Z]", " ").split("\\s+");

        for (String s : words){
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }

        return map;
    }

    public int methodOne(){
        String[] words = data.trim().split("\\s+");
//        for (String s : words){
//            System.out.println(s);
//        }
        return words.length;
    }

    public int methodTwo(){
        String[] words = data.replaceAll("[^a-zA-Z]", " ").split("\\s+");

//        for (String s : words){
//            System.out.println(s);
//        }
        return words.length;
    }

    public int methodThree(){
        data = data.replaceAll(",", "");
        data = data.replaceAll("—", " ");
        data = data.replace(".", "");
        data = data.replaceAll("“", "");
        data = data.replaceAll("”", "");
        data = data.replace("?", "");
        data = data.replaceAll("‘", "");
        data = data.replaceAll(":", "");
        data = data.replaceAll("…", "");
        data = data.replaceAll("[0-9]", "");
        String[] words = data.trim().split("\\s+");

//        for (String s : words){
//            System.out.println(s);
//        }
        return words.length;
    }
}
