
# CustomStringList

The `CustomStringList` class provides functionality for working with an array of strings.

## Usage

### Creating an Object

```java
// Creating an object by passing a list of strings
String[] initialList = {"apple", "banana", "orange"};
CustomStringList customList = new CustomStringList(initialList);

// Creating an empty object
CustomStringList emptyList = new CustomStringList();
Methods
check(String str)
The check method checks for the presence of a string in the list.

java
Copy code
boolean exists = customList.check("apple");
check(String[] arr)
The check method checks for the presence of all strings from the given array.

java
Copy code
String[] words = {"apple", "banana"};
boolean allExist = customList.check(words);
longestWord()
The longestWord method returns the longest word from the list.

java
Copy code
String longest = customList.longestWord();
getList()
The getList method returns the entire list of strings.

java
Copy code
String[] allWords = customList.getList();
add(String str)
The add method adds a string to the list.

java
Copy code
customList.add("grape");
addIfNotExists(String str)
The addIfNotExists method adds a string to the list if it doesn't already exist.

java
Copy code
customList.addIfNotExists("apple");
Important
This class implements functionality for working with an array of strings and provides methods for checking presence, adding, and retrieving strings.

