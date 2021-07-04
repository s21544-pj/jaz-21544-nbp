package pl.pjatk.jazs21544nbp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<String> handle400(HttpClientErrorException exception) {
        HttpStatus status = exception.getStatusCode();
        System.out.println(exception);
        return ResponseEntity.status(status).body("Something went wrong");
    }
}
