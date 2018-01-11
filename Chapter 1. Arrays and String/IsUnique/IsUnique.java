/* Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?*/

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class IsUnique {
  
  //Using a data structure
  //Time: O(n)
  //Space: O(n)
  public boolean isUnique(String str) {
    Set<String> set = new HashSet<>();

    for(char ch: str.toCharArray()) {
        if(set.contains(ch)) return false;
        set.add(ch);
    }

    return true;
  }
  
  //Without a data structure
  //Time: O(nlogn)
  //Space: O(1)
  public boolean isUnique(String str) {
    char[] strArray = str.toCharArray();
    Arrays.sort(strArray);

    for(int i = 1; i < strArray.length; ++i) {
      if(strArray[i] == strArray[i - 1]) return false;
    }

    return true;
  }
}