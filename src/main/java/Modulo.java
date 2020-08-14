public class Modulo {

    /**
     * for a,b in Z there exist unique numbers q,r in Z with
     * a = b*q + r and 0 <= r < |b|
     */
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
