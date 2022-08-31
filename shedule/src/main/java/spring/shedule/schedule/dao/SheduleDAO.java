package spring.shedule.schedule.dao;

import spring.shedule.schedule.entity.Shedule;

import java.util.List;

public interface SheduleDAO {

    public List<Shedule> getAllShedule();

    public void saveShedule(Shedule shedule);

    public Shedule getShedule(int id);

    public void deleteShedule(int id);
}
