package com.mycompany.adlawan_num6_4;


public class Adlawan_num6_4 {
    
    public static void number6(){
        String[] name = {"Cilla", "Cezzann Gabrielle", "Irish", "Justine"};
      int start = 0;
      int range = name[0].length();
      String longest = "";
      
      for(int i = 0; i<name.length; i++){
          start = name[i].length();
          if(start>range){
              range = start;
              longest = name[i];
          }
      }
            System.out.println("Longest name: "+ longest);
    }
    
    public static void number4(){
        int[] num = {1,2,3,4,5};
        int value = num[0];
        
        for(int i = 0; i<num.length; i++){
            if(num[i]>value){
                value = num[i];
            }
        }
        System.out.println("Second highest value: " + value);
    }
    public static void main(String[] args) {
        number6();
        number4();
    }
}
