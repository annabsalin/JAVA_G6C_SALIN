package com.isep.seance1;

public class Person {
    // Attributs
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        if(verifyInput(name)){
            this.name = name;
        }
        else {
            System.out.println("The name does not adhere to our naming conventions");
        }
    }

    public static boolean verifyInput(String name){
        if(name.length()<2){
            return false;
        }
        if(name.contains("3")){
            System.out.println("Are you sur this is correct ?");
            return false;
        }
        return true;
    }

}