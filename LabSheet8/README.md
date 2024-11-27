# LAB-SHEET-8
## How to Run the Code

### Clone the repository:
```bash
git https://github.com/Kritika268/Lab-Sheet-8
cd Lab-Sheet-8
```
### Product Management System
To Run Product Management System:
```bash
cd Product Management System
javac javac ProductManagementSystem.java
java ProductManagementSystem
```
##### Output 

```bash
1. Add Product
2. Update Product
3. Delete Product
4. Display Products
5. Sort Products
6. Search Product
0. Exit
Enter choice:1

# Add Products
Enter Product ID: 101
Enter Product Name: Laptop
Enter Category: Electronics
Enter Price: 1200.50
Enter Rating: 4.5

Enter Product ID: 102
Enter Product Name: Smartphone
Enter Category: Electronics
Enter Price: 800.00
Enter Rating: 4.7

Enter Product ID: 103
Enter Product Name: CoffeeMaker
Enter Category: HomeAppliances
Enter Price: 150.00
Enter Rating: 4.2


# Display Products
ID: 101, Name: Laptop, Category: Electronics, Price: 1200.5, Rating: 4.5
ID: 102, Name: Smartphone, Category: Electronics, Price: 800.0, Rating: 4.7
ID: 103, Name: CoffeeMaker, Category: HomeAppliances, Price: 150.0, Rating: 4.2

# Sort Products
Choose sort criteria (p: Price, r: Rating, n: Name): p
Choose sort type (1: Insertion Sort, 2: Quick Sort): 2


# Again Display
ID: 103, Name: CoffeeMaker, Category: HomeAppliances, Price: 150.0, Rating: 4.2
ID: 102, Name: Smartphone, Category: Electronics, Price: 800.0, Rating: 4.7
ID: 101, Name: Laptop, Category: Electronics, Price: 1200.5, Rating: 4.5

# Update Product
Enter Product ID to update: 103
Enter New Name: AdvancedCoffeeMaker
Enter New Category: KitchenAppliances
Enter New Price: 200.00
Enter New Rating: 4.8

# Again Display
ID: 101, Name: Laptop, Category: Electronics, Price: 1200.5, Rating: 4.5
ID: 102, Name: Smartphone, Category: Electronics, Price: 800.0, Rating: 4.7
ID: 103, Name: AdvancedCoffeeMaker, Category: KitchenAppliances, Price: 200.0, Rating: 4.8

# Delete a Product
Input- Enter Product ID to delete: 102
Product deleted.

# Again Display
ID: 101, Name: Laptop, Category: Electronics, Price: 1200.5, Rating: 4.5
ID: 103, Name: AdvancedCoffeeMaker, Category: KitchenAppliances, Price: 200.0, Rating: 4.8

# Exit
Enter choice: 0
Exiting...
```