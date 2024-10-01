package tech.joaor.beanstalk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController  {

    @GetMapping()
    public ResponseEntity<ApiResponse> helloAws() {
        return ResponseEntity.ok(new ApiResponse("Hello AWS, updated"));
    }
}
