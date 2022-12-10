package task1;

import java.util.Scanner;

public class Test {
    public static User[] getUsers() {
        User user1 = new User("darkface", "shaikemel99@gmail.com", "garden", 21);
        User user2 = new User("coldface", "erla99@mail.ru", "darts", 16);
        User user3 = new User("login","mail.gmail.com","parol",65);
        return new User[]{user1, user2,user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equalsIgnoreCase(login) && user.getPass().equalsIgnoreCase(password)) {
                System.out.println("Пользователь найден");
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() >= 18) {
            System.out.println("Доступ предоставлен");
        } else {
            throw new AccessDeniedException("Не прошел проверку возрастом");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        validateUser(getUserByLoginAndPassword(login, password));
        System.out.println("Вы зашли");
    }
}
