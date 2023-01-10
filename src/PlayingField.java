public class PlayingField {
    private final int[][] field;
    private final Point start;
    private final Point close;

    public PlayingField(int[][] arg_field, Point arg_start, Point arg_close) {
        this.field = arg_field;
        this.start = arg_start;
        this.close = arg_close;
        field[start.getX()][start.getY()] = -2;
        field[close.getX()][close.getY()] = -3;
    }

    public void fieldView() {
        for (int[] strings : this.field) {
            for (int j = 0; j < this.field.length; j++) {
                if (strings[j] == -1) {
                    System.out.print("\u001B[31m[@]\u001B[0m");
                } else if (strings[j] == -2) {
                    System.out.print("\u001B[32m[S]\u001B[0m");
                } else if (strings[j] == -3) {
                    System.out.print("\u001B[32m[C]\u001B[0m");
                } else if (strings[j] == 0) {
                    System.out.print("   ");
                } else if (strings[j] == -5) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void routeView() {
        int[][] fieldWithRoute = new BuildingARoute().builder(close.getX(), close.getY(),
                new WaveBuilder().waveBuilder(start.getX(), start.getY(), this.field)); // Построение цифровой волны и маршрута
        for (int[] strings : fieldWithRoute) {
            for (int j = 0; j < fieldWithRoute.length; j++) {
                if (strings[j] == -1) {
                    System.out.print("\u001B[31m[@]\u001B[0m");
                } else if (strings[j] == -2) {
                    System.out.print("\u001B[32m[S]\u001B[0m");
                } else if (strings[j] == -3) {
                    System.out.print("\u001B[32m[C]\u001B[0m");
                } else if (strings[j] == 0) {
                    System.out.print("   ");
                } else if (strings[j] == -5) {
                    System.out.print("\u001B[34m + \u001B[0m");
                }
            }
            System.out.println();
        }
    }
}
