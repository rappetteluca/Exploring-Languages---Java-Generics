#  Exploring Languages Java Generics
## CS421

## Author(s):

Lucas Rappette

## Date:

3/16/18


## Description:

A program that implements predicates/higher order functions on classes through a Predicate interface.
The interface only accepts classes that meet a specific requirement, defined by the accept() function.
There is an additional readme for this project, which is the original assignment description.

This file is called _README.pdf_.


## How to build the software

Add this project to any Java IDE, it will automatically compile.
If this does not work execute the command below on the command line to build the project.

```
javac -d bin -sourcepath src src/*
```


## How to use the software

Create a test file with a main function to use the predicate features.

## How the software was tested

Testing was completed by using data-type like input arguments in order to stress
test java's type coercion and enforcement 


## Known bugs and problem areas

The implementation of predicates used in this project is inherently naive.
Java Generics are very funky in that Java and the JVM does not retain generic information of any objects instantiated with generic data types
__That is to say an object of type List<SomeClassKnown> when type checked will not return type List<SomeClassKnown>, rather it will return type List.__
_The difference is absolutely crucial when attempting to enforce type-checking, as all Lists of any type will be accepted by our predicates._
_The only solution is reflection, in which we get data back using an entirely new and different type of memory accessing to retrieve object information._