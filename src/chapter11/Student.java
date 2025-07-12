package chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Student {
    private int id;
    private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public String getName() { return name; }


        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name= " + name + '\'' + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        public static void main(String[] args) {
            
            Set<Student> students = new HashSet<>();
            students.add(new Student(1, "Anshul"));            
            students.add(new Student(2, "Bhavna"));
            students.add(new Student(1, "Anshul")); 
            students.add(new Student(3, "Chirag"));

            System.out.println("Number of students: " + students.size());
            System.out.println(students);
        }
    
}
