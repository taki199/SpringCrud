package dev.houcine.runner.run;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RunNotFoundException extends RuntimeException {
    public RunNotFoundException(){
        super("Run Not Found");
    }
}
