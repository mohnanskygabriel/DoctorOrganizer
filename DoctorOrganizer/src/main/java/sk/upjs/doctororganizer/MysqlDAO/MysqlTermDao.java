package sk.upjs.doctororganizer.MysqlDAO;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.doctororganizer.DAO.TermDao;
import sk.upjs.doctororganizer.Entities.Term;

public class MysqlTermDao implements TermDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlTermDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(Term term) {
        String sql = "INSERT INTO `term` (`id_patient`, `id_doctor_office`, `date`, `reason`, `term_condition`) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, term.getId_patient(), term.getId_doctor_office(), term.getDate(), term.getReason(), term.getTerm_condition());
    }

    @Override
    public List<Term> getAll() {
        String sql = "SELECT id, id_patient, id_doctor_office, date, reason, term_condition FROM term";
        BeanPropertyRowMapper<Term> bprm = new BeanPropertyRowMapper<>(Term.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public Term getId(long id) {
        String sql = "SELECT id, id_patient, id_doctor_office, date, reason, term_condition FROM term WHERE id = " + id;
        BeanPropertyRowMapper<Term> bprm = new BeanPropertyRowMapper<>(Term.class);
        return jdbcTemplate.query(sql, bprm).get(0);
    }

    @Override
    public void upgrade(Term term) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long id) {
        String sql = "DELETE FROM term WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

}
