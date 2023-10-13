package CollectionsFramework.List;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        //it is a Stack
        Stack<Integer> characterStack =new Stack<>();
        // adding any element in stack we are using push method
        characterStack.push(8);
        characterStack.push(89);
        characterStack.push(103);
        System.out.println(characterStack);

        // if we need only check the element of the top in stack so we are using peek method
        // remove element using pop methods
        System.out.println(characterStack.peek());
        if (characterStack.peek()==103){

            characterStack.pop();
            System.out.println(characterStack);
        }
    // also we are using vector method in stack . stack extend vector class and implement List interface .
        // basic principle of stack is  last in first out (lifo).



    }
}
