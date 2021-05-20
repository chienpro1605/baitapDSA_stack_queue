package daonguocphantutrongmangsonguyen;

import java.util.Stack;

public class MangSoNguyen {
    public static void main(String[] args) {
//        Stack<Integer>stacks = new Stack<>();
//        stacks.push(1);
//        stacks.push(2);
//        stacks.push(3);
//        stacks.push(4);
//        stacks.push(5);
//
//        System.out.println("mảng đầu tiên");
//        for (Integer sc: stacks){
//            System.out.println(sc);
//        }
//        System.out.println("mảng tiếp theo");
//        while (!stacks.isEmpty()){
//            System.out.println(stacks.pop());
//        }
        String input = "chiendepzai";
        Stack<Character>stack = new Stack<>();
        for (int i =0; i<input.length(); i++){
            stack.push(input.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i<size; i++){
            str.append(stack.pop());
        }
        System.out.println(str);

    }

}
