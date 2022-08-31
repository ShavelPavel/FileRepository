package spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.dao;

import spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.entity.Staff;

import java.util.List;

public interface StaffDAO {

    public List<Staff> getAllStaff();

    public void saveStaff(Staff staff);

    public Staff getStaff(int id);

    public void deleteStaff(int id);
}
