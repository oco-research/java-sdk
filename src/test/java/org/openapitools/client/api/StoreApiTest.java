/*
* Garage Week 2021. All rights reserved.
* Your custom license text goes here.
*/


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private final StoreApi api = new StoreApi();

    
    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws ApiException {
        Long orderId = null;
                api.deleteOrder(orderId);
        // TODO: test validations
    }
    
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() throws ApiException {
                Map<String, Integer> response = api.getInventory();
        // TODO: test validations
    }
    
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        Long orderId = null;
                Order response = api.getOrderById(orderId);
        // TODO: test validations
    }
    
    /**
     * Place an order for a pet
     *
     * Place a new order in the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() throws ApiException {
        Order order = null;
                Order response = api.placeOrder(order);
        // TODO: test validations
    }
    
}
