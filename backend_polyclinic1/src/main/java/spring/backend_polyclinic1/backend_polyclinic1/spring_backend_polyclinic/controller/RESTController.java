package spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.entity.Staff;
import spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.service.StaffService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
    @Autowired
    private StaffService staffService;

    @GetMapping("/staff")
    public List<Staff> showAllPatients(){
        List<Staff> allStaff= staffService.getAllStaff();
        return allStaff;
    }
    @GetMapping("/staff/{id}")
    public Staff getPatients(@PathVariable int id){
        Staff staff = staffService.getStaff(id);
        return staff;
    }
    @PostMapping("/staff")
    public Staff addNewPatients(@RequestBody Staff staff){
        staffService.saveStaff(staff);
        return staff;
    }
    @PutMapping("/staff")
    public Staff updatePatients(@RequestBody Staff staff){
        staffService.saveStaff(staff);
        return staff;
    }
    @DeleteMapping("/staff/{id}")
    public String deletePatients(@PathVariable int id){
        staffService.deleteStaff(id);
        return "Staff with ID= "+id+" was deleted";
    }
}
