package com.gaolei.kotlin

import java.util.*


class MinStack() {

    /** initialize your data structure here. */
    private val minStack = Stack<Int>()
    private val stack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
        if (minStack.isEmpty()) {
            minStack.push(x)
        } else {
            val peek = minStack.peek()
            if (x < peek) minStack.push(x)
            else minStack.push(peek)
        }
    }

    fun pop() {
        stack.pop()
        minStack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }

}
