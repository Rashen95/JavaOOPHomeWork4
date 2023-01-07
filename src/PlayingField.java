public class PlayingField {
    private final String[][] field;

    public PlayingField (String[][] arg_field) {
        this.field = arg_field;
    }

    public void fieldView() {
        for (String[] strings : this.field) {
            for (int j = 0; j < this.field.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }
}
