package vn.edu.iuh.fit.demospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.demospring.daos.StudentDao;
import vn.edu.iuh.fit.demospring.models.Clazz;
import vn.edu.iuh.fit.demospring.models.Student;

import java.util.List;

@Component
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public void insert(Student entity){
        studentDao.insert(entity);
    }

    public Student getById(Long id){
        return studentDao.getById(id);
    }

    public List<Student> getAll(){
        return studentDao.getAll();
    }
}
