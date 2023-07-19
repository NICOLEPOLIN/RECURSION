public class Main {
    //minimum character seen so far min as parameters
    public static int longOrNum (String s){
        return longOrNum(s,0,0,'0');
    }
    private static int longOrNum(String s,int i,int count,char min){
        if(i==s.length()) {// it first checks if the current index i is equal to the length of the string s.
            // If it is, it means we have reached the end of the string,
            // so it returns the count as the result.
            return count;
        }
        if(s.charAt(i)>=min&&s.charAt(i)<='9');//If the current character at index i is a digit
        // and it is greater than or equal to the minimum character min and less than or equal to '9',
        // it means it is a consecutive digit.
        // In this case, it makes a recursive call:
        {
            return longOrNum(s, i + 1, count + 1, s.charAt(i) + 1);
        }
        if(s.charAt(i)<='9'&&s.charAt(i)>='0'){//If the current character at index i is a digit and it is less than or equal to '9' and greater than or equal to '0',
            // it means it is a consecutive digit but not greater than min.
            // In this case, it makes a recursive call:
            return Math.max(count,longOrNum(s,i+1,1,s.charAt(i+1));
        }

        else {//If the current character at index i is not a digit,
            // it means it is a non-digit character. In this case, it makes a recursive call:
            return Math.max(count, longOrNum(s, i + 1, 0, '0'));

                    }
      }
}
}