#Fuente: https://en.wikibooks.org/

#1. Select the name of the products with a price less than or equal to $200.
show tables;
desc Products;

select Name
from Products
where Price <= 200;

#2. Select all the products with a price between $60 and $120.
select *
from Products
where Price between 60 and 120;

#3. Select the name and price in cents (i.e., the price must be multiplied by 100).
select Name, (Price * 100)
from Products;


#4. Compute the average price of all the products.
select avg(Price)
from Products;

#5. Compute the average price of all products with manufacturer code equal to 2.
select avg(Price)
from Products
where Manufacturer = 2;

#6. Compute the number of products with a price larger than or equal to $180.
select count(*)
from Products
where Price >= 180;

#7. Select the name and price of all products with a price larger than or
# equal to $180, and sort first by price(in descending order), and then by name (in ascending order).
select Name, Price
from Products
where Price >= 180
order by Price desc, Name;

