package io.samancore.common.error.message;

import io.samancore.common.error.Exceptions;

import java.util.Arrays;
import java.util.Optional;

public enum BusinessExceptionsEnum implements Exceptions {
    NOT_SPECIFIED_ERROR(40000, "Not specified error"),
    CONDITION_VALIDATE_ERROR(40001, "There are some validate conditions with error "),
    VALIDATE_REQUEST_ERROR(40002, "There are some values with error ");

    private final int value;
    private final String description;

    BusinessExceptionsEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Optional<BusinessExceptionsEnum> valueOf(final int value) {
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
