package be.ucll.TaskManagerProject.Repository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Task not found")
public class RepositoryException extends RuntimeException {
    RepositoryException(){
        super();
    }

    RepositoryException(String message){
        super(message);
    }}
