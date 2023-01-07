public class Program {
    public static void main(String[] args) {
        PlayingField field = new PlayingField(new FieldGenerator().generator());
        StartingPoint start = new StartingPoint(22, 1);
        field.field[start.getX()][start.getY()] = "[S]";
//        field.fieldView();
        String[][] game = new WaveBuilder().waveBuilder(start.getX(), start.getY(), field.field);
        for (String[] strings : game) {
            for (int j = 0; j < game.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }
}
