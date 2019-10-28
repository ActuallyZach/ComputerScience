# Lesson 1 - 10/24/2019 --> Java Classes and Methods
## What is a class?
A class in java is a blueprint that the user creates. From these blueprints(classes) you can create objects. A simple void class is as follows --.
```js
public class person() {
  String name;
  int age;
  bool sick, married;

  public person(String Name, int Age, bool Sick, bool Married) {
    /*
    This is the constructor it is a method with the same name as the class. This tells java how you will construct your objects created from the class.
    */
    name = Name;
    age = Age;
    sick = Sick;
    married = Married;

  }
  /*
  Methods not shown
  */
}

```
That was a simple class named person. You could create an object with this class by using the code:
```
person Larry = new Person("Lerroy", 24, false, false);
```
This will construct the object Lerroy with the class person. You can see that we use the constructor we set up before when creating this new object, you can see that in action when we enter the Name, age, sick, married variable after declaring new Person.

## What types of methods are there
There are many different types of methods the user can create and insert into their classes. Assume all of these methods are found within the person class They are as follows -->
### Void Type
The first method is the void method which is simply
```js
public void displayName() {
  System.out.println(name);

}
```
Notice how the void method has no return statement. This is because it requires none. This can be called by,
```js
Lerroy.displayName();
```

### Integer type
The int method returns an integer when it is completed. An example is
```js
public int returnAge() {

  return age;
}
```
Notice how this method does return a value. It returns the variable age. This can be called by,
```js
System.out.println("Age: " + Lerroy.returnAge());
```
This will print out Age: 24, this is because it calls the method returnAge from the object Lerroy.


<-- [Back](https://zxtreme03.github.io/ComputerScience/lessonsPage)
