package kg.erkin.springDockerPractice.service;

import kg.erkin.springDockerPractice.entity.Message;
import kg.erkin.springDockerPractice.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message get(Long id){
        return messageRepository.findById(id).orElseThrow(() -> new RuntimeException("Message not found"));
    }

    public Message save(Message message){
        return messageRepository.save(message);
    }

    public List<Message> getAll(){
        return messageRepository.findAll();
    }

    public void delete(Long id){
        get(id);
        messageRepository.deleteById(id);
    }
}
