package spring.shedule.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.shedule.schedule.entity.Shedule;
import spring.shedule.schedule.service.SheduleService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
    @Autowired
    private SheduleService sheduleService;

    @GetMapping("/shedule")
    public List<Shedule> showAllPatients(){
        List<Shedule> allPatients= sheduleService.getAllShedule();
        return allPatients;
    }
    @GetMapping("/shedule/{id}")
    public Shedule getPatients(@PathVariable int id){
        Shedule shedule = sheduleService.getShedule(id);
        return shedule;
    }
    @PostMapping("/shedule")
    public Shedule addNewPatients(@RequestBody Shedule shedule){
        sheduleService.saveShedule(shedule);
        return shedule;
    }
    @PutMapping("/shedule")
    public Shedule updatePatients(@RequestBody Shedule shedule){
        sheduleService.saveShedule(shedule);
        return shedule;
    }
    @DeleteMapping("/shedule/{id}")
    public String deletePatients(@PathVariable int id){
        sheduleService.deleteShedule(id);
        return "Patients with ID= "+id+" was deleted";
    }
}
