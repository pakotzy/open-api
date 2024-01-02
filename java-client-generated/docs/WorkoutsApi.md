# WorkoutsApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkoutById**](WorkoutsApi.md#getWorkoutById) | **GET** /workouts/{id} | Retrieve all information about specific workout
[**workoutsGet**](WorkoutsApi.md#workoutsGet) | **GET** /workouts | 
[**workoutsPost**](WorkoutsApi.md#workoutsPost) | **POST** /workouts | 

<a name="getWorkoutById"></a>
# **getWorkoutById**
> Workout getWorkoutById()

Retrieve all information about specific workout

Takes workout id from path parameter, finds all information about this specific workout and returns it

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WorkoutsApi;


WorkoutsApi apiInstance = new WorkoutsApi();
try {
    Workout result = apiInstance.getWorkoutById();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkoutsApi#getWorkoutById");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Workout**](Workout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workoutsGet"></a>
# **workoutsGet**
> workoutsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WorkoutsApi;


WorkoutsApi apiInstance = new WorkoutsApi();
try {
    apiInstance.workoutsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling WorkoutsApi#workoutsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="workoutsPost"></a>
# **workoutsPost**
> workoutsPost()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WorkoutsApi;


WorkoutsApi apiInstance = new WorkoutsApi();
try {
    apiInstance.workoutsPost();
} catch (ApiException e) {
    System.err.println("Exception when calling WorkoutsApi#workoutsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

