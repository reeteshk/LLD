package org.creational.Builder.with;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Marketing");
        subs.add("Finance");
        subs.add("Human Resource");
        this.subjects= subs;
        return this;
    }
}
