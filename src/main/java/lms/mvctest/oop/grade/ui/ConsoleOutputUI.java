package lms.mvctest.oop.grade.ui;

import lms.mvctest.oop.grade.domain.GradeResult;

public class ConsoleOutputUI {
    public static void printGrade(GradeResult gradeResult) {
        System.out.println("이번 학기 학점: " + gradeResult.getAverageGrade() + " (총 " + gradeResult.getTotalCompletedCredit() + "학점)");
    }
}
