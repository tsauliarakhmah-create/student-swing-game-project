import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {

    private JButton[][] buttons;
    private GameLogic game;
    private Player player;

    public GameFrame(Player player) {
        this.player = player;
        game = new GameLogic();

        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3,3));

        buttons = new JButton[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                int row = i;
                int col = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(game.makeMove(row, col, 'X')) {
                            buttons[row][col].setText("X");

                            if(game.checkWin('X')) {
                                PlayerService service = new PlayerService();
                                service.updateStatistics(player, "WIN");
                                JOptionPane.showMessageDialog(
                                        null,
                                        "YOU WIN!"
                                );
                                dispose();
                                new MainMenuFrame(player);
                                return;
                            }
                            if(game.isBoardFull()) {
                                PlayerService service = new PlayerService();
                                service.updateStatistics(player, "DRAW");
                                JOptionPane.showMessageDialog(
                                        null,
                                        "DRAW!"
                                );
                                dispose();

                                new MainMenuFrame(player);
                                return;
                            }
                            int[] move = game.computerMove();
                            buttons[move[0]][move[1]].setText("O");

                            if(game.checkWin('O')) {
                                PlayerService service = new PlayerService();
                                service.updateStatistics(player, "LOSE");
                                JOptionPane.showMessageDialog(
                                        null,
                                        "YOU LOSE!"
                                );
                                dispose();
                                new MainMenuFrame(player);
                                return;
                            }

                            if(game.isBoardFull()) {
                                PlayerService service = new PlayerService();
                                service.updateStatistics(player, "DRAW");
                                JOptionPane.showMessageDialog(
                                        null,
                                        "Seri!"
                                );
                                dispose();
                                new MainMenuFrame(player);
                                return;
                            }
                        }
                    }
                });
                panel.add(buttons[i][j]);
            }
        }
        add(panel);
        setVisible(true);
    }
}