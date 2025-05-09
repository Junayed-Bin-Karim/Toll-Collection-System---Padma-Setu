import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TollRate extends JFrame implements ActionListener {
    String[] name ={"Bus", "Car","Motor Cycle"};
    String[] rate ={"100","100","100"};
    JFrame frame = new JFrame();
    Container container = new Container();
    JButton backButton = new JButton("Back");
    public TollRate(){
        container.setLayout(null);
        String[] column={"Name","Toll Rate"};
        DefaultTableModel model = new DefaultTableModel(column, 0);
        for (int i = 0; i < name.length; i++) {
            String serial =name[i];
            String name = rate[i];
            model.addRow(new Object[]{serial, name});
        }

        backButton.setFocusable(false);
        backButton.addActionListener(this);
        JTable table = new JTable(model);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.SOUTH);


        frame.setTitle("Remove Candidate");
        frame.add(panel);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            frame.setVisible(false);
            new TollMenu();
    }
}
}
