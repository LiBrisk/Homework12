package ru.netology;
public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(int id) {
        super("Товар с таким ID \" + id + \" уже существует");

    }
}
