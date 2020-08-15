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
     *
     * @return  The triple [r,p,q] containing the result r
     * and coefficients p and q so that<br/>
     * r = p*a + q*b
     */
    public static int[] ggT( int a, int b ) {
        if( b > a ) return ggT(b,a);
        if( b == 0  ||  a == b ) {
            return new int[] {a, 1, 0};
        }

        int[] ggT = ggT(b, modulo(a, b));
        int r = ggT[0];
        int p = ggT[2];
        int q = ggT[1] - (a/b) * ggT[2];
        return new int[] {r, p, q};
    }

    public static void main(String[] args){
        System.out.println( "\nModulo operation" );
        System.out.println( "22 / 4 =  " + (22/4) );
        System.out.println( "22 % 4 =  " + modulo(22,4) );
        System.out.println( "-5 % 3 =  " + modulo(-5,3) );

        System.out.println( "\nGreatest common divisor" );
        System.out.println( "ggT(1020,768)  = " + ggT(1020,768)[0] );
        System.out.println( "ggT(768,1020)  = " + ggT(768,1020)[0] );
        System.out.println( "ggT(3619,1771) = " + ggT(3619,1771)[0] );

        System.out.println( "\nExtended Euclidean algorithm" );
        int[] ggT = ggT( 125, 55 );
        System.out.println( "ggT(125,25)   = " + ggT[0] + " = " + ggT[1] + "*125 + " + ggT[2] + "*55" );
        ggT = ggT( 1020, 768 );
        System.out.println( "ggT(1020,768) = " + ggT[0] + " = " + ggT[1] + "*1020 + " + ggT[2] + "*768" );
    }
}
