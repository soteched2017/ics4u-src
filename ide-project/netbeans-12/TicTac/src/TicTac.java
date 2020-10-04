import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this);

    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[3][3];
    JButton play = new JButton("Play");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    String path = "ide-project/netbeans-12/TicTac/"; // vmso - fixed path
    ImageIcon back = new ImageIcon(path + "cardback.jpg");


    public TicTac() {
        super ("Tic Tac Toe");
        setSize (500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(4, 3, 10, 10);
        row1.setLayout(layout1);
        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        row1.add(blank1);
        row1.add(play);
        row1.add(blank2);
        add (row1);

        play.addActionListener(tictac);
        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }


        setVisible(true);
    }

    public static void main(String[] arguments){
        TicTac frame = new TicTac();
    }
}