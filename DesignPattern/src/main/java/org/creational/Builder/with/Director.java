package org.creational.Builder.with;

public class Director {
    StudentBuilder studentBuilder;
    Director (StudentBuilder studentBuilder){
       this.studentBuilder = studentBuilder;
    }
    public Student createStudent() {

        if(studentBuilder instanceof EngineeringStudentBuilder)
        {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder)
        {
            return createMBAStudent();
        }
        return  null;
    }
    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1)
                .setAge(20)
                .setName("John")
                .setSubjects()
                .build();
    }
    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2)
                .setAge(22)
                .setName("Jane")
                .setFatherName("Jane's Father")
                .setMotherName("Jane's Mother")
                .setSubjects()
                .build();
    }
}
