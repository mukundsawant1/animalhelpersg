# Animal Helper Model
##Given Code - 
```
class Animal {
	void walk(){
	System.out.println("I am walking");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
}
public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
```
#A)
1. Can you implement the sing() method for the bird?
	1. How did you unit test it? **Added Test class**
	2. How did you optimize the code for maintainability? (Ask yourself the same question for all following exercises ) **Classes are separated in diferent files and package**
2. Now, we have 2 special kinds of birds: the Duck and the Chicken ... Can you implement them to make their own special sound?
	1. A duck says: “Quack , quack ” **Added**
	2. A duck can swim **Added**
