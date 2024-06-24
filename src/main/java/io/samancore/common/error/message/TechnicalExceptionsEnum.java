package io.samancore.common.error.message;

import io.samancore.common.error.Exceptions;

import java.util.Arrays;
import java.util.Optional;

public enum TechnicalExceptionsEnum implements Exceptions {
    NOT_SPECIFIED_ERROR(50000, "Not specified error"),
    SCHEMA_CREATE_STATEMENT(50001, "Schema Create Statement"),
    REPOSITORY_ERROR(50002, "Repository Error"),
    TRANSFORMER_OBJECT_ERROR(50003, "Transformer Object error"),
    INVALID_REQUEST(50004, "Error processing the request, has invalid io.samancore.data"),
    INVALID_STATUS_ACTION(50005, "Error processing excutor, has invalid action to handle"),
    PROCESSING_CONDITION_ERROR(50006, "Error processing excutor, has invalid action to handle");


    private final int value;
    private final String description;

    TechnicalExceptionsEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Optional<TechnicalExceptionsEnum> valueOf(final int value) {
        return Arrays.stream(values())
                .filter(exceptionsEnum -> exceptionsEnum.value == value)
                .findFirst();
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
