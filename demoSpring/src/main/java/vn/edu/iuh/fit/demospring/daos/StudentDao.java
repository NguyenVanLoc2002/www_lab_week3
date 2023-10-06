package vn.edu.iuh.fit.demospring.daos;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.demospring.models.Student;

import javax.sql.DataSource;
import java.util.List;

@Component
public class StudentDao extends AbstractDao<Student,Long> {

    public StudentDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Student entity){
        String sql = "insert into student (student_name,clazz_id) values (?,?)";
        jdbcTemplate.update(sql,entity.getName(),entity.getClazz().getId());
    }

    @Override
    public Student getById(Long id){
        String sql ="select * from  student where student_id =?";
        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Student.class),
                id
                );
    }

    @Override
    public List<Student> getAll(){
        String sql ="select * from student";
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Student.class)
        );
    }

}
