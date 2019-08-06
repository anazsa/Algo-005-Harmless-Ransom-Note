package hbcu.stay.ready.algor;

import java.util.HashMap;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){

        String word = "";

        HashMap<String, String> hashy = new HashMap<String, String>(); // hashmap with string and string as key value

        String [] magazinewords = magazineText.split("\\w" + "\\+(1,-1)");
        // regex that identifies words
        // identifies that it occures once



        for (String words : magazinewords){ // for each word thats in the magazine
                                             // contains keys checks if a particular key is being mapped or not , returns
                                              // true if not , so use the ! to say it IS detected
                                              // then put the words identfied in the message
            if( !hashy. containsKey(words)) {
                hashy.put(words, message);{

                }



            } else{
                hashy.remove(magazinewords); //remove those words
            }

            word += words; // add the words you got to the string
        }

        boolean b = Boolean.parseBoolean(word); // turns your string to a boolean
        return b;
    }

}
