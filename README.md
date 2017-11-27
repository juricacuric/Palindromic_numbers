## Palindromic number task 

As requested in the email, the problem is solved in Java. Maven is used as a package manager. Although commiting binary files to git is usually considered as a bad practice, for this purpose I commited target folder with executable just in case you don't want to build the solution, but only to run it.

## Solution

The result for default input(first 1000 numbers) is generated in the file result.csv 

## Building source code

If you want to build the source code you will need [Maven](https://maven.apache.org/). Once you have it installed go to root folder of the project and type `mvn clean package`. After that the existing target folder will be deleted and the new palindrome-number-1.0.jar will be created in the target folder.

## Running tests
If you want to run all test, got to project root folder and type `mvn test`.

## Running code
In order to run the .jar file go to project root folder and type `java -jar target/palindrome-number-1.0.jar`. That will generate result.csv file in the root folder of the project (and overwrite the existing result.csv). If you want to generate the result for some other number(e.g. 5000) and to generate result file in some other location(e.g your desktop) you can write  `java -jar target/palindrome-number-1.0.jar 5000 /home/jurica/Desktop/result.csv`. This will create file for first 5000 elements on your desktop. First parameter is the max number for which you want to check palindromes and the second parameter is the result file location.