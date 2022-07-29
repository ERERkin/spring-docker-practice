package kg.erkin.springDockerPractice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/check")
    public ResponseEntity<?> check(){
        return ResponseEntity.ok("Success");
    }
}
