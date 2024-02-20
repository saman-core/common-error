package io.samancore.common.error.exception;

import io.samancore.common.error.Exceptions;
import io.samancore.common.error.LocalException;
import io.samancore.common.error.Severity;

import java.io.Serial;
import java.util.List;

public class TechnicalException extends LocalException {
    @Serial
    private static final long serialVersionUID = 3035300635342681984L;

    public TechnicalException(Exceptions exceptions) {
        super(exceptions);
    }

    public TechnicalException(Exceptions exceptions, Throwable cause) {
        super(exceptions, cause);
    }

    public TechnicalException(Exceptions exceptions, Severity severity) {
        super(exceptions, severity);
    }

    public TechnicalException(Exceptions exceptions, Throwable cause, Severity severity) {
        super(exceptions, cause, severity);
    }

    public TechnicalException(Exceptions exceptions, List<String> subErrors) {
        super(exceptions, subErrors);
    }

    public TechnicalException(Exceptions exceptions, Throwable cause, List<String> subErrors) {
        super(exceptions, cause, subErrors);
    }

    public TechnicalException(Exceptions exceptions, Severity severity, List<String> subErrors) {
        super(exceptions, severity, subErrors);
    }

    public TechnicalException(Exceptions exceptions, Throwable cause, Severity severity, List<String> subErrors) {
        super(exceptions, cause, severity, subErrors);
    }
}
