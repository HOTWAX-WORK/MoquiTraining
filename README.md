# Moqui API Training

This document provides an overview of the API endpoints available in the Moqui system for managing parties, contacts, products, and orders. Each section demonstrates the API operations with relevant screenshots to illustrate the expected input and output.


## Party Management

### 1. Get All Parties
Fetch all parties from the system.

![Get Parties](img/img_4.png)

### 2. Get Specific Party
Fetch details of a particular party by its ID.

![Get Particular Party](img/img_5.png)

If party does not exsists
![img.png](img/img23.png)

### 3. Update Party
Update details of an existing party.

![Update Party](img/img_6.png)

### 4. Delete Party
Remove a party from the system.

![Delete Party](img/img_7.png)

Cannot Remove party if it has oders
![img_1.png](img/img_24.png)

### 5. Add Party
Add a new party to the system.

![Add Party](img/img_9.png)

---

## Contact Management

### 6. Get Contact
Fetch details of a specific contact.

![Get Contact](img/img_10.png)

### 7. Delete Contact
Delete a contact from the system.

![Delete Contact](img/img_11.png)

Cannot delete contact because it has Orders

![img_2.png](img/img_26.png)

if we try to delete contact by id, but it is not for the provided party Id

![img.png](img/img_29.png)

### 8. Add Contact
Add a new contact to the system.

![Add Contact](img/img_12.png)

### 9. Update Contact
Update an existing contact's details.

![Update Contact](img/img_13.png)

if we try to update contact by id, but it is not for the provided party Id 
![img.png](img/img_28.png)

---

## Product Management

### 10. Get All Products
Fetch all products available in the system.

![Get Product](img/img_15.png)

### 11. Get Specific Product
Fetch details of a specific product by its ID.

![Get Single Product](img/img_18.png)

### 12. Add Product
Add a new product to the system.

![Add Product](img/img_16.png)

### 13. Update Product
Update an existing product's details.

![Update Product](img/img_17.png)

### 14. Delete Product
Remove a product from the system.

![Delete Product](img/img_14.png)

---

## Order Management

### 15. Get All Orders
Fetch all orders from the system.

![Get Orders](img/img.png)

### 16. Add Order
Create a new order.

![Add Order](img/img_19.png)

If the shiping or biling id is not correct for that party
![img_3.png](img/img_23.png)

### 17. Update Order
Update details of an existing order.

![Update Order](img/img_20.png)

If the shiping or biling id is not correct for that party
![img_4.png](img/img_25.png)

### 18. Delete Order
Delete an order from the system.

![Delete Order](img/img_1.png)

### 19. Add Order Item
Add an item to an existing order.

![Add Order Item](img/img_21.png)

### 20. Delete Order Item
Remove an item from an order.

![Delete Order Item](img/img_22.png)

---

## Conclusion

This README provides a visual guide to interacting 
with Moqui's API for managing parties, contacts, products,
and orders. For further details on authentication and error
handling, please refer to the Moqui API documentation.
