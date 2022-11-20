package praktika10.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextDocument extends JFrame implements IDocument  {
    String filename;
    final JLabel label = new JLabel("234324");
    JTextField txt = new JTextField("filename.txt");

    @Override
    public void PushNew(String filename) {
        this.filename = filename+"*";
    }

    @Override
    public void PushOpen(String filename) {
        this.filename = filename+"*";
    }

    @Override
    public void PushSave() {
        filename = filename.substring(0, filename.length() - 1);
    }

    @Override
    public void PushExit() {System.exit(0);}

    @Override
    public void run() {
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container content = getContentPane();
        setLocationRelativeTo(null);
        setResizable(false);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        Font font = new Font("Verdana", Font.PLAIN, 18);
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setFont(font);
        txt.setText(filename);
        content.add(label);
        txt.setFont(new Font("Dialog", Font.PLAIN, 30));
        content.add(txt);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Файл");

        JMenuItem createNew = new JMenuItem("New");
        createNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PushNew(txt.getText());
                label.setText("Текущий файл: "+filename);
            }
        });

        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PushOpen(txt.getText());
                label.setText("Текущий файл: "+filename);
            }
        });

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PushSave();
                label.setText("Текущий файл: "+filename);
            }
        });

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PushExit();
            }
        });

        file.add(createNew);
        file.add(open);
        file.add(save);
        file.add(exit);
        return file;
    }
}