/*Given two strings, write a method to decide if one is a permutation of the other*/

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

  //Using a Map to keep track of the number of characters in each String
  //Time: O(n)
  //Space: O(n)
  public boolean checkPermutation(String str1, String str2) {
    int length1 = str1.length(), length2 = str2.length();   
    if(length1 != length2) return false;
    Map<Character, Integer> map = new HashMap<>();

    for(char ch: str1.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
    for(char ch: str2.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) - 1);

    for(int count: map.values()) {
        if(count != 0) return false;
    }

    return true;
  }
}