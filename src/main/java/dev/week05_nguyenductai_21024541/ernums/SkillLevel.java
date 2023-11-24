package dev.week05_nguyenductai_21024541.ernums;

public enum SkillLevel {
    MASTER(1), BEGINER(2), ADVANCED(3), PROFESSIONAL(4), IMTERMEDIATE(5);
    private int value;
    SkillLevel(int value) {
        this.value = value;
    }
}