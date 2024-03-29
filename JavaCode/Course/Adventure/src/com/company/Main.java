package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        //Adding Locations
        addLocations();
        //Adding exits
        addExits();
        //Game Menu
        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are:  ");
            for (String exit:
                 exits.keySet()) {
                System.out.println(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            String[] splitDirection = direction.split(" ");
            String internalDirection = "";
            for (String i:
                 splitDirection) {
                System.out.println(i);
                if(i.equals("EAST") || i.equals("E")){
                    internalDirection = "E";
                }
                else if(i.equals("WEST") || i.equals("W")){
                    internalDirection = "W";
                }
                else if(Objects.equals(i, "SOUTH") || Objects.equals(i, "S")){
                    internalDirection = "S";
                }
                else if(Objects.equals(i, "NORTH") || Objects.equals(i, "N")){
                    internalDirection = "N";
                }
            }
            System.out.println(internalDirection);
            if(exits.containsKey(internalDirection)){
                loc = exits.get(internalDirection);
            } else{
                System.out.println("You cannot go in that direction");
            }
        }
    }
    private static void addLocations(){
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));
    }
    private static void addExits(){
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }
}
