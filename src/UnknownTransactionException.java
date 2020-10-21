/**
 * CECS 277-07
 * Project 4 - Project File I/O
 * Professor Mimi Opkins
 * @author Ryan Ignasiak, Tina Vu, Matthew Chen
 * 10/21/20
 */

/**
 * Custom exception to handle unknown transaction exceptions
 */
public class UnknownTransactionException extends Exception {
    public UnknownTransactionException() {}

    public UnknownTransactionException(String message) {
        super(message);
    }
}
