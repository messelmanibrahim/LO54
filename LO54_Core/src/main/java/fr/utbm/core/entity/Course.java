
package fr.utbm.core.entity;

import java.util.List;

class Course {
    private String code;
    private String title;
    private List<CourseSession> courseSessions;
    
    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<CourseSession> getCourseSessions() {
        return courseSessions;
    }
    public void setCourseSessions(List<CourseSession> courseSession) {
        this.courseSessions = courseSession;
    }
    @Override
    public String toString() {
        return "Course [id = " + this.code + " title = " + this.title + "]";
    }
}
