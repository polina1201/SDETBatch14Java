package Class14;

public class Task4 {
    public static void main(String[] args) {

/*How would you reverse a String word by word? for example input=>This is sentence I want to reverse
        output=>sihT si ecnetnes I tnaw ot esrever
         */
//StringBuilder stringBuilder=new StringBuilder("This is sentence I want to reverse");
//stringBuilder.reverse();
// System.out.println(stringBuilder); -> Reverses the sentence

        String str="This is sentence i want to reverse";
        String[] str1=str.split(" ");
        int value=str1.length;
        for (int i=0; i<value; i++){
            StringBuilder str2=new StringBuilder(str1[i]);
            System.out.print(str2.reverse()+" ");
        }
    }
}
