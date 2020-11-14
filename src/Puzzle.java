import java.util.ArrayList;

/**
 * Created by Maryam Askari
 * Date: 10/24/2020
 * Time: 7:06 PM
 * Project: IntelliJ IDEA
 */
public class Puzzle {
    private ArrayList<String> board = new ArrayList<>();
    private int emptyBlock;

    // Att lägga slumptal i listen board
    public Puzzle() {
        int ran;
        int i = 0;
        while (i < 16) {
            ran = (int) ((Math.random() * 16) + 1);

            // Siffror ska inte vara dubbletter
            if (!board.contains(String.valueOf(ran))) {
                board.add(String.valueOf(ran));
                i++;
            }
        }
        /*for (int i=1;i<15;i++) {
            board.add(String.valueOf(i));
        }
        board.add("16");
        board.add("15");*/

        // Där som ligger numret 16 ska vara tom
        emptyBlock = board.indexOf("16");
        board.set(emptyBlock, " ");
    }

    // Att returnera listan board
    public ArrayList<String> getBoard() {
        return board;
    }

    // För att undersöka var tomma platsen can flyttas.
    public void setPosition(int pos) {
        if ((emptyBlock != pos) &&

                // Top
                ((emptyBlock < 3) &&
                        ((pos == emptyBlock - 1) || (pos == emptyBlock + 1) || (pos == emptyBlock + 4))) ||

                // Left
                ((emptyBlock == 0 || emptyBlock == 4 || emptyBlock == 8 || emptyBlock == 12) &&
                        ((pos == emptyBlock - 4) || (pos == emptyBlock + 1) || (pos == emptyBlock + 4))) ||

                // Right
                ((emptyBlock == 3 || emptyBlock == 7 || emptyBlock == 11 || emptyBlock == 15) &&
                        ((pos == emptyBlock - 1) || (pos == emptyBlock - 4) || (pos == emptyBlock + 4))) ||

                // Bottom
                ((12 < emptyBlock) &&
                        ((pos == emptyBlock - 1) || (pos == emptyBlock - 4) || (pos == emptyBlock + 1))) ||

                // Center
                ((emptyBlock == 5 || emptyBlock == 6 || emptyBlock == 9 || emptyBlock == 10) &&
                        ((pos == emptyBlock - 1) || (pos == emptyBlock - 4) || (pos == emptyBlock + 1) || (pos == emptyBlock + 4)))

        ) {
            board.set(emptyBlock, board.get(pos));
            emptyBlock = pos;
            board.set(emptyBlock, " ");
        }
    }

   // Undersöker om alla nummer i listan ligger i nummerordning
    public boolean getWinner() {
        int counter = 0;
        for (int i = 0; i < 15; i++) {
            if (board.get(i).equals(String.valueOf(i + 1))) {
                counter++;
            }
        }

        return counter == 15;
    }

    // för att tomma arrayListen
    public void clearBoard() {
        board.clear();
    }
}
