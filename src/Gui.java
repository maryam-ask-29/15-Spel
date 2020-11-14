import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maryam Askari
 * Date: 10/24/2020
 * Time: 7:08 PM
 * Project: IntelliJ IDEA
 */
public class Gui extends JFrame implements ActionListener {
    // Skapa en objekt av puzzle.
    private Puzzle puzzle;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9,
            b10,b11,b12,b13,b14,b15,b16,reset;

    public Gui(Puzzle puzzle) {
        super("Puzzle Game");
        this.puzzle = puzzle;

        b1 = new JButton(puzzle.getBoard().get(0));
        b2 = new JButton(puzzle.getBoard().get(1));
        b3 = new JButton(puzzle.getBoard().get(2));
        b4 = new JButton(puzzle.getBoard().get(3));
        b5 = new JButton(puzzle.getBoard().get(4));
        b6 = new JButton(puzzle.getBoard().get(5));
        b7 = new JButton(puzzle.getBoard().get(6));
        b8 = new JButton(puzzle.getBoard().get(7));
        b9 = new JButton(puzzle.getBoard().get(8));
        b10 = new JButton(puzzle.getBoard().get(9));
        b11 = new JButton(puzzle.getBoard().get(10));
        b12 = new JButton(puzzle.getBoard().get(11));
        b13 = new JButton(puzzle.getBoard().get(12));
        b14 = new JButton(puzzle.getBoard().get(13));
        b15 = new JButton(puzzle.getBoard().get(14));
        b16 = new JButton(puzzle.getBoard().get(15));
        reset = new JButton("Nytt spel");

        b1.setBackground(Color.GREEN);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.GREEN);
        b4.setBackground(Color.GREEN);
        b5.setBackground(Color.GREEN);
        b6.setBackground(Color.GREEN);
        b7.setBackground(Color.GREEN);
        b8.setBackground(Color.GREEN);
        b9.setBackground(Color.GREEN);
        b10.setBackground(Color.GREEN);
        b11.setBackground(Color.GREEN);
        b12.setBackground(Color.GREEN);
        b13.setBackground(Color.GREEN);
        b14.setBackground(Color.GREEN);
        b15.setBackground(Color.GREEN);
        b16.setBackground(Color.GREEN);
        reset.setBackground(Color.RED);

        // Position och size
        b1.setBounds(30, 30, 50, 40);
        b2.setBounds(90, 30, 50, 40);
        b3.setBounds(150, 30, 50, 40);
        b4.setBounds(210, 30, 50, 40);
        b5.setBounds(30, 80, 50, 40);
        b6.setBounds(90, 80, 50, 40);
        b7.setBounds(150, 80, 50, 40);
        b8.setBounds(210, 80, 50, 40);
        b9.setBounds(30, 130, 50, 40);
        b10.setBounds(90, 130, 50, 40);
        b11.setBounds(150, 130, 50, 40);
        b12.setBounds(210, 130, 50, 40);
        b13.setBounds(30,180,50,40);
        b14.setBounds(90,180,50,40);
        b15.setBounds(150,180,50,40);
        b16.setBounds(210,180,50,40);
        reset.setBounds(100,230,100,60);

        // addera till Jfarme som ärvas
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(reset);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        reset.addActionListener(this);

        setSize(310, 350);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() != reset) {
            puzzle.setPosition(getPositionButton(e));

            if (puzzle.getWinner()) {
                JOptionPane.showMessageDialog(null, "Grattis, du vann!");
            }
        }else{
            puzzle.clearBoard();
            puzzle = new Puzzle();
        }

        setAllText();
    }

    private void setAllText() {
        b1.setText(puzzle.getBoard().get(0));
        b2.setText(puzzle.getBoard().get(1));
        b3.setText(puzzle.getBoard().get(2));
        b4.setText(puzzle.getBoard().get(3));
        b5.setText(puzzle.getBoard().get(4));
        b6.setText(puzzle.getBoard().get(5));
        b7.setText(puzzle.getBoard().get(6));
        b8.setText(puzzle.getBoard().get(7));
        b9.setText(puzzle.getBoard().get(8));
        b10.setText(puzzle.getBoard().get(9));
        b11.setText(puzzle.getBoard().get(10));
        b12.setText(puzzle.getBoard().get(11));
        b13.setText(puzzle.getBoard().get(12));
        b14.setText(puzzle.getBoard().get(13));
        b15.setText(puzzle.getBoard().get(14));
        b16.setText(puzzle.getBoard().get(15));
    }

    private int getPositionButton(ActionEvent e) {
        if (e.getSource() == b2) {
            return 1;
        } else if (e.getSource() == b3) {
            return 2;
        } else if (e.getSource() == b4) {
            return 3;
        } else if (e.getSource() == b5) {
            return 4;
        } else if (e.getSource() == b6) {
            return 5;
        } else if (e.getSource() == b7) {
            return 6;
        } else if (e.getSource() == b8) {
            return 7;
        } else if (e.getSource() == b9) {
            return 8;
        } else if (e.getSource() == b10) {
            return 9;
        } else if (e.getSource() == b11) {
            return 10;
        } else if (e.getSource() == b12) {
            return 11;
        } else if (e.getSource() == b13) {
            return 12;
        } else if (e.getSource() == b14) {
            return 13;
        } else if (e.getSource() == b15) {
            return 14;
        } else if (e.getSource() == b16) {
            return 15;
        } else {
            return 0;
        }
    }

}
