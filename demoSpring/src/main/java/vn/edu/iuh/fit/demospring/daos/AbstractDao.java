package vn.edu.iuh.fit.demospring.daos;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public abstract class AbstractDao<T,ID> {
    private final DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractDao(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public abstract void insert(T entity);

    public abstract T getById(ID id);

    public abstract List<T> getAll();
}
