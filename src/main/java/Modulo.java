public class Modulo {

    public static int modulo( int a, int b ) {
        int r = a % b;
        if( r < 0 ) {
            return r+b;
        }
        return r;
    }

    public static void main(String[] args){
        System.out.println( "22 / 5 =  " + (22/4) );
        System.out.println( "22 % 5 =  " + modulo(22,4) );
        System.out.println( "-5 % 3 =  " + modulo(-5,3) );
    }
}
