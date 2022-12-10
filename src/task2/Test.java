package task2;

public class Test {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Темный рыцарь", 2008, 18)
        };
    }

    public static Theatre[] getTheatre() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 12),
                new Theatre("Цыганская серенада", 2021, 21)
        };
    }

    public static void validEvent(Event event) {

        if (event.getReleaseYear() == 0 || event.getAge() == 0) {
            throw new RuntimeException("Не указана возрастное ограничение или год выпуска");
        } else if (event.getTitle() == null) {
            throw new RuntimeException("Не указана название мероприятия");
        }
    }

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            try {
                validEvent(event);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        for (Event event : getTheatre()) {
            try {
                validEvent(event);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Все события корректны");
    }
}