package ru.Homeworks.A_Batsanov.Worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = x -> System.out.format("Task %s was not completed%n", x);
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                errorCallback.onError(i);
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
