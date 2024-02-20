package io.samancore.common.error.util;

import io.samancore.common.error.HttpStatusEnum;
import io.samancore.common.error.LocalException;
import io.samancore.common.error.exception.TechnicalException;
import io.samancore.common.model.ExceptionModel;

public class ExceptionConverter {

    private ExceptionConverter() {
    }

    public static ExceptionModel toModel(LocalException exception) {
        HttpStatusEnum httpStatusEnum;
        if (exception instanceof TechnicalException) {
            httpStatusEnum = HttpStatusEnum.TECHNICAL_EXCEPTION;
        } else {
            httpStatusEnum = HttpStatusEnum.BUSINESS_EXCEPTION;
        }

        var cause = exception.getCause();
        var causeMessage = String.valueOf(cause);
        if (cause != null && cause.getStackTrace() != null && cause.getStackTrace().length > 0) {
            causeMessage = causeMessage.concat("; StackTrace[0]: ").concat(String.valueOf(cause.getStackTrace()[0]));
        }

        return ExceptionModel.newBuilder()
                .setHttpStatus(httpStatusEnum)
                .setExceptionValue(exception.getExceptions().getValue())
                .setCause(causeMessage)
                .setSeverity(exception.getSeverity())
                .setSubErrors(exception.getSubErrors())
                .build();
    }
}
