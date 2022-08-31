package spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.dao.StaffDAO;
import spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.entity.Staff;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDAO staffDAO;
    @Override
    @Transactional
    public List<Staff> getAllStaff() {
        return staffDAO.getAllStaff();
    }

    @Override
    @Transactional
    public void saveStaff(Staff staff) {
        staffDAO.saveStaff(staff);

    }

    @Override
    @Transactional
    public Staff getStaff(int id) {
        return staffDAO.getStaff(id);
    }

    @Override
    @Transactional
    public void deleteStaff(int id) {
        staffDAO.deleteStaff(id);

    }
}
