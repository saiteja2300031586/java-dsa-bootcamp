package day4strings;
import java.util.*;

public class FirstUniqueChar {

    public static void main(String[] args) {

        HashMap<Character,Integer> map=new HashMap<>();
        String s="Leetcode";

        for(char c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: s.toCharArray()) {
            if(map.get(c)==1) {
                System.out.println("First unique char: "+c);
                return;
            }
        }

        System.out.println("No unique character");
    }
}