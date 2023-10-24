package ma.fstt.ejb;

import jakarta.ejb.Remote;
import ma.fstt.model.Student;

import java.util.List;

@Remote
public interface StudentRemote {
    public void save(Student student);

    public List<Student> findAll();

    public Student findById(Long id);

    public void remove(Long id);
}
