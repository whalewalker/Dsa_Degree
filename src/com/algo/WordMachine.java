package com.algo;

import java.util.Stack;

public class WordMachine {
    /**
     * You are given a list of strings ops where each element is either:
     * <p>
     * A non-negative integer that should be pushed into a stack
     * "POP" meaning pop the top element in the stack
     * "DUP" meaning duplicate the top element in the stack
     * "+" meaning pop the top two and push the sum
     * "-" meaning pop the top two and push top - second
     * Return the top element in the stack after applying all operations. If there are any invalid operations, return -1.
     * <p>
     * Constraints
     * <p>
     * 1 ≤ n ≤ 100,000 where n is the length of ops
     * <p>
     * Example 1
     * Input
     * ops = ["1", "5", "DUP", "3", "-"]
     * Output: -2
     * Explanation
     * Following the operations:
     * <p>
     * We push 1 into the stack: [1]
     * We push 5 into the stack: [1, 5]
     * We duplicate the top element: [1, 5, 5]
     * We push 3 into the stack: [1, 5, 5, 3]
     * We pop 3 and 5 and push their difference 3 - 5: [1, 5, -2]
     * We return the top element which is -2
     * <p>
     * Example 2
     * Input
     * ops = ["+"]
     * Output: -1
     * Explanation
     * There's no elements in the stack so this is invalid.
     */

    private final Stack<Integer> stack = new Stack<>();

    public int solutionOne(String[] ops) {

        for (String op : ops) {
            if (stack.isEmpty() && (
                    ops[0].equals("DUP") ||
                            ops[0].equals("-") ||
                            ops[0].equals("+") ||
                            ops[0].equals("POP")
            )) {
                return -1;
            } else {
                if (op.equals("DUP")) {
                    if (stack.size() > 0) {
                        stack.push(stack.peek());
                    } else {
                        return -1;
                    }

                } else if (op.equals("POP")) {
                    if (stack.size() > 0) {
                        stack.pop();
                    } else {
                        return -1;
                    }
                } else if (op.equals("+")) {
                    if (stack.size() > 1) {
                        int first = stack.pop();
                        int second = stack.pop();
                        int sum = first + second;
                        stack.push(sum);
                    } else return -1;
                } else if (op.equals("-")) {
                    if (stack.size() > 1) {
                        int first = stack.pop();
                        int second = stack.pop();
                        int sum = first - second;
                        stack.push(sum);
                    } else return -1;
                } else {
                    stack.push(Integer.parseInt(op));
                }
            }

        }
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int solutionTwo(String[] ops) {
        for (String op : ops) {
            switch (op) {
                case "DUP": {
                    if (stack.size() > 0) stack.push(stack.peek());
                    else return -1;
                    break;
                }
                case "POP": {
                    if (stack.size() > 0) stack.pop();
                    else return -1;
                    break;
                }
                case "-": {
                    if (stack.size() > 1) stack.push(stack.pop() - stack.pop());
                    else return -1;
                    break;
                }
                case "+": {
                    if (stack.size() > 1) stack.push(stack.pop() + stack.pop());
                    else return -1;
                    break;
                }
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public Stack<Integer> getStack() {
        return stack;
    }

}
