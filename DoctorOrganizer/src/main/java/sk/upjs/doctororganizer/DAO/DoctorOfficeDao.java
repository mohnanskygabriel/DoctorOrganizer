package sk.upjs.doctororganizer.DAO;

import java.util.List;
import sk.upjs.doctororganizer.Entities.DoctorOffice;

public interface DoctorOfficeDao {

    void add(DoctorOffice office);

    List<DoctorOffice> getAll();
    
    List<DoctorOffice> getByDoctorId(Long id);

    void upgrade(DoctorOffice office);

    void delete(long id);

    public List<DoctorOffice> getSpecializations();

    public List<DoctorOffice> getBySpecializationAndCity(String specialization, String city);

    public List<DoctorOffice> getCities();
}
