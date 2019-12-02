
public class Crypto {
    public static void main (String[] args){
        normalizeText("This is some \"really\" great. (Text)!?");
        caesarify("xyz XYZ", 2);
        groupify("aaaaaa", 3);
    }



    public static String normalizeText(String str) {
        String res = str;
        res = res.replace(" ", ""); //strNew is 'HelloWorldJavaUsers'

        // 2. Remove any punctuation (. , : ; ’ ” ! ? ( ) )
        res = res.replaceAll("\\p{Punct}", "");

        // 3. Turn all lower-case letters into upper-case letters
        res = res.toUpperCase();
        // 4. Return the result.
        System.out.println(res);
        return res;
    }
    public static String caesarify(String str, int key){
        String res = "";
        char c;

        for(int x = 0; x < str.length(); x++){
            int k = key;
            if(key > 0){
                if(Character.isUpperCase(str.charAt(x))){
                     c = (char)(((int)str.charAt(x) +
                            k - 65) % 26 + 65);
                } else if (Character.isLowerCase(str.charAt(x))){
                     c = (char)(((int)str.charAt(x) +
                            k - 97) % 26 + 97);
                } else {
                     c = str.charAt(x);
                }


                res+= c;
            } else {
                res = "no method for negative keys, try positive key";
            }





        }
        System.out.println(res);
        return res;
    }
    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }


    public static String groupify(String str, int interval) {
        if (interval > 0) {
            StringBuilder res = new StringBuilder();
            char[] charArrayOfStr = str.toCharArray();
            for (int x = 0; x < charArrayOfStr.length; x++) {
                if (x % interval == 0 && x != 0) {
                    res.append(" ").append(charArrayOfStr[x]);
                } else {
                    res.append(charArrayOfStr[x]);
                }

                if (x % interval == 0 && x == (charArrayOfStr.length - 1)) {
                    res.append("X");
                }
            }

            System.out.println(res.toString());

        } else {
            System.out.println("interval must be greater than zero");
        }
        return str.toString();
    }

    }
