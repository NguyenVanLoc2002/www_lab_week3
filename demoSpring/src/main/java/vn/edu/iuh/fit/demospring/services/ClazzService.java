package vn.edu.iuh.fit.demospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.demospring.daos.ClazzDao;
import vn.edu.iuh.fit.demospring.models.Clazz;

import java.util.List;

@Component
public class ClazzService {
    @Autowired
    private ClazzDao clazzDao;

    public void insert(Clazz entity){
        clazzDao.insert(entity);
    }

    public Clazz getById(Long id){
        return clazzDao.getById(id);
    }

    public List<Clazz> getAll(){
        return clazzDao.getAll();
    }
}
