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

    /**
     * Uses the euclidean algorithm to calculate the
     * greatest common divisor
     */
    public static int ggT( int a, int b ) {
        if( b == 0  ||  a == b ) return a;
        if( a > b ) return ggT( b, modulo(a,b) );
        return ggT(b,a);
    }

    public static void main(String[] args){
        System.out.println( "22 / 5 =  " + (22/4) );
        System.out.println( "22 % 5 =  " + modulo(22,4) );
        System.out.println( "-5 % 3 =  " + modulo(-5,3) );
        System.out.println( "ggT(1020,768)  = " + ggT(1020,768) );
        System.out.println( "ggT(768,1020)  = " + ggT(768,1020) );
        System.out.println( "ggT(3619,1771) = " + ggT(3619,1771) );
    }
}
