/**
 * Здесь в будущем будет рандомная генерация, но пока что все построено заранее
 */
public class FieldGenerator {

    private int[][] emptyFieldGenerate() {
        int[][] emptyField = new int[25][25];
        for (int i = 0; i < emptyField.length; i++) {
            for (int j = 0; j < emptyField.length; j++) {
                emptyField[i][j] = 0;
            }
        }
        return emptyField;
    }

    public int[][] generator() {
        int[][] playField = emptyFieldGenerate();
        for (int i = 0; i <= 7; i++) {
            playField[i][10] = -1;
        }
        for (int i = 0; i <= 3; i++) {
            playField[i][12] = -1;
        }
        for (int i = 12; i <= 15; i++) {
            playField[3][i] = -1;
        }
        for (int i = 2; i <= 6; i++) {
            playField[i][15] = -1;
        }
        for (int i = 15; i <= 20; i++) {
            playField[6][i] = -1;
        }
        for (int i = 18; i <= 19; i++) {
            playField[2][i] = -1;
        }
        for (int i = 18; i <= 19; i++) {
            playField[3][i] = -1;
        }
        for (int i = 3; i <= 8; i++) {
            playField[6][i] = -1;
        }
        for (int i = 6; i <= 12; i++) {
            playField[i][3] = -1;
        }
        for (int i = 1; i <= 3; i++) {
            playField[12][i] = -1;
        }
        for (int i = 6; i <= 23; i++) {
            playField[11][i] = -1;
        }
        for (int i = 6; i <= 23; i++) {
            playField[12][i] = -1;
        }
        for (int i = 7; i <= 11; i++) {
            playField[i][22] = -1;
        }
        for (int i = 7; i <= 11; i++) {
            playField[i][23] = -1;
        }
        for (int i = 13; i <= 16; i++) {
            playField[i][16] = -1;
        }
        for (int i = 14; i <= 15; i++) {
            playField[i][3] = -1;
        }
        for (int i = 2; i <= 6; i++) {
            playField[17][i] = -1;
        }
        for (int i = 5; i <= 13; i++) {
            playField[14][i] = -1;
        }
        for (int i = 10; i <= 14; i++) {
            playField[16][i] = -1;
        }
        for (int i = 16; i <= 19; i++) {
            playField[i][8] = -1;
        }
        for (int i = 0; i <= 2; i++) {
            playField[20][i] = -1;
        }
        for (int i = 22; i <= 23; i++) {
            playField[i][4] = -1;
        }
        for (int i = 11; i <= 15; i++) {
            playField[18][i] = -1;
        }
        for (int i = 19; i <= 20; i++) {
            playField[i][11] = -1;
        }
        for (int i = 6; i <= 15; i++) {
            playField[21][i] = -1;
        }
        for (int i = 6; i <= 15; i++) {
            playField[22][i] = -1;
        }
        for (int i = 19; i <= 23; i++) {
            playField[21][i] = -1;
        }
        for (int i = 19; i <= 23; i++) {
            playField[22][i] = -1;
        }
        for (int i = 17; i <= 23; i++) {
            playField[19][i] = -1;
        }
        for (int i = 14; i <= 17; i++) {
            playField[i][18] = -1;
        }
        for (int i = 14; i <= 15; i++) {
            playField[i][20] = -1;
        }
        for (int i = 20; i <= 22; i++) {
            playField[17][i] = -1;
        }
        for (int i = 0; i <= 24; i++) {
            playField[0][i] = -1;
        }
        for (int i = 0; i <= 24; i++) {
            playField[i][0] = -1;
        }
        for (int i = 0; i <= 24; i++) {
            playField[24][i] = -1;
        }
        for (int i = 0; i <= 24; i++) {
            playField[i][24] = -1;
        }
        return playField;
    }
}
