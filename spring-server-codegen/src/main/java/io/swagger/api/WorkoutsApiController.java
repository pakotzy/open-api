package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Exercise;
import io.swagger.model.Movement;
import io.swagger.model.Set;
import io.swagger.model.Workout;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")
@RestController
public class WorkoutsApiController implements WorkoutsApi {

    private static final Logger log = LoggerFactory.getLogger(WorkoutsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkoutsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Workout> getWorkoutById(Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Movement movement = new Movement().id(0).name("Deadlifts").instructions("Not going to repeat them");
            Set set = new Set().reps(20).weight(0);
            Exercise exercise = new Exercise().comment("Server side code generation is very bad").restPeriod(60).movement(movement)
                    .sets(Collections.singletonList(set));
            Workout workout = new Workout().startedAt(LocalDateTime.now()).finishedAt(LocalDateTime.now().plusHours(1))
                    .restPeriod(60).exercises(Collections.singletonList(exercise));
            return new ResponseEntity<>(workout, HttpStatus.OK);
        }

        return new ResponseEntity<Workout>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> workoutsGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> workoutsPost() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
