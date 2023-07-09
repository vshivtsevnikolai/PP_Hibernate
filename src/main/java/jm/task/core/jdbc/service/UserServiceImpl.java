package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();

    public UserServiceImpl() {
    }

    @Override
    public void createUsersTable() {

        userDao.createUsersTable();
        System.out.println("Table is created");
    }

    @Override
    public void dropUsersTable() {

        userDao.dropUsersTable();
        System.out.println("Table is deleted");
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    @Override
    public void removeUserById(long id) {

        userDao.removeUserById(id);
        System.out.println("User is deleted");
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {

        userDao.cleanUsersTable();
        System.out.println("Table is clean");
    }

}
