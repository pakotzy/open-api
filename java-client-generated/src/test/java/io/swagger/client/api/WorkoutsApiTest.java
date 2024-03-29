/*
 * Gym
 * A set of workout centric endpoints
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.InlineResponse404;
import io.swagger.client.model.Workout;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WorkoutsApi
 */
@Ignore
public class WorkoutsApiTest {

    private final WorkoutsApi api = new WorkoutsApi();

    /**
     * Retrieve all information about specific workout
     *
     * Takes workout id from path parameter, finds all information about this specific workout and returns it
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWorkoutByIdTest() throws Exception {
        Workout response = api.getWorkoutById();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void workoutsGetTest() throws Exception {
        api.workoutsGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void workoutsPostTest() throws Exception {
        api.workoutsPost();

        // TODO: test validations
    }
}
