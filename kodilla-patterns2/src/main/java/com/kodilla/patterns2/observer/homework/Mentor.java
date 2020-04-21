package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorsName;
    private int updateCount;

    public Mentor(String mentorsName) {
        this.mentorsName = mentorsName;
    }

    @Override
    public void update(StudentsHomework studentsHomework) {
        System.out.println(mentorsName + ": New solved task from " + studentsHomework.getStudentsName() + "\n" +
                " (total: " + studentsHomework.getTasks().size() + " tasks to check)");
        updateCount++;
    }

    public String getMentorsName() {
        return mentorsName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
