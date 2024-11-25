package dev.houcine.runner.run;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {
    private List<Run> runs= new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }
    Optional<Run> findById(Integer id){
        return runs.stream()
                .filter(run -> run.id() == id)
                .findFirst();
    }
    void create(Run run){
        runs.add(run);
    }
    void delete(Integer id) {
        Optional<Run> existedRun = findById(id);
        existedRun.ifPresent(runs::remove); // Remove the existing Run object if found
    }
    public void update(Run run, Integer id) {
        Optional<Run> existedRun = findById(id);
        if (existedRun.isPresent()) {
            runs.set(runs.indexOf(existedRun.get()), run);
        }
    }
    @PostConstruct
    private void init(){
        runs.add(new Run(1,"Monday Morining Run", LocalDateTime.now(),LocalDateTime.now().plus(30, ChronoUnit.MINUTES),3,Location.INDOOR));
        runs.add(new Run(2,"wednesday Evening Run", LocalDateTime.now(),LocalDateTime.now().plus(30, ChronoUnit.MINUTES),3,Location.INDOOR));

    }
}
