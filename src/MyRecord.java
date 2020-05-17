public record MyRecord( int number, String text ) {

    MyRecord( int number ) {
        this(number, "This is a default value.");
    }
}
