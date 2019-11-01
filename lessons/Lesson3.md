# Lesson 3 - 11/1/2019 --> Math Random
## What is the Math Random function?
The math random function can be used to get a random number. A simple version of it can be seen here -->
```js
class Main {
  public static void main(String[] args) {
    int range = (10 - 0);
    int randomNumber = (int) (Math.random() * range) + 0;
    System.out.println(random);
  }
}
```
The function works by taking the range which is the (max - min) and then multiplying Math.random() by that range. Once that is done you add your min onto the end. The entire formula looks like this -->
```js
int range = (max - min);
int randomNumber = (int) (Math.random() * range) + min;
```
This is a fairly easy thing to grasp once you have memorized the formula.

## If you want to learn more check out these pages
[Using the math class power-point](https://github.com/Zxtreme03/ComputerScience/raw/master/CSA/CSA%20Powerpoints/UsingTheMathClass.ppt)
[Project on repl.it](https://repl.it/@Zxtreme03/MathRandomDemo)

<-- [Back](https://zxtreme03.github.io/ComputerScience/lessonsPage)
