package dev.week05_nguyenductai_21024541.ernums;

public enum SkillType {
    SOFT_SKILL(1), UNSPECIFIC(2), TECHNICAL_SKILL(3);
    private int value;
    SkillType(int value) {
        this.value = value;
    }
}
