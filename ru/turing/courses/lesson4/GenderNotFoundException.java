package ru.turing.courses.lesson4;

public class GenderNotFoundException extends IllegalArgumentException {
    /**
     * Исключение без детального сообщения
     */
    public GenderNotFoundException() {
        super();
    }

    /**
     * Исключение с указанным детальным сообщением
     * @param message   детальное сообщение
     */
    public GenderNotFoundException(String message) {
        super(message);
    }

    /**
     * Исключение с указанной причиной
     * @param cause указанная причина
     */
    public GenderNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Исключение с указанной причиной и детальным сообщением
     * @param message   детальное сообщение
     * @param cause указанная причина
     */
    public GenderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
