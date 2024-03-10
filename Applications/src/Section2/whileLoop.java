package Section2;
public class whileLoop {
    public static void main(String[] args) {
        int i = 0;
        String S = "";
        while(i< 5){
            int j = 0;
            while(j < i){
                S+= "* ";
                j++;
            }
            S += "\n";
            i++;
        }
        System.out.println(S);
    }
}
