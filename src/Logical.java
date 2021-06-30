public class Logical {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        boolean c = true;
        boolean d = false;
        System.out.println(a^b);
        System.out.println(a & b);
        System.out.println(a|b);
        if (a != b){
            System.out.println(a);
        }
        if (d && c){
            System.out.println(a);
        }
        if (d || c){
            System.out.println(a);
        }
        if (a == b){
            System.out.println(a);
        }
    }
}
