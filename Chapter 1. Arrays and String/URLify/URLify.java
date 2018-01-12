/*Write a mehtod to replace all spaces in a string with \'%20\'. You may assume that the string has sufficient space at the end to hold teh additional characters, and that you
are given the \"true\" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place)

EXAMPLE: 
Input: \"Mr  John Smith    *, 13
OutPut: \"Mr%20John%20Smith\"*/

public class URLify {

    public String urLify(char[] array) {
        
        int length = array.length;
        
        int k = length - 1;
        
        while(array[k] == ' ') --k;

        for(int i = k, j = length - 1; i >= 0; --i) {
            if(array[i] != ' ') {
                char temp = array[i];
                array[i] = ' ';
                array[j--] = temp;
            }else {
                array[j--] = '0';
                array[j--] = '2';
                array[j--] = '%';              
            }
        }
           
        return new String(array);
  }
}