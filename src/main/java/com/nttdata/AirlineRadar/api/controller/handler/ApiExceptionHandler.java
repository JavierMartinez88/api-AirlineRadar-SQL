package com.nttdata.AirlineRadar.api.controller.handler;

import com.nttdata.AirlineRadar.api.controller.rest.impl.model.AirlineRadarErrorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler({RuntimeException.class, Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public AirlineRadarErrorResponse unhandledErrors(final Exception e) {
        log.error(e.getMessage());
        return new AirlineRadarErrorResponse();
    }
}
