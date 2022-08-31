package spring.project.spring_backend_polyclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.project.spring_backend_polyclinic.entity.Patients;
import spring.project.spring_backend_polyclinic.service.PatientsService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
    @Autowired
    private PatientsService patientsService;

    @GetMapping("/patients")
    public List<Patients> showAllPatients(){
        List<Patients> allPatients=patientsService.getAllPatients();
        return allPatients;
    }
    @GetMapping("/patients/{id}")
    public Patients getPatients(@PathVariable int id){
        Patients patients= patientsService.getPatients(id);
        return patients;
    }
    @PostMapping("/patients")
    public Patients addNewPatients(@RequestBody Patients patients){
        patientsService.savePatients(patients);
        return patients;
    }
    @PutMapping("/patients")
    public Patients updatePatients(@RequestBody Patients patients){
        patientsService.savePatients(patients);
        return patients;
    }
    @DeleteMapping("/patients/{id}")
    public String deletePatients(@PathVariable int id){
        patientsService.deletePatients(id);
        return "Patients with ID= "+id+" was deleted";
    }
}
