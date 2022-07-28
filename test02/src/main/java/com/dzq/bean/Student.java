package com.dzq.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 17:06
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class Student {
    private String[] books;
    private Set<String> bookSet;
    private List<String> bookList;
    private Map<String,String> bookMap;
    private List<Ball> ballList;

    @Override
    public String toString() {
        return "Student{" +
                "books=" + Arrays.toString(books) +
                ", bookSet=" + bookSet +
                ", bookList=" + bookList +
                ", bookMap=" + bookMap +
                ", ballList=" + ballList +
                '}';
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public Set<String> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<String> bookSet) {
        this.bookSet = bookSet;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public Map<String, String> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, String> bookMap) {
        this.bookMap = bookMap;
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public void setBallList(List<Ball> ballList) {
        this.ballList = ballList;
    }

    public Student(String[] books, Set<String> bookSet, List<String> bookList, Map<String, String> bookMap, List<Ball> ballList) {
        this.books = books;
        this.bookSet = bookSet;
        this.bookList = bookList;
        this.bookMap = bookMap;
        this.ballList = ballList;
    }

    public Student() {
    }
}
