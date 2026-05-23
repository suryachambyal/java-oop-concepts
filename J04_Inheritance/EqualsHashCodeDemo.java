package J04_Inheritance;

import java.util.Objects;

// Demonstrating equals() and hashCode()

class StudentData {

    private int id;
    private String name;

    StudentData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        StudentData other = (StudentData) obj;

        return id == other.id &&
                name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "StudentData {" +
                "id = " + id +
                ", name = " + name +
                "}";
    }
}

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        StudentData s1 = new StudentData(101, "Daniel Parker");
        StudentData s2 = new StudentData(101, "Daniel Parker");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
