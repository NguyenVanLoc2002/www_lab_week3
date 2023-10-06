package vn.edu.iuh.fit.demospring.daos;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.demospring.models.Clazz;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ClazzDao extends AbstractDao<Clazz, Long> {

    public ClazzDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Clazz entity) {
        String sql = "insert into clazz(clazz_name) values(?)";
        jdbcTemplate.update(sql, entity.getName());
    }

    @Override
    public Clazz getById(Long id) {
        String sql = "select * from clazz where id=?";
        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Clazz.class),
                id);
    }

    @Override
    public List<Clazz> getAll() {
        String sql = "select * from clazz ";
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>
                        (Clazz.class));
    }
}
