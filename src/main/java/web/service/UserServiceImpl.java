package web.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {


    private EntityManager entityManager;

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    public User getUser(Long id) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.detach(user);
        return user;
    }

    @Override
    public List<User> listUsers() {
        entityManager.getTransaction().begin();
        List<User> list = entityManager.createQuery("select User from User").getResultList();
        entityManager.getTransaction().commit();
        return list;
    }
}
