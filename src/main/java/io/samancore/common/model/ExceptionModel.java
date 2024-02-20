package io.samancore.common.model;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import io.samancore.common.error.HttpStatusEnum;
import io.samancore.common.error.Severity;

import java.util.Date;
import java.util.List;

@Value
@Jacksonized
@Builder(
        setterPrefix = "set",
        builderMethodName = "newBuilder",
        toBuilder = true
)
public class ExceptionModel {
    HttpStatusEnum httpStatus;
    int exceptionValue;
    String cause;
    Severity severity;
    List<String> subErrors;
    Date timestamp;
}
