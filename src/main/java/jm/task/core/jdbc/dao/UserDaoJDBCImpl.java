/*
package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {
    User user = new User();
    Connection connection = getConnection();
    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() { // созданиеи таблицы пользователей
        Connection connection = getConnection();
        String sql = "CREATE TABLE IF NOT EXISTS users (Id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), age TINYINT, LastName VARCHAR(100))";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Database has been created!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Database could not be created!");
        }
    }

    public void dropUsersTable() { // удалить таблицу пользователей
        String sql = "DROP TABLE IF EXISTS users";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Database has been dropped!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Database could not be dropped!");
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        String sql = "INSERT INTO users ( name, age, lastName) values ( ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
           // preparedStatement.setLong(1, user.getId());
            preparedStatement.setString(1, name);
            preparedStatement.setByte(2, age);
            preparedStatement.setString(3, lastName);
            preparedStatement.executeUpdate();
            System.out.println("User с именем - " + name + " добавленв базу данных");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "dsafasfsfsa");
        } // добавление пользователя

    }

    public void removeUserById(long id) { // удаление пользователя по id
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Removed user with id " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {// получить всех пользователей
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getByte("age"));
                user.setLastName(resultSet.getString("lastName"));
                users.add(user);
                System.out.println(user.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void cleanUsersTable() { //очистить таблицу
        String sql = "TRUNCATE TABLE users";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Database has been cleaned!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Database could not be cleaned!");
        }
    }
}
*/
