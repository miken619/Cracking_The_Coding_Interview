/* Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using 
   only one call to isSubstring */


public class StringRotation {

  public boolean stringRotation(String str1, String str2) {
    return isSubString(str1+str1, str2);
  }
  
  public boolean isSubString(String str1, String str2) {
    return str1.contains(str2);
  }
}