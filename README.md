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
	3. A chicken says: “ Cluck, cluck ” **Added**
	4. A chicken cannot fly (assumption: its wings are clipped but ignore that ) **Added**
3. Now how would you model a rooster?
	1. A rooster says: “ Cock-a-doodle-doo ” **Added**
	2. How is the rooster related to the chicken?  **It is a kind of Chicken , Rooster IS A Chicken**
	3. Can you think of other ways to model a rooster without using inheritance?  **We can implement required methods which are implemented in Bird and Chicken class directly here and other Rooster related properties can be implmented in the same class**
4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats , the other lived on a farm next to the rooster.
	1. A parrot living with dogs says: “Woof, woof” **Added**
	2. A parrot living with cats says: “ Me ow” **Added**
	3. A parrot living near the rooster says: “ Cock-a-doodle-doo ” **Added**
	4. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently? **The classes which are already added ,in those classes nothing is required to change , only the consumer class has to pass the object of the type of the class of which song is expected , If the class is new for e.g. then add it without modifying existing structure and call the method which is implmented in that class which can produce the sound from Parrot class**

#B)
1. In addition to the birds, can you model a fish?
	1. Fish es don’t sing **Added**
	2. Fish es don’t walk **Added**
	3. Fish es can swim **Added**
2. Can you specialize the fish as a Shark and as a Clownfish?
	1. Sharks are large and grey **Added**
	2. Clownfish are small and colourful (orange) **Added**
	3. Clownfish make jokes **Added**
	4. Sharks eat other fish **Added**
3. Dolphin s are not exactly f ish, yet, they are good swimmers
	1. Can you model a dolphin that swims without inheriting from a fish class? **Added**
	2. How do you avoid duplicating code or introducing unneeded overhead? **Added**

#C)
1. Can you model a butterfly?
	1. A butterfly can fly **Added**
	2. A butterfly does not make a sound **Added**
2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?
	1. A caterpillar cannot fly **Added**
	2. A caterpillar can walk (crawl) **Added**
	
#D) Counting animals **Done**