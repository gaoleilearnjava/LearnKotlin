package com.gaolei.kotlin

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val letters = IntArray(26)
        for (c in s) {
            letters[c - 'a']++
        }
        for (c in t) {
            if (letters[c - 'a'] == 0) {
                return false
            } else {
                letters[c - 'a']--
            }
        }
        return true
    }
}