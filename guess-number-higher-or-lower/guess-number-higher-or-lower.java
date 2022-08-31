/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int start = 1;
        int end = n;
        int myGuess = start + (end - start) / 2;
        while(true){
            int x = guess(myGuess);
            if(x == 0) break;
            else if(x == -1) {
                //myGuess -=1;//search left side
                end = myGuess-1;
                myGuess = start + (end-start) / 2 ;
            }
            else {
                //myGuess +=1;//search right side
                start = myGuess+1;
                myGuess = start  + (end-start) / 2 ;
            }
        }
        return myGuess;
    }
}