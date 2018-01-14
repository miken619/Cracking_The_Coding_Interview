/* Implement a method to peform basic string compression using the counts of repeated characters. For example, the string aabccccaaa would become a2b1c5a3. 
   If the compressed string would not become smaller than the orginal string, your method should return the original string. You can assume the string
   has only uppercase and lowercase letters(a-z)*/

public class StringCompression {
  
  public String stringCompression(String str) {
    StringBuilder sb = new StringBuilder();
    char[] chArray = str.toCharArray();
    char prev = chArray[0];
    int counter = 0, length = chArray.length;

    for(int i = 0; i < length; ++i) {
        char curr = chArray[i];

        
        if(curr != prev) {
            sb.append(prev+counter);
            counter = 0;
        }

        ++counter;
        prev = curr;

        if(i == length - 1) sb.append(curr+counter);      
    }

    return (sb.length() > length) ? str : sb.toString();
  }
}