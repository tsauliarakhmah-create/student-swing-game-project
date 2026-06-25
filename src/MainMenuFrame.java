import javax.swing.*;
import java.awt.*;

public class MainMenuFrame extends JFrame {

    private Player currentPlayer;
    private JButton btnStartGame;
    private JButton btnStatistics;
    private JButton btnTopScorers;
    private JButton btnExit;

    public MainMenuFrame(Player player) {

        this.currentPlayer = player;
        setTitle("Main Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 1));

        JLabel welcomeLabel = new JLabel("Welcome " + currentPlayer.getUsername());

        btnStartGame = new JButton("Start Game");
        btnStatistics = new JButton("Statistics");
        btnTopScorers = new JButton("Top 5 Players");
        btnExit = new JButton("Exit");

        btnStartGame.addActionListener(e -> {
            GameFrame gameFrame = new GameFrame(currentPlayer);
            gameFrame.setVisible(true);
            this.dispose();
        });

        btnStatistics.addActionListener(e -> {
            StatisticsFrame statisticsFrame = new StatisticsFrame(currentPlayer);
            statisticsFrame.setVisible(true);
        });


        btnTopScorers.addActionListener(e -> {
            TopScorersFrame topFrame = new TopScorersFrame();
            topFrame.setVisible(true);
        });


        btnExit.addActionListener(e -> {
            System.exit(0);
        });

        panel.add(welcomeLabel);
        panel.add(btnStartGame);
        panel.add(btnStatistics);
        panel.add(btnTopScorers);
        panel.add(btnExit);

        add(panel);
        setVisible(true);
    }
}