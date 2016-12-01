package sk.upjs.doctororganizer.DAO;

import java.util.List;
import sk.upjs.doctororganizer.Entities.DoctorOffice;

public interface DoctorOfficeDao {

    void add(DoctorOffice office);

    List<DoctorOffice> getAll();

    DoctorOffice getId(long id);

    void upgrade(DoctorOffice office);

    void delete(long id);
}