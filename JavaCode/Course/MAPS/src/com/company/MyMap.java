package com.company;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));//Returns previous value of key.
                                                                                // Will return null because BASIC didn't exist before
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        System.out.println(languages.get("Java"));
        if(languages.containsKey("Java")){ // This if else ensures that you do not replace an value for the given key
            // Without it the value would just be replaced.
            System.out.println("Java's already in the map");
        }else{
            languages.put("Java", "Content, content, content!!");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        languages.remove("Lisp");
        if(languages.remove("Algol", "potato")){
            System.out.println("IT\'s been removed!!!");
        }else{
            System.out.println("key/value pair not found wah wah wah");
        }

    }
}
