package spring.shedule.schedule.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.shedule.schedule.entity.Shedule;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class SheduleDaoImpl implements SheduleDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Shedule> getAllShedule() {
        Query query=entityManager.createQuery("from shedule");
        List<Shedule> allShedule=query.getResultList();

        return allShedule;
    }

    @Override
    public void saveShedule(Shedule shedule) {
        Shedule newShedule =entityManager.merge(shedule);
        shedule.setId(newShedule.getId());

    }

    @Override
    public Shedule getShedule(int id) {
        Shedule shedule =entityManager.find(Shedule.class,id);
        return shedule;
    }

    @Override
    public void deleteShedule(int id) {
        Query query=entityManager.createQuery(
                "delete from shedule where id =:sheduleId");
        query.setParameter("sheduleId",id);
        query.executeUpdate();


    }
}
