package com.example.JavaFundermentals.JavaFundermentals.cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {

    int capacity;
    static Deque<Integer> q = new LinkedList<>();
    static Map<Integer, Cache> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity=capacity;

    }

    public int get(int key) {
        if(map.containsKey(key)){
            Cache current= map.get(key);
            q.remove(current.key);
            q.addFirst(current.key);
            return current.value;
        }
        return -1;

    }

    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Cache curr = map.get(key);
            q.remove(curr.key);
        }
        else{
            if(q.size() == capacity)
            {
                int temp = q.removeLast();
                map.remove(temp);
            }
        }
        Cache newItem = new Cache(key, value);
        q.addFirst(newItem.key);
        map.put(key, newItem);

    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // re
    }

    class Cache
    {
        int key;
        int value;
        Cache(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}