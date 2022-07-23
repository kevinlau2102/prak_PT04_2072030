package com.example.prak_pt04_2072030.Dao;

import javafx.collections.ObservableList;

public interface DaoInterface<T> {
    ObservableList<T> getData();
    void addData(T data);
    void deleteData(T data);
}
