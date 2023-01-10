/**
 * [S] - Старт
 * [С] - Выход
 * [^] - Непроходимые блоки
 * + - Кратчайший маршрут
 * Размер поля 25 на 25
 */
public class Program {
    public static void main(String[] args) {
        Point startPoint = new Point(22, 2); // Создание точки старта
        Point closePoint = new Point(2, 2); // Создание точки выхода
        PlayingField myField =
                new PlayingField(
                        new FieldGenerator().generator(), startPoint, closePoint); // Генерация поля с блоками (в будушем нужна случайная генерация)
        myField.routeView();
    }
}
