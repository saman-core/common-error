package io.samancore.common.error.exception;

import io.samancore.common.error.Exceptions;
import io.samancore.common.error.LocalException;
import io.samancore.common.error.Severity;

import java.io.Serial;
import java.util.List;

public class BusinessException extends LocalException {
    @Serial
    private static final long serialVersionUID = -6763313465156783374L;

    public BusinessException(Exceptions exceptions) {
        super(exceptions);
    }

    public BusinessException(Exceptions exceptions, Throwable cause) {
        super(exceptions, cause);
    }

    public BusinessException(Exceptions exceptions, Severity severity) {
        super(exceptions, severity);
    }

    public BusinessException(Exceptions exceptions, Throwable cause, Severity severity) {
        super(exceptions, cause, severity);
    }

    public BusinessException(Exceptions exceptions, List<String> subErrors) {
        super(exceptions, subErrors);
    }

    public BusinessException(Exceptions exceptions, Throwable cause, List<String> subErrors) {
        super(exceptions, cause, subErrors);
    }

    public BusinessException(Exceptions exceptions, Severity severity, List<String> subErrors) {
        super(exceptions, severity, subErrors);
    }

    public BusinessException(Exceptions exceptions, Throwable cause, Severity severity, List<String> subErrors) {
        super(exceptions, cause, severity, subErrors);
    }
}
