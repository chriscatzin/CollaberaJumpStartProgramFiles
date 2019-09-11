import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main extends JFrame{


    private JPanel clientPanel;

    private JScrollPane scrollPane;
    private JButton reset;
    private JButton print;

    private JFrame window = new JFrame();
    private HashMap<Object, Client> saveClient;


    public Main(){

        ClientStore myStore = new ClientStore("clients_list.csv");
        Client[] store = myStore.getClientStore();

        window.setSize(1500,900);

        setTitle("List Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new GridLayout(10,10));

        clientPanel = new JPanel();
        reset = new JButton("Reset");
        print = new JButton("Print to the console");

        DefaultListModel<Client> listMod = new DefaultListModel<Client>();

        JList<Client> clientList = new JList<Client>(listMod);

        listMod.addAll(Arrays.asList(store));

        saveClient = new HashMap<Object, Client>();

        clientList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Save client after booking them into seat.

        clientList.setVisibleRowCount(20);
        scrollPane = new JScrollPane(clientList);
        clientPanel.add(scrollPane);
        window.add(clientPanel, BorderLayout.WEST);
        clientPanel.setBackground(Color.CYAN);

        JPanel buttons = new JPanel(new FlowLayout());
        window.add(buttons, BorderLayout.SOUTH);
        buttons.add(reset);
        buttons.add(print);

        JPanel panel = new JPanel( new GridLayout(10, 10) );
        panel.setBackground(Color.CYAN);

        window.add(panel, BorderLayout.CENTER);

        JLabel txt = new JLabel("AMC Theater", JLabel.CENTER);

        txt.setHorizontalTextPosition(JLabel.CENTER);
        txt.setFont(new Font("Serif", Font.PLAIN, 21));


        window.add(txt, BorderLayout.NORTH);


        for(int rows = 0; rows < 10; rows++) {

            for (int cols = 0; cols < 10; cols++) {

                JPanel panel2 = new JPanel();
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
                JLabel vacant = new JLabel("Vacant");
                panel2.add(vacant);

                JButton book = new JButton("Book");
                panel2.add(book);
                panel2.setBackground(Color.CYAN);
                book.addActionListener((e) -> {
                    int index = clientList.getSelectedIndex();
                        if(book.getText().equals("Book")) {
                            if (index != -1) {
                                Client client = listMod.remove(index);
                                book.setText("Unbook");
                                vacant.setText("ID: " + client.getClientId() + "/ " + client.getClientInitials());
                                saveClient.put(e.getSource(), client);
                                book.setForeground(Color.RED);
                            }
                        }
                        else{
                            listMod.addElement(saveClient.get(e.getSource()));
                            vacant.setText("Vacant");
                            book.setText("Book");
                            book.setForeground(Color.BLACK);
                        }

                });


                // This resets the entire GUI
                reset.addActionListener((x) -> {
                    //listMod.addElement(saveClient.get(x.getSource()));
                    book.setText("Book");
                    vacant.setText("Vacant");
                    book.setForeground(Color.BLACK);
                });

                panel.add(panel2);

            }
        }

        // This prints out to the clients booked
        // to the console.

        print.addActionListener((y) -> {
            if(print.getText().equals("Print to the console")){
                for(Map.Entry<Object, Client> entry : saveClient.entrySet()){
                    JOptionPane.showMessageDialog(null,"People "+
                            "who booked a seat are: " + entry.getValue());
                    System.out.println(entry.getValue());
                }
            }
        });

        window.setBackground(Color.BLUE);
        window.setVisible(true);
    }


    public static void main(String[] args) {
	    new Main();
    }
}
