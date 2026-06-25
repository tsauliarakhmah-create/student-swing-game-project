import javax.swing.*;
import java.awt.*;

public class StatisticsFrame extends JFrame {

    public StatisticsFrame(Player player) {

        setTitle("Statistics");
        setSize(300,250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5,1));

        panel.add(new JLabel("Username: " + player.getUsername()));
        panel.add(new JLabel("Wins: " + player.getWins()));
        panel.add(new JLabel("Losses: " + player.getLosses()));
        panel.add(new JLabel("Draws: " + player.getDraws()));
        panel.add(new JLabel("Score: " + player.getScore()));

        add(panel);

        setVisible(true);
    }
}