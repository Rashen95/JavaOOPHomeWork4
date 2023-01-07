public class Program {
    public static void main(String[] args) {
        PlayingField p1 = new PlayingField(new FieldGenerator().generator());
        p1.fieldView();
    }
}
