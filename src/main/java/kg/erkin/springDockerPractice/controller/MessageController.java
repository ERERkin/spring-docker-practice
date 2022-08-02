package kg.erkin.springDockerPractice.controller;

import kg.erkin.springDockerPractice.entity.Message;
import kg.erkin.springDockerPractice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(messageService.get(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Message message){
        return ResponseEntity.ok(messageService.save(message));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(messageService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        messageService.delete(id);
        return ResponseEntity.ok().build();
    }
}
