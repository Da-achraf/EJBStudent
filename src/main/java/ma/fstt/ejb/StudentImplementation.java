package ma.fstt.ejb;

import jakarta.ejb.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import ma.fstt.model.Student;

import java.io.Serializable;
import java.util.List;

@TransactionManagement(TransactionManagementType.CONTAINER)
@Stateless
public class StudentImplementation implements StudentRemote {

    @PersistenceContext(unitName = "student")
    private EntityManager entityManager;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    @Override
    public void save(Student student) {
        entityManager.merge(student);
    }

    @Override
    public List<Student> findAll() {
        String jpql = "SELECT e FROM Student e";
        TypedQuery<Student> query = entityManager.createQuery(jpql, Student.class);
        return query.getResultList();
    }

    @Override
    public Student findById(Long id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public void remove(Long id) {
        entityManager.remove(entityManager.find(Student.class, id));
    }
}
