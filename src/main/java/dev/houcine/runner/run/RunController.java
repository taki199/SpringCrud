package dev.houcine.runner.run;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

  private final RunRepository runRepository;

  public RunController(RunRepository runRepository){
    this.runRepository = runRepository;
  }

 /* @GetMapping("")
  public List<Run> findAll() {
    return runRepository.findAll();
  }

  @GetMapping("/{id}")  // Dynamic id in the URL
    Run findById(@PathVariable Integer id) {  // @PathVariable to bind id from the URL
    Optional<Run> run=runRepository.findById(id);
    if(run.isEmpty()){
      throw new RunNotFoundException();
    }
    return run.get();

  }
  //Post
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  void  create (@Valid @RequestBody  Run run){
    runRepository.create(run);
  }
  //put
@ResponseStatus(HttpStatus.NO_CONTENT)
  @PutMapping("/{id}")
  void UpdateRun (@Valid @RequestBody Run run,@PathVariable Integer id ){
    runRepository.update(run,id);

  }
  //Delete
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("/{id}")
  void delete(@PathVariable Integer id) {
    runRepository.delete(id);
  } */

}
