/*Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or permutation of a palindrome.
  A palindrome is a word or phrase that is teh same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not
  need to be limited to just dictionary words.
  
  EXAMPLE
  Input:  Tact Coa
  Output: True 
  */

import java.util.Set;
import java.util.HashSet;

  public class PalindromePermutation {

    public boolean palindromePermutation(String str) {
      Set<Character> set = new HashSet<>();
      String lowercaseStr = str.toLowerCase();

      for(char ch: lowercaseStr.toCharArray()) {
          if(ch == ' ') continue;
          if(set.contains(ch)) set.remove(ch);
          else set.add(ch);
      }

      return set.size() <= 1;
    }
  }