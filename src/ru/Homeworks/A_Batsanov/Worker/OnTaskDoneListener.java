package ru.Homeworks.A_Batsanov.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
