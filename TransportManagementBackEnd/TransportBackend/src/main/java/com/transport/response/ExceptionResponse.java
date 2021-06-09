package com.transport.response;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class ExceptionResponse {
    @NonNull
    private String httpCode;
    @NonNull
    private String message;
}
