/**
 * Здесь в будущем будет рандомная генерация, но пока что все построено заранее
 */
public class FieldGenerator {
    private String[][] emptyFieldGenerate() {
        String[][] emptyField = new String[24][24];
        for (int i = 0; i < emptyField.length; i++) {
            for (int j = 0; j < emptyField.length; j++) {
                emptyField[i][j] = "[ ]";
            }
        }
        return emptyField;
    }

    public String[][] generator() {
        String[][] playField = emptyFieldGenerate();
        for (int i = 0; i <= 7; i++) {
            playField[i][10] = "[B]";
        }
        for (int i = 0; i <= 3; i++) {
            playField[i][12] = "[B]";
        }
        for (int i = 12; i <= 15; i++) {
            playField[3][i] = "[B]";
        }
        for (int i = 2; i <= 6; i++) {
            playField[i][15] = "[B]";
        }
        for (int i = 15; i <= 20; i++) {
            playField[6][i] = "[B]";
        }
        for (int i = 18; i <= 19; i++) {
            playField[2][i] = "[B]";
        }
        for (int i = 18; i <= 19; i++) {
            playField[3][i] = "[B]";
        }
        for (int i = 0; i <= 8; i++) {
            playField[6][i] = "[B]";
        }
        for (int i = 6; i <= 12; i++) {
            playField[i][3] = "[B]";
        }
        for (int i = 1; i <= 3; i++) {
            playField[12][i] = "[B]";
        }
        for (int i = 6; i <= 23; i++) {
            playField[11][i] = "[B]";
        }
        for (int i = 6; i <= 23; i++) {
            playField[12][i] = "[B]";
        }
        for (int i = 6; i <= 10; i++) {
            playField[i][22] = "[B]";
        }
        for (int i = 6; i <= 10; i++) {
            playField[i][23] = "[B]";
        }
        for (int i = 13; i <= 16; i++) {
            playField[i][16] = "[B]";
        }
        for (int i = 14; i <= 15; i++) {
            playField[i][3] = "[B]";
        }
        for (int i = 2; i <= 6; i++) {
            playField[17][i] = "[B]";
        }
        for (int i = 5; i <= 13; i++) {
            playField[14][i] = "[B]";
        }
        for (int i = 10; i <= 14; i++) {
            playField[16][i] = "[B]";
        }
        for (int i = 16; i <= 19; i++) {
            playField[i][8] = "[B]";
        }
        for (int i = 0; i <= 2; i++) {
            playField[20][i] = "[B]";
        }
        for (int i = 22; i <= 23; i++) {
            playField[i][3] = "[B]";
        }
        for (int i = 11; i <= 15; i++) {
            playField[18][i] = "[B]";
        }
        for (int i = 19; i <= 20; i++) {
            playField[i][11] = "[B]";
        }
        for (int i = 6; i <= 15; i++) {
            playField[21][i] = "[B]";
        }
        for (int i = 6; i <= 15; i++) {
            playField[22][i] = "[B]";
        }
        for (int i = 18; i <= 22; i++) {
            playField[21][i] = "[B]";
        }
        for (int i = 18; i <= 22; i++) {
            playField[22][i] = "[B]";
        }
        for (int i = 17; i <= 23; i++) {
            playField[19][i] = "[B]";
        }
        for (int i = 14; i <= 17; i++) {
            playField[i][18] = "[B]";
        }
        for (int i = 14; i <= 15; i++) {
            playField[i][20] = "[B]";
        }
        for (int i = 20; i <= 22; i++) {
            playField[17][i] = "[B]";
        }
        return playField;
    }
}
