public class Java14 {

    public static void main( String[] args ) {
        var myRecord = new MyRecord( 42, "Hello records" );
        System.out.println(  myRecord  );
        System.out.println(  new MyRecord( -1 )  );
    }
}
