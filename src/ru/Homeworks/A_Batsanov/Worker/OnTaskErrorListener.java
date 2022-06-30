package ru.Homeworks.A_Batsanov.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(int i);
}

