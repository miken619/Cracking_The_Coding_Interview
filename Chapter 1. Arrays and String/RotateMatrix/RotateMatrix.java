/* Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
  
  EXAMPLE

  1   2  3  4 -> 13   9  5  1  
  5   6  7  8    14  10  6  2
  9  10 11 12    15  11  7  3
  13 14 15 16    16  12  8  4 
*/

public class RotateMatrix {

  public int[][] rotateMatrix(int[][] image) {
    int n = image.length;
    
    for(int i = 0; i < n/2; ++i) {
        int first = i;
        int last = n - 1 - i;
        for(int j = i; j < last; ++j) {
          int offset = j - first;
          int top = image[first][i];

          //left to top
          image[first][i] = image[last - offset][first];
          //bottom to left
          image[last - offset][first] = image[last][last - offset];      
          //right to bottom
          image[last][last - offset] = image[j][last];
          //top to right
          image[j][last] = top;
        }
    }
    return image;
  }
}

