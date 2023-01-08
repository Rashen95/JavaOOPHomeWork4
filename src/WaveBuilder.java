import java.util.ArrayDeque;

public class WaveBuilder {
    public String[][] waveBuilder(int startX, int startY, String[][] playingField) {
        ArrayDeque<Point> points = new ArrayDeque<>();
        playingField[startX][startY] = "[0]";
        points.addLast(new Point(startX, startY));
        boolean flag = false;
        while (!flag) {
            if (points.element().getX() + 1 < playingField.length && playingField[points.element().getX() + 1][points.element().getY()].equals("{C}")
                    || points.element().getY() + 1 < playingField.length && playingField[points.element().getX()][points.element().getY() + 1].equals("{C}")
                    || points.element().getX() - 1 >= 0 && playingField[points.element().getX() - 1][points.element().getY()].equals("{C}")
                    || points.element().getY() - 1 >= 0 && playingField[points.element().getX()][points.element().getY() - 1].equals("{C}")) {
                flag = true;
            } else {
                if (points.element().getX() + 1 < playingField.length && playingField[points.element().getX() + 1][points.element().getY()].equals("[ ]")) {
                    playingField[points.element().getX() + 1][points.element().getY()] = String.format("[%s]",
                            Integer.parseInt(String.valueOf(playingField[points.element().getX()][points.element().getY()].replace("[", "").replace("]", ""))) + 1);
                    points.addLast(new Point(points.element().getX() + 1, points.element().getY()));
                }
                if (points.element().getY() + 1 < playingField.length && playingField[points.element().getX()][points.element().getY() + 1].equals("[ ]")) {
                    playingField[points.element().getX()][points.element().getY() + 1] = String.format("[%d]",
                            Integer.parseInt(String.valueOf(playingField[points.element().getX()][points.element().getY()].replace("[", "").replace("]", ""))) + 1);
                    points.addLast(new Point(points.element().getX(), points.element().getY() + 1));
                }
                if (points.element().getX() - 1 >= 0 && playingField[points.element().getX() - 1][points.element().getY()].equals("[ ]")) {
                    playingField[points.element().getX() - 1][points.element().getY()] = String.format("[%d]",
                            Integer.parseInt(String.valueOf(playingField[points.element().getX()][points.element().getY()].replace("[", "").replace("]", ""))) + 1);
                    points.addLast(new Point(points.element().getX() - 1, points.element().getY()));
                }
                if (points.element().getY() - 1 >= 0 && playingField[points.element().getX()][points.element().getY() - 1].equals("[ ]")) {
                    playingField[points.element().getX()][points.element().getY() - 1] = String.format("[%d]",
                            Integer.parseInt(String.valueOf(playingField[points.element().getX()][points.element().getY()].replace("[", "").replace("]", ""))) + 1);
                    points.addLast(new Point(points.element().getX(), points.element().getY() - 1));
                }
                points.remove();
            }
        }
        playingField[startX][startY] = "{S}";
        return playingField;
    }
}
