package by.bsuir.publisher.exceptions;

public class EntityExistsException extends Exception {
    public EntityExistsException(String note) {
        super(note);
    }
}
