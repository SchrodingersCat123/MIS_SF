package zms.pojo;

public class Teacher_course {
    private Integer id;
    private Integer teacher_id;
    private Integer course_id;

    @Override
    public String toString() {
        return "Teacher_course{" +
                "id=" + id +
                ", teacher_id=" + teacher_id +
                ", course_id=" + course_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
}
