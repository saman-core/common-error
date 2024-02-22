package io.samancore.common.error.util;

import io.samancore.common.error.Exceptions;
import io.samancore.common.error.LocalException;
import io.samancore.common.error.exception.BusinessException;
import io.samancore.common.error.exception.TechnicalException;
import io.samancore.common.error.message.TechnicalExceptionsEnum;

import jakarta.ws.rs.NotFoundException;
import java.util.Collections;
import java.util.List;

public class ExceptionHandler {

    private ExceptionHandler() {
    }

    public static RuntimeException throwNotFoundOrLocal(Exceptions exceptionType, Throwable error) {
        return throwNotFoundOrLocal(exceptionType, error, Collections.emptyList());
    }

    public static RuntimeException throwNotFoundOrLocal(Exceptions exceptionType, Throwable error, List<String> subErrors) {
        if (error instanceof NotFoundException || error instanceof LocalException) {
            return (RuntimeException) error;
        } else {
            if (exceptionType instanceof TechnicalExceptionsEnum)
                return new TechnicalException(exceptionType, error, subErrors);
            else
                return new BusinessException(exceptionType, error, subErrors);
        }
    }
}
