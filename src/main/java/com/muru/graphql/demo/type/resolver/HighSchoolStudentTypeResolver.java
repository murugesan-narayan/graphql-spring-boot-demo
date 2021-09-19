package com.muru.graphql.demo.type.resolver;

import com.muru.graphql.demo.model.DiplomaStudent;
import com.muru.graphql.demo.generated.types.HighSchoolStudent;
import com.muru.graphql.demo.generated.types.SchoolStudent;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsTypeResolver;

@DgsComponent
public class HighSchoolStudentTypeResolver {
    @DgsTypeResolver(name = "HighSchoolStudent")
    public String resolveHighSchoolStudentType(HighSchoolStudent student) {
        if (student instanceof SchoolStudent) {
            return "SchoolStudent";
        } else if (student instanceof DiplomaStudent) {
            //here server side type and graphql types are not same,
            // so we need to map the right type.
            return "DipCollegeStudent";
        } else {
            throw new RuntimeException("Unknown Type");
        }
    }
}
