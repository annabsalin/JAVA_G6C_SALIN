package com.isep.seance2;

import java.util.*;


public class ExercicePreliminaire {
//    public static void main(String args[])
//    {
//        int [] integers = {5,8,6,0,7};
//        int val=13;
//        boolean result = isbinarySumIncArray(integers,val);

//    }

    // Java program for checking
// balanced brackets



        static boolean isBinarySumInArray(int []integers, int val){
            int n = integers.length;
            int count = 0;
//méthode barbare/Brute force (faire marcher le pb) : complécité 0(n^2)
            for(int i=0; i<n; i++){
                int subarraySum = 0;
                for(int j=i; j<n; j++){
                    subarraySum += integers[j];
                    if(val == subarraySum){
                        count++;
                    }
                }
            }
            return count >= 1;
        }

        //méthode par complémentaire (plus efficace que la brute force)
        public boolean BinarySumInArray(int[] integers, int val){
            Set<Integer> set=new HashSet<>();
            for (int i=0; i<integers.length; i++){
                if(set.contains(val-integers[i])){
                    return true;
                }
                set.add(integers[i]);
            }
            return false;
        }

        public static void main(String[] args){
            int [] integers = {3, 5, 7, 15};
            int val = 8;

            boolean result = isBinarySumInArray(integers, val);
            System.out.printf("%d est la somme de deux entiers dans le tableau : %b%n", val, result);

        }
    }

