package sk.upjs.doctororganizer.MysqlDAO;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.doctororganizer.DAO.DoctorOfficeDao;
import sk.upjs.doctororganizer.Entities.DoctorOffice;

public class MysqlDoctorOfficeDao implements DoctorOfficeDao {

    private final JdbcTemplate jdbcTemplate;

    public MysqlDoctorOfficeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(DoctorOffice office) {
        String sql = "INSERT INTO `doctor_office` (`city`, `street`,"
                + " `house_number`, `hospital`, `specialization`,"
                + " `opening_hours`, `phone_number`, `id_doctor`)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, office.getCity(), office.getStreet(),
                office.getHouse_number(), office.getHospital(),
                office.getSpecialization(), office.getOpening_hours(),
                office.getPhone_number(), office.getId_doctor());
    }

    @Override
    public List<DoctorOffice> getAll() {
        String sql = "SELECT id, city, street, house_number, hospital,"
                + " specialization, opening_hours, phone_number,"
                + " id_doctor FROM doctor_office";
        BeanPropertyRowMapper<DoctorOffice> bprm = new BeanPropertyRowMapper<>(DoctorOffice.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public List<DoctorOffice> getByDoctorId(Long id) {
        String sql = "SELECT id, city, street, house_number, hospital,"
                + " specialization, opening_hours, phone_number,"
                + " id_doctor FROM doctor_office WHERE id_doctor = " + id;
        BeanPropertyRowMapper<DoctorOffice> bprm = new BeanPropertyRowMapper<>(DoctorOffice.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public void upgrade(DoctorOffice office) {
        String sql = "UPDATE doctor_office SET city=?, street=?, house_number=?,"
                + " hospital=?, specialization=?, opening_hours=?,"
                + " phone_number=? WHERE id=?";
        jdbcTemplate.update(sql, office.getCity(), office.getStreet(),
                office.getHouse_number(), office.getHospital(),
                office.getSpecialization(), office.getOpening_hours(),
                office.getPhone_number(), office.getId());
    }

    @Override
    public void delete(long id) {
        String sql = "DELETE FROM doctor_office WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<DoctorOffice> getSpecializations() {
        String sql = "SELECT DISTINCT specialization FROM doctor_office";
        BeanPropertyRowMapper<DoctorOffice> bprm = new BeanPropertyRowMapper<>(DoctorOffice.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public List<DoctorOffice> getBySpecializationAndCity(String specialization, String city) {
        String sql = "SELECT id, city, street, house_number, hospital,"
                + " specialization, opening_hours, phone_number,"
                + " id_doctor FROM doctor_office WHERE specialization = '" + specialization + "' AND city = '" + city + "'";
        BeanPropertyRowMapper<DoctorOffice> bprm = new BeanPropertyRowMapper<>(DoctorOffice.class);
        return jdbcTemplate.query(sql, bprm);
    }

    @Override
    public List<DoctorOffice> getCities() {
        String sql = "SELECT DISTINCT city FROM doctor_office";
        BeanPropertyRowMapper<DoctorOffice> bprm = new BeanPropertyRowMapper<>(DoctorOffice.class);
        return jdbcTemplate.query(sql, bprm);
    }
}
