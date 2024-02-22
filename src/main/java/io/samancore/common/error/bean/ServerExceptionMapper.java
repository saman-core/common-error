package io.samancore.common.error.bean;

import io.samancore.common.error.HttpStatusEnum;
import io.samancore.common.error.LocalException;
import io.samancore.common.error.util.ExceptionConverter;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ServerExceptionMapper implements ExceptionMapper<LocalException> {

    @Override
    public Response toResponse(LocalException exception) {
        var model = ExceptionConverter.toModel(exception);

        var httpStatus = model.getHttpStatus() == HttpStatusEnum.TECHNICAL_EXCEPTION ? 573 : 473;
        return Response.serverError()
                .status(httpStatus)
                .type(MediaType.APPLICATION_JSON)
                .entity(model)
                .build();
    }
}
