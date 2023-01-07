import java.util.ArrayDeque;

public class WaveBuilder {
    public String[][] waveBuilder (int startX, int startY, String[][] playingField) {
        ArrayDeque<Point> points = new ArrayDeque<>();
        points.addLast(new Point(startX, startY));
        while (true) {
            if (points.peek() != null) {
                if (playingField[points.peek().getX()][points.peek().getY()].equals("[ ]")){

                }
            }
        }
        return playingField;
    }
}
