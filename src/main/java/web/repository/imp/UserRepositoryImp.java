package web.repository.imp;

import org.springframework.stereotype.Repository;
import web.model.User;
import web.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImp implements UserRepository {
@PersistenceContext
    private EntityManager eM;
protected EntityManager getEntityManager() {
    return eM;
}

    @Override
    public void addUser(User user) {
        getEntityManager().persist(user);
    }
    @Override
    public void deleteUserById(Long id) {
        getEntityManager()
                .createQuery("delete from User u where u.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }
    @Override
    public void editUser(User user) {
        getEntityManager().merge(user);
    }
    @Override
    public User getUserById(Long id) {
        return getEntityManager().find(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
    return getEntityManager().createQuery("from User").getResultList();
    }
}
