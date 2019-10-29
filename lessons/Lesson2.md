# Lesson 2 - 10/28/2019 --> Java Classes and Methods
## What is a class?
A class in java is a blueprint that the user creates. From these blueprints(classes) you can create objects. A simple void class is as follows --.
```js
public class person {
  private String name;
  private int age;
  private boolean sick, married;
  private double money;

  public person(String Name, int Age, boolean Sick, boolean Married, double Money) {
    /*
    This is the constructor it is a method with the same name as the class. This tells java how you will construct your objects created from the class.
    */
    name = Name;
    age = Age;
    sick = Sick;
    married = Married;
    money = Money;
  }
  /*
  Methods not shown
  */
}

```
That was a simple class named person. You could create an object with this class by using the code:
```js
person person1 = new person("Lerroy", 24, false, false, 100000.0);
```
This will construct the object Lerroy with the class person. You can see that we use the constructor we set up before when creating this new object, you can see that in action when we enter the Name, age, sick, married, and money variable after declaring new Person.

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
person1.displayName();
```

### Integer Type
The int method returns an integer when it is called. An example is
```js
public int returnAge() {

  return age;
}
```
Notice how this method does return a value. It returns the variable age. This can be called by,
```js
System.out.println("Age: " + person1.returnAge());
```
This will print out Age: 24, this is because it calls the method returnAge from the object Lerroy.

### Boolean Type
The boolean method returns a boolean when it is called. An example is
```js
public boolean isSick() {

  return sick;
}
```
Notice how this method returns the variable sick. It will return true or false depending on wether the variable sick is either true or false. A way to call to this method could be done like this -->
```js
System.out.println("Sick: " + person1.isSick());
```
If the variable sick is true then it will print out "Sick: true". If it is false it will print out "Sick: false".

### String type
The string method will return a string when it is called. An example of this is -->
```js
public String getName() {

  return name;
}
```
This will return the value of the variable name. You can call it like this -->
```js
System.out.println("Name: " + person1.getName());
```
This will print out "Name: Lerroy", or whatever the name that you gave the variable when constructing your object.

### Double Type
The double method will return a Double when it is called. An example of this is -->
```js
public double getBalance() {

    return money;
}
```
This will return the value of the variable money. You can use this function like this -->
```js
System.out.println("Balance: " + person1.getBalance());
```
This will print out "Balance: 100000.0", or whatever the balance that you gave the variable when constructing your object

## Now lets put this all together
Now we are going to build our person class. Here is what the completed class will look like. As you can see methods that we talked about earlier are present within this class.
```js
public class person {
  private String name;
  private int age;
  private boolean sick, married;
  private double money;

  public person(String Name, int Age, boolean Sick, boolean Married, double Money) {
    /*
    This is the constructor it is a method with the same name as the class. This tells java how you will construct your objects created from the class.
    */
    name = Name;
    age = Age;
    sick = Sick;
    married = Married;
    money = Money;
  }

  public void displayName() {
    System.out.println(name);

  }

  public int returnAge() {

    return age;
  }

  public boolean isSick() {

    return sick;
  }

  public String getName() {

    return name;
  }

  public double getBalance() {

      return money;
  }
}

```
Now we are going to look at the main class of our main file. That would look something like this -->
```js
class Main {

  public static void main(String[] args) {
    person person1 = new person("Lerroy", 24, false, false, 100000.0); // Notice how we used the constructor we set up earlier to construct this new object.
    System.out.println("Name: " + person1.getName());
    System.out.println("Age: " + person1.returnAge());
    System.out.println("Sick: " + person1.isSick());
    System.out.println("Balance: " + person1.getBalance());  

    }
}
```
What this code will do is print out the following in the terminal.
```
Name: Lerroy
Age: 24
Sick: false
Balance: 100000.0
```

### Why does this all work like this?
The reason that all of this works is because we created an object named person1 with the class of person. From this person1 object we are able to call the methods within the person class. When we first created the person1 class we gave it a bunch of different values it can use to set the variables included within the object.

##If you want to learn more check out these pages
[Instances of Classes power-point](https://github.com/Zxtreme03/ComputerScience/raw/master/CSA/CSA%20Powerpoints/Instances%20of%20classes.ppt)
[Project on repl.it](https://repl.it/@Zxtreme03/PersonClassDemo)


<-- [Back](https://zxtreme03.github.io/ComputerScience/lessonsPage)
