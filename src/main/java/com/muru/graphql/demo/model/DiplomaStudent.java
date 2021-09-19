package com.muru.graphql.demo.model;

import com.muru.graphql.demo.generated.types.HighSchoolStudent;

public class DiplomaStudent implements HighSchoolStudent {
  private String name;

  private String collegeName;

  private String degree;

  private String major;

  private Integer year;

  public DiplomaStudent() {
  }

  public DiplomaStudent(String name, String collegeName, String degree, String major,
                        Integer year) {
    this.name = name;
    this.collegeName = collegeName;
    this.degree = degree;
    this.major = major;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCollegeName() {
    return collegeName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "DiplomaStudent{" + "name='" + name + "'," +"collegeName='" + collegeName + "'," +"degree='" + degree + "'," +"major='" + major + "'," +"year='" + year + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiplomaStudent that = (DiplomaStudent) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(collegeName, that.collegeName) &&
                            java.util.Objects.equals(degree, that.degree) &&
                            java.util.Objects.equals(major, that.major) &&
                            java.util.Objects.equals(year, that.year);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, collegeName, degree, major, year);
  }

  public static DiplomaStudent.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private String collegeName;

    private String degree;

    private String major;

    private Integer year;

    public DiplomaStudent build() {
                  DiplomaStudent result = new DiplomaStudent();
                      result.name = this.name;
          result.collegeName = this.collegeName;
          result.degree = this.degree;
          result.major = this.major;
          result.year = this.year;
                      return result;
    }

    public DiplomaStudent.Builder name(String name) {
      this.name = name;
      return this;
    }

    public DiplomaStudent.Builder collegeName(
        String collegeName) {
      this.collegeName = collegeName;
      return this;
    }

    public DiplomaStudent.Builder degree(
        String degree) {
      this.degree = degree;
      return this;
    }

    public DiplomaStudent.Builder major(String major) {
      this.major = major;
      return this;
    }

    public DiplomaStudent.Builder year(Integer year) {
      this.year = year;
      return this;
    }
  }
}
