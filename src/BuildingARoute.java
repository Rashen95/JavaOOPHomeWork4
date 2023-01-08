import java.util.ArrayDeque;
public class BuildingARoute {
    public String[][] builder(int startX, int startY, String[][] playingField) {
        ArrayDeque<Point> points = new ArrayDeque<>();
        points.addLast(new Point(startX, startY));
        int distance = 0;
        if (startX + 1 < playingField.length && !playingField[startX + 1][startY].equals("[ ]") && !playingField[startX + 1][startY].equals("[B]")) {
            distance = Integer.parseInt(String.valueOf(playingField[startX + 1][startY].replace("[", "").replace("]", "")));
            playingField[startX + 1][startY] = "[*]";
            points.addLast(new Point(startX + 1, startY));
            points.remove();
        } else if (startY + 1 < playingField.length && !playingField[startX][startY + 1].equals("[ ]") && !playingField[startX][startY + 1].equals("[B]")) {
            distance = Integer.parseInt(String.valueOf(playingField[startX][startY + 1].replace("[", "").replace("]", "")));
            playingField[startX][startY + 1] = "[*]";
            points.addLast(new Point(startX, startY + 1));
            points.remove();
        } else if (startX - 1 < playingField.length && !playingField[startX - 1][startY].equals("[ ]") && !playingField[startX - 1][startY].equals("[B]")) {
            distance = Integer.parseInt(String.valueOf(playingField[startX - 1][startY].replace("[", "").replace("]", "")));
            playingField[startX - 1][startY] = "[*]";
            points.addLast(new Point(startX - 1, startY));
            points.remove();
        } else if (startY - 1 < playingField.length && !playingField[startX][startY - 1].equals("[ ]") && !playingField[startX][startY - 1].equals("[B]")) {
            distance = Integer.parseInt(String.valueOf(playingField[startX][startY - 1].replace("[", "").replace("]", "")));
            playingField[startX][startY - 1] = "[*]";
            points.addLast(new Point(startX, startY - 1));
            points.remove();
        }
        while (distance > 1) {
            if (points.getLast().getX() + 1 < playingField.length && playingField[points.getLast().getX() + 1][points.getLast().getY()].equals(String.format("[%s]", distance - 1))) {
                distance--;
                playingField[points.getLast().getX() + 1][points.getLast().getY()] = "[*]";
                points.addLast(new Point(points.getLast().getX() + 1, points.getLast().getY()));
                points.remove();
            } else if (points.getLast().getY() + 1 < playingField.length && playingField[points.getLast().getX()][points.getLast().getY() + 1].equals(String.format("[%s]", distance - 1))) {
                distance--;
                playingField[points.getLast().getX()][points.getLast().getY() + 1] = "[*]";
                points.addLast(new Point(points.getLast().getX(), points.getLast().getY() + 1));
                points.remove();
            } else if (points.getLast().getX() - 1 >= 0 && playingField[points.getLast().getX() - 1][points.getLast().getY()].equals(String.format("[%s]", distance - 1))) {
                distance--;
                playingField[points.getLast().getX() - 1][points.getLast().getY()] = "[*]";
                points.addLast(new Point(points.getLast().getX() - 1, points.getLast().getY()));
                points.remove();
            } else if (points.getLast().getY() - 1 >= 0 && playingField[points.getLast().getX()][points.getLast().getY() - 1].equals(String.format("[%s]", distance - 1))) {
                distance--;
                playingField[points.getLast().getX()][points.getLast().getY() - 1] = "[*]";
                points.addLast(new Point(points.getLast().getX(), points.getLast().getY() - 1));
                points.remove();
            }
        }
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                if (playingField[i][j].equals("[*]") || playingField[i][j].equals("{S}") || playingField[i][j].equals("{C}") || playingField[i][j].equals("[B]")) {
                    continue;
                }
                else {
                    playingField[i][j] = "[ ]";
                }
            }
        }
        return playingField;
    }
}
