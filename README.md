# learning_generics_set_map
This is a compilade of codes, showing uses for generic, map and set in java programming language 

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Set Interface ---
The Java.util package provides the Set interface. Set is implemented by extending the collection interface. 
It doesn't allow us to add the same element to it. It doesn't maintain the insertion order because it contains elements in a sorted way. 
For designing the mathematical Set, we use the Set interface in Java.


Map Interface ---
Map is another important interface available in the Collection interface. So, in order to use the Map interface, we have to extend the Collection interface. 
Just like Set, Map is also used for storing collection of objects as a single unit. Each object is store in a key-value pair. 
We can easily access the value using just the key because each value is associated with a unique value.


Difference Between Set and Map Interfaces ---
Both interfaces are used to store the collection of objects as a single unit. 
The main difference between Set and Map is that Set contains only data elements, and the Map contains the data in the key-value pair, 
so Map contains key and its value.

Now, let's understand some major differences between both of them.


1.	Set is used to construct the mathematical Set in Java.	Map is used to do mapping in the database.
2.	Set cannot contain repeated values.	Map can have the same value for different keys.
3.	Set doesn't allow us to add the same elements in it. Each class that implements the Set interface contains only the unique value.
    Map contains unique key and repeated values. In Map, one or more keys can have the same values, but two keys cannot be the same.
4.	We can easily iterate the Set elements using the keyset() and the entryset() method of it.
    Map elements cannot be iterated. We need to convert Map into Set for iterating the elements.
5.	Insertion order is not maintained by the Set interface. However, some of its classes, like LinkedHashSet, maintains the insertion order.
    The insertion order is also not maintained by the Map. However, some of the Map classes like TreeMap and LinkedHashMap does the same.

   Source: https://www.javatpoint.com/set-vs-map-in-java

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
