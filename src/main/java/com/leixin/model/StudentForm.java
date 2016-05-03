
package com.leixin.model;

import org.springframework.web.multipart.MultipartFile;

public class StudentForm {
    private String studentName;

    private int studentSex;

    private String studentBirthday;

    private MultipartFile studentPhoto;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(int studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public MultipartFile getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(MultipartFile studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

}
