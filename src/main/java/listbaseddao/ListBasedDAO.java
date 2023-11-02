package listbaseddao;

import java.util.*;

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [id " + id + ", name : " + name + "]";
    }
}

interface UserDao {

    void add(User user);

    User get(int id);

    void update(User user);

    void delete(int id);
}

class UserDaoImpl implements UserDao {
    private final List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User get(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(User user) {
        User returnUser = get(user.getId());
        if (returnUser != null) {
            returnUser.setName(user.getName());
        }
    }

    @Override
    public void delete(int id) {
        User user = get(id);
        if (user != null) {
            users.remove(user);
        }
    }
}

public class ListBasedDAO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDao userDao = new UserDaoImpl();

        User user1 = new User(scanner.nextInt(), scanner.next());
        User user2 = new User(scanner.nextInt(), scanner.next());
        int nonexistentId = scanner.nextInt();

        userDao.add(user1);
        userDao.add(user2);

        System.out.println("Found " + userDao.get(user1.getId()));

        // get non-existent user
        if (userDao.get(nonexistentId) == null) {
            System.out.println("Not found id " + nonexistentId);
        }

        // update and get
        User updateUser = userDao.get(user2.getId());
        System.out.println("Found " + updateUser);
        updateUser.setName("UPDATED");
        userDao.update(updateUser);
        System.out.println("Updated " + userDao.get(user2.getId()));

        // delete
        userDao.delete(user2.getId());
        if (userDao.get(user2.getId()) == null) {
            System.out.println("Deleted id: " + user2.getId());
        }
    }
}