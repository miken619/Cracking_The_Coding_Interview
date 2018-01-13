/* There are three types of edits that can be performed on a strings: insert a character, remove a character, or replace a character. Given two strings, write a function
   to check if they are one edit (or zero edits) aways
   
   EXAMPLE
   
   pale, ple -> true
   pales, pale -> true
   pale, bale -> true
   pale, bake -> false*/


   public class OneAway {

     public boolean oneAway(String str1, String str2) {
       int length1 = str1.length(), length2 = str2.length;
       if(Math.abs(length1 - length2) > 1) return false;

       int i = 0, j = 0, counter = 0;

       while(i < length1 && j < length2) {
         if(str1.charAt(i) == str2.charAt(j)) {
             ++i;
             ++j;
             continue;
         }
         
         if(length1 > length2) ++i;
         else if(length1 < length2) ++j;
         else {
             ++i;
             ++j;
         }
         
         if(++counter > 1) return false;
       }

       return true;
     }
   }