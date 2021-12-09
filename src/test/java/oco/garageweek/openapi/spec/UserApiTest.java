/*
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * The version of the OpenAPI document: 1.1.9
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package oco.garageweek.openapi.spec;

import oco.garageweek.openapi.ApiException;
import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User user = null;
                User response = api.createUser(user);
        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * Creates list of users with given input array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() throws ApiException {
        List<User> user = null;
                User response = api.createUsersWithListInput(user);
        // TODO: test validations
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String username = null;
                api.deleteUser(username);
        // TODO: test validations
    }
    
    /**
     * Get user by user name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByNameTest() throws ApiException {
        String username = null;
                User response = api.getUserByName(username);
        // TODO: test validations
    }
    
    /**
     * Logs user into the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginUserTest() throws ApiException {
        String username = null;
        String password = null;
                String response = api.loginUser(username, password);
        // TODO: test validations
    }
    
    /**
     * Logs out current logged in user session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutUserTest() throws ApiException {
                api.logoutUser();
        // TODO: test validations
    }
    
    /**
     * Update user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String username = null;
        User user = null;
                api.updateUser(username, user);
        // TODO: test validations
    }
    
}
