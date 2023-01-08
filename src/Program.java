/**
 * {S} - Старт
 * {С} - Выход
 * [B] - Непроходимые блоки
 * [*] - Кратчайший маршрут
 * Размер поля 24 на 24
 */
public class Program {
    public static void main(String[] args) {
        PlayingField myField = new PlayingField(new FieldGenerator().generator()); // Генерация поля с блоками (в будушем нужна случайная генерация)
        Point startPoint = new Point(22, 1); // Создание точки старта
        Point closePoint = new Point(1, 22); // Создание точки выхода
        myField.field[startPoint.getX()][startPoint.getY()] = "{S}";
        myField.field[closePoint.getX()][closePoint.getY()] = "{C}";
        myField.field = new WaveBuilder().waveBuilder(startPoint.getX(), startPoint.getY(), myField.field); // Построение цифровой волны
        myField.field = new BuildingARoute().builder(closePoint.getX(), closePoint.getY(), myField.field); // Построение кратчайшего маршрута
        myField.fieldView();
    }
}
