package finalwork.database;

public class FieldIsEmptyException extends Exception {
    public FieldIsEmptyException(String description){
        super(description);
    }
}
