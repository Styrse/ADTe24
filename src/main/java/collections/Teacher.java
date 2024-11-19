package collections;

import java.util.Objects;

public class Teacher {
    private String name;
    private int seniority;

    public Teacher(String name, int seniority) {
        this.name = name;
        this.seniority = seniority;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return seniority == teacher.seniority && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seniority);
    }
}
