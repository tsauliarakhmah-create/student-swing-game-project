import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TopScorersFrame extends JFrame {

    private JTable table;
    private PlayerService playerService;

    public TopScorersFrame() {

        playerService = new PlayerService();

        setTitle("Top 5 Players");
        setSize(400, 300);
        setLocationRelativeTo(null);


        String[] columns = {"Username", "Wins", "Losses", "Draws", "Score"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);


        List<Player> players = playerService.getTopPlayers();


        for (Player player : players) {
            Object[] row = {
                    player.getUsername(),
                    player.getWins(),
                    player.getLosses(),
                    player.getDraws(),
                    player.getScore()
            };
            model.addRow(row);
        }

        table = new JTable(model);
        add(new JScrollPane(table));
    }
}