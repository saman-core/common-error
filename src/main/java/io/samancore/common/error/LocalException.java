package io.samancore.common.error;

import lombok.Getter;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class LocalException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 6622336018184691970L;
    private final Exceptions exceptions;
    private final Throwable cause;
    private final Severity severity;
    private final List<String> subErrors;

    protected LocalException(Exceptions exceptions) {
        super(exceptions.getDescription());
        this.exceptions = exceptions;
        this.cause = new Throwable(exceptions.getDescription());
        this.severity = Severity.ERROR;
        this.subErrors = new ArrayList<>();
    }

    protected LocalException(Exceptions exceptions, Throwable cause) {
        super(exceptions.getDescription(), cause);
        this.exceptions = exceptions;
        this.cause = cause;
        this.severity = Severity.ERROR;
        this.subErrors = new ArrayList<>();
    }

    protected LocalException(Exceptions exceptions, Severity severity) {
        super(exceptions.getDescription());
        this.exceptions = exceptions;
        this.cause = new Throwable(exceptions.getDescription());
        this.severity = severity;
        this.subErrors = new ArrayList<>();
    }

    protected LocalException(Exceptions exceptions, Throwable cause, Severity severity) {
        super(exceptions.getDescription(), cause);
        this.exceptions = exceptions;
        this.cause = cause;
        this.severity = severity;
        this.subErrors = new ArrayList<>();
    }

    protected LocalException(Exceptions exceptions, List<String> subErrors) {
        super(exceptions.getDescription());
        this.exceptions = exceptions;
        this.cause = new Throwable(exceptions.getDescription());
        this.severity = Severity.ERROR;
        this.subErrors = subErrors;
    }

    protected LocalException(Exceptions exceptions, Throwable cause, List<String> subErrors) {
        super(exceptions.getDescription(), cause);
        this.exceptions = exceptions;
        this.cause = cause;
        this.severity = Severity.ERROR;
        this.subErrors = subErrors;
    }

    protected LocalException(Exceptions exceptions, Severity severity, List<String> subErrors) {
        super(exceptions.getDescription());
        this.exceptions = exceptions;
        this.cause = new Throwable(exceptions.getDescription());
        this.severity = severity;
        this.subErrors = subErrors;
    }

    protected LocalException(Exceptions exceptions, Throwable cause, Severity severity, List<String> subErrors) {
        super(exceptions.getDescription(), cause);
        this.exceptions = exceptions;
        this.cause = cause;
        this.severity = severity;
        this.subErrors = subErrors;
    }
}
