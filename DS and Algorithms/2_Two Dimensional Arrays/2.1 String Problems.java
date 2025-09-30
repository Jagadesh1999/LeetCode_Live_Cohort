String Literals (The Pool) : 
----------------------------
When you create a string using double quotes (a String literal), Java is smart. It stores this string in a special place called the String Constant Pool 
(part of the Heap memory).
  
String s1 = "hello";
String s2 = "hello"; // Java reuses the SAME "hello" object from the Pool.

Key Concept: 
Because s1 and s2 have the exact same content, Java creates the string "hello" only once in the Pool and makes both s1 and s2 point to that single, 
shared memory location. This saves memory.

The new Keyword (The Heap) :
----------------------------
When you use the new keyword, you force Java to create a new object in the main memory called the Heap, regardless of whether the string content already exists in the Pool.

String s3 = new String("hello"); // Creates a brand-new object in the Heap.

Key Concept: s3 contains the same characters ("hello") as s1 and s2, but it lives at a different physical memory address.

Interview Rule : 
--------------- 
NEVER use == to compare String content. It only tells you if they are the exact same object.
The .equals() method is designed to compare the actual content (the sequence of characters) of two String objects. // (s1.equals(s3));
