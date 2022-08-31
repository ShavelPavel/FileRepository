package spring.shedule.schedule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.shedule.schedule.dao.SheduleDAO;
import spring.shedule.schedule.entity.Shedule;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SheduleServiceImpl implements SheduleService {
    @Autowired
    private SheduleDAO sheduleDAO;
    @Override
    @Transactional
    public List<Shedule> getAllShedule() {
        return sheduleDAO.getAllShedule();
    }

    @Override
    @Transactional
    public void saveShedule(Shedule shedule) {
        sheduleDAO.saveShedule(shedule);

    }

    @Override
    @Transactional
    public Shedule getShedule(int id) {
        return sheduleDAO.getShedule(id);
    }

    @Override
    @Transactional
    public void deleteShedule(int id) {
        sheduleDAO.deleteShedule(id);

    }
}
