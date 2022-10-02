package Class14;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Today is Java Class");
        StringBuffer stringBuffer=new StringBuffer("Today is Java Class");

        //Convert String into StringBuilder
        String str="Java is very easy";
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1= "+stringBuilder1);

        //Convert StringBuilder to String
        String newStr=stringBuilder1.toString();


    }
}
