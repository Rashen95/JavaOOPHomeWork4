import java.util.ArrayDeque;

public class WaveBuilder {
    public int[][] waveBuilder(int startX, int startY, int[][] playingField) {
        ArrayDeque<Point> points = new ArrayDeque<>();
        playingField[startX][startY] = 0;
        points.addLast(new Point(startX, startY));
        boolean flag = false;
        while (!flag) {
            if (points.element().getX() + 1 < playingField.length && playingField[points.element().getX() + 1][points.element().getY()] == -3
                    || points.element().getY() + 1 < playingField.length && playingField[points.element().getX()][points.element().getY() + 1] == -3
                    || points.element().getX() - 1 >= 0 && playingField[points.element().getX() - 1][points.element().getY()] == -3
                    || points.element().getY() - 1 >= 0 && playingField[points.element().getX()][points.element().getY() - 1] == -3) {
                flag = true;
            } else {
                if (points.element().getX() + 1 < playingField.length && playingField[points.element().getX() + 1][points.element().getY()] == 0) {
                    playingField[points.element().getX() + 1][points.element().getY()] = playingField[points.element().getX()][points.element().getY()] + 1;
                    points.addLast(new Point(points.element().getX() + 1, points.element().getY()));
                }
                if (points.element().getY() + 1 < playingField.length && playingField[points.element().getX()][points.element().getY() + 1] == 0) {
                    playingField[points.element().getX()][points.element().getY() + 1] = playingField[points.element().getX()][points.element().getY()] + 1;
                    points.addLast(new Point(points.element().getX(), points.element().getY() + 1));
                }
                if (points.element().getX() - 1 >= 0 && playingField[points.element().getX() - 1][points.element().getY()] == 0) {
                    playingField[points.element().getX() - 1][points.element().getY()] = playingField[points.element().getX()][points.element().getY()] + 1;
                    points.addLast(new Point(points.element().getX() - 1, points.element().getY()));
                }
                if (points.element().getY() - 1 >= 0 && playingField[points.element().getX()][points.element().getY() - 1] == 0) {
                    playingField[points.element().getX()][points.element().getY() - 1] = playingField[points.element().getX()][points.element().getY()] + 1;
                    points.addLast(new Point(points.element().getX(), points.element().getY() - 1));
                }
                points.remove();
            }
        }
        playingField[startX][startY] = -2;
        return playingField;
    }
}
