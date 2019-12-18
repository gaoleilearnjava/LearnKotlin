package com.gaolei.kotlin

import java.util.*

class MyQueue() {

    /** Initialize your data structure here. */
    private val stack1: Stack<Int> = Stack()
    private val stack2: Stack<Int> = Stack()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        stack1.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (stack2.isEmpty()) {
            while (stack1.isNotEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
        if (stack2.isEmpty()) {
            while (stack1.isNotEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }

}
