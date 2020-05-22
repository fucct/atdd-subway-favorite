package wooteco.subway.web.member;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import wooteco.subway.web.error.ErrorResponse;

@RestControllerAdvice
public class GlobalMemberExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> temporalExceptionHandler(RuntimeException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    }
}
