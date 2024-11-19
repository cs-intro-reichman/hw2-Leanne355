// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String Word= args[0];
            int Times=Integer.parseInt(args[1]);
            Word=Word.toUpperCase();
            int WordLength= Word.length();
            char Letter;
            int index=0;
            String An="AEFHILMNORSX";
            while(WordLength!=0){
                WordLength--;
                Letter=Word.charAt(index);
                index++;
                if(An.indexOf(Letter)!=-1){
                        System.out.println("Give me an " + Letter + ": " + Letter + "!" );
                } else{
                        System.out.println("Give me a " + Letter + ": " + Letter + "!" );
                }
            }
            System.out.println("What does that spell?");
            while(Times>0){
                System.out.println(Word + " !!!");
                Times--;
            }
        }
}
