package main;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        // ArrayList example:
        ArrayList<String> names = new ArrayList<>();

        names.add("Jesper");
        names.add("John");
        names.add("Betinna");
        names.add("Biks");
        names.add("Baks");

        String element = names.get(2);
        names.remove("Jesper");
        names.remove(1);

        // Set example:
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Jesper");
        nameSet.add("Jesper"); // Will fail
        nameSet.add("John");

        if (!nameSet.contains("Jesper"))
        {
            nameSet.add("Jesper");
        }

        // Map example:
        Map<String, Integer> map = new HashMap<>();
        map.put("Jesper", 35);
        map.put("John", 42);
        map.put("Bolette", 1000000000);

        if (map.containsKey("Jesper"))
        {
            System.out.println(map.get("Jesper"));
            map.remove("Jesper");
        }


    }
}