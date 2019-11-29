
public class Crypto {
    public static void main (String[] args){
        normalizeText("This is some \"really\" great. (Text)!?");
    }

    public static String normalizeText(String str){
        String res = str;
        res = res.replace(" ", ""); //strNew is 'HelloWorldJavaUsers'

       // 2. Remove any punctuation (. , : ; ’ ” ! ? ( ) )
        res = res.replaceAll("\\p{Punct}","");

       // 3. Turn all lower-case letters into upper-case letters
        res = res.toUpperCase();
       // 4. Return the result.
        System.out.println(res);
        return res;
    }

   
}
