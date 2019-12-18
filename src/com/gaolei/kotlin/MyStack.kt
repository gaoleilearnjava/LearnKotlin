package com.gaolei.kotlin

import java.util.*

class MyStack() {

    /** Initialize your data structure here. */
    var queue1: Queue<Int> = LinkedList<Int>()
    var queue2: Queue<Int> = LinkedList<Int>()

    /** Push element x onto stack. */
    fun push(x: Int) {
        queue1.offer(x)
        while (queue2.isNotEmpty()) {
            queue1.offer(queue2.poll())
        }
        var temp = queue1
        queue1 = queue2
        queue2 = temp
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return queue2.poll()
    }

    /** Get the top element. */
    fun top(): Int {
        return queue2.peek()
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue2.isEmpty()
    }

}
