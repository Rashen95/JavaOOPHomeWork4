import java.util.ArrayDeque;

public class BuildingARoute {
    public int[][] builder(int closeX, int closeY, int[][] playingField) {
        ArrayDeque<Point> points = new ArrayDeque<>();
        points.addLast(new Point(closeX, closeY));
        int distance = 0;
        if (closeX + 1 < playingField.length && playingField[closeX + 1][closeY] != 0 && playingField[closeX + 1][closeY] != -1) {
            distance = playingField[closeX + 1][closeY];
            playingField[closeX + 1][closeY] = -5;
            points.addLast(new Point(closeX + 1, closeY));
            points.remove();
        } else if (closeY + 1 < playingField.length && playingField[closeX][closeY + 1] != 0 && playingField[closeX][closeY + 1] != -1) {
            distance = playingField[closeX][closeY + 1];
            playingField[closeX][closeY + 1] = -5;
            points.addLast(new Point(closeX, closeY + 1));
            points.remove();
        } else if (closeX - 1 < playingField.length && playingField[closeX - 1][closeY] != 0 && playingField[closeX - 1][closeY] != -1) {
            distance = playingField[closeX - 1][closeY];
            playingField[closeX - 1][closeY] = -5;
            points.addLast(new Point(closeX - 1, closeY));
            points.remove();
        } else if (closeY - 1 < playingField.length && playingField[closeX][closeY - 1] != 0 && playingField[closeX][closeY - 1] != -1) {
            distance = playingField[closeX][closeY - 1];
            playingField[closeX][closeY - 1] = -5;
            points.addLast(new Point(closeX, closeY - 1));
            points.remove();
        }
        while (distance > 1) {
            if (points.getLast().getX() + 1 < playingField.length && playingField[points.getLast().getX() + 1][points.getLast().getY()] == distance - 1) {
                distance--;
                playingField[points.getLast().getX() + 1][points.getLast().getY()] = -5;
                points.addLast(new Point(points.getLast().getX() + 1, points.getLast().getY()));
                points.remove();
            } else if (points.getLast().getY() + 1 < playingField.length && playingField[points.getLast().getX()][points.getLast().getY() + 1] == distance - 1) {
                distance--;
                playingField[points.getLast().getX()][points.getLast().getY() + 1] = -5;
                points.addLast(new Point(points.getLast().getX(), points.getLast().getY() + 1));
                points.remove();
            } else if (points.getLast().getX() - 1 >= 0 && playingField[points.getLast().getX() - 1][points.getLast().getY()] == distance - 1) {
                distance--;
                playingField[points.getLast().getX() - 1][points.getLast().getY()] = -5;
                points.addLast(new Point(points.getLast().getX() - 1, points.getLast().getY()));
                points.remove();
            } else if (points.getLast().getY() - 1 >= 0 && playingField[points.getLast().getX()][points.getLast().getY() - 1] == distance - 1) {
                distance--;
                playingField[points.getLast().getX()][points.getLast().getY() - 1] = -5;
                points.addLast(new Point(points.getLast().getX(), points.getLast().getY() - 1));
                points.remove();
            }
        }
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                if (!(playingField[i][j] == -5 || playingField[i][j] == -2 || playingField[i][j] == -3 || playingField[i][j] == -1)) {
                    playingField[i][j] = 0;
                }
            }
        }
        return playingField;
    }
}
