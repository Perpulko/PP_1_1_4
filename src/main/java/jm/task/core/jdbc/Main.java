package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException { // реализуйте алгоритм здесь

        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser("Zaur", "Guse", (byte) 33);
        userDao.saveUser("Evgen", "Petrov", (byte) 31);
        userDao.saveUser("Pavel", "Pavlov", (byte) 30);
        userDao.removeUserById(1L);
        userDao.getAllUsers();
//        userDao.dropUsersTable();
//        userDao.cleanUsersTable();
    }
}
