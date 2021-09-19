package com.muru.graphql.demo.fetcher;

import com.muru.graphql.demo.model.DiplomaStudent;
import com.muru.graphql.demo.generated.types.CollegeStudent;
import com.muru.graphql.demo.generated.types.HighSchoolStudent;
import com.muru.graphql.demo.generated.types.SchoolStudent;
import com.muru.graphql.demo.generated.types.Student;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.ArrayList;
import java.util.List;

@DgsComponent
public class StudentsDataFetcher {
    private final List<Student> schoolStudents = List.of(
            SchoolStudent.newBuilder().name("Gotzer").schoolName("Gvt School, CH-6")
                    .standard(7).build()
        );

    private final List<Student> collegeStudents = List.of(
            CollegeStudent.newBuilder().name("Nico").collegeName("Gvt College, CH-2")
                    .degree("B.Sc").major("Maths").year(3).build()
    );

    @DgsQuery
    public List<Student> schoolStudents() {
        return schoolStudents;
    }

    @DgsQuery
    public List<Student> collegeStudents() {
        return collegeStudents;
    }

    @DgsQuery
    public List<Student> students() {
        List<Student> list = new ArrayList<>(schoolStudents);
        list.addAll(collegeStudents);
        return list;
    }

    @DgsQuery
    public List<HighSchoolStudent> highSchoolStudents() {
        List<HighSchoolStudent> list = new ArrayList<>();
        list.add(SchoolStudent.newBuilder().name("Gotzer").schoolName("Gvt School, CH-6")
                .standard(7).build());
        list.add(DiplomaStudent.newBuilder().name("Sandro")
                .collegeName("Gvt Diploma College, CH-7")
                .degree("D.E").major("Electrical").year(2).build());
        return list;
    }
}
