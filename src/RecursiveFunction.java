public class RecursiveFunction {

    public static void main(String[] args) {


        String str = "CodeBase";
//
        String resultString =  ReverseString(str);
        System.out.println(resultString);



    }

    public static String ReverseString(String str){

        if(str.length()<1 || str==null){
            return str;
        }
        System.out.println(str.charAt(str.length()-1) + str.substring(0,str.length()-1) + " --- "+ str );
        return (str.charAt(str.length()-1) + ReverseString(str.substring(0,str.length()-1)) );

    }

}
