package com.task2.module;

import java.util.ArrayDeque;
import java.util.Queue;

public class MemoSelect {

    private Queue<Momento> mementoList = new ArrayDeque<Momento>();


    public void push(Momento state) {

        mementoList.add(state);

    }

    public Momento poll() {

        return mementoList.poll();

    }
}