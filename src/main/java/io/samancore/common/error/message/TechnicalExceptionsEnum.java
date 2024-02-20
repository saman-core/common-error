package io.samancore.common.error.message;

import io.samancore.common.error.Exceptions;

import java.util.Arrays;
import java.util.Optional;

public enum TechnicalExceptionsEnum implements Exceptions {
    NOT_SPECIFIED_ERROR(50000, "Not specified error"),
    SCHEMA_CREATE_STATEMENT(50001, "Schema Create Statement"),
    REPOSITORY_ERROR(50002, "Repository Error"),
    TRANSFORMER_OBJECT_ERROR(50003, "Transformer Object error"),
    STRING_HANDLING_ERROR(50004, "String Handling Error"),
    CREATE_USER_ERROR(50005, "Could not create user in keycloack"),
    ADD_ROLE_TO_USER_ERROR(50006, "Could not add role to user in keycloack"),
    LOAD_USER_ERROR(50007, "Could not load the user from keycloack"),
    HTTP_CLIENT_STATUS_CODE_ERROR(50008, "Response status code received is not the expected"),
    HCAPTCHA_COULD_NOT_CONNECT_ERROR(50009, "The response was incorrect in request to hCaptcha server"),
    HCAPTCHA_ERROR_RESPONSE(50010, "Errors present in request to hcaptcha server"),
    HCAPTCHA_PROCESS_ERROR(50011, "Error processing request to hcaptcha server"),
    PROGRAM_INVALID(50012, "Program not exist"),
    INVALID_REQUEST(50013, "Error processing the request, has invalid io.samancore.data"),
    INVALID_STATUS_ACTION(50014, "Error processing excutor, has invalid action to handle");


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
