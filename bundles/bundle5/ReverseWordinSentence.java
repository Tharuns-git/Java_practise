class Reverse{
    String str;
    
    Reverse(String str){
        this.str=str;
    }

    public String reverse(){
        StringBuilder sb=new StringBuilder();
        String []words=str.trim().split(" ");
        
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

}
public class ReverseWordinSentence {
    public static void main(String[] args) {
        
        Reverse obj=new Reverse("Java is very Powerful ");
        String result=obj.reverse();
        System.out.println(result);
    }
}
