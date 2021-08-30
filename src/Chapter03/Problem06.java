package Chapter03;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
 * out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
 * that type). They cannot select which specific animal they would like. Create the data structures to
 * maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
 * and dequeueCat. You may use the built-in Linked list data structure.
 */
public class Problem06 {

  private class Animal {
    String name;
    Integer order;

    public Animal(String name, Integer order) {
      this.name = name;
      this.order = order;
    }

    public void setOrder(Integer order) {
      this.order = order;
    }

    public boolean olderOrder(Animal a) {
      return this.order < a.order;
    }
  }

  private class Cat extends Animal {
    public Cat(String name, Integer order) {
      super(name, order);
    }
  }

  private class Dog extends Animal {
    public Dog(String name, Integer order) {
      super(name, order);
    }
  }

  private Queue<Cat> cats;
  private Queue<Dog> dogs;
  private int order;

  public Problem06() {
    this.cats = new LinkedList<>();
    this.dogs = new LinkedList<>();
    order = 0;
  }

  public void queue(Animal a) {
    a.setOrder(order);
    if (a instanceof Dog) {
      dogs.add((Dog) a);
    } else if (a instanceof Cat) {
      cats.add((Cat) a);
    }
    order++;
  }

  public Animal dequeueAny() {
    if (dogs.isEmpty()) {
      return cats.remove();
    } else if (cats.isEmpty()) {
      return dogs.remove();
    }

    if (dogs.peek().olderOrder(cats.peek())) {
      return dogs.remove();
    }
    return cats.remove();
  }

  public Dog dequeueDog() {
    return dogs.remove();
  }

  public Cat dequeueCat() {
    return cats.remove();
  }
}
