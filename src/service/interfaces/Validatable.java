package service.interfaces;

public interface Validatable<T> {

    boolean isValid(T obj);

    default void validateOrThrow(T obj) {
        if (!isValid(obj)) {
            throw new IllegalArgumentException("Validation failed");
        }
    }

    static boolean notEmpty(String value) {
        return value != null && !value.isBlank();
    }
}