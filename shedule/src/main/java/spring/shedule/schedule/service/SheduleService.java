package spring.shedule.schedule.service;

import spring.shedule.schedule.entity.Shedule;

import java.util.List;

public interface SheduleService {
    public List<Shedule> getAllShedule();

    public void saveShedule(Shedule shedule);

    public Shedule getShedule(int id);

    public void deleteShedule(int id);
}
