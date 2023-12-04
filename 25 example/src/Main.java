import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.util.HashSet;
import java.lang.StringBuilder;

public class Main {
    private static void createGUI() {
        JFrame win = new JFrame("Проверка текста");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setPreferredSize(new Dimension(400, 300));
        win.setLocation(100, 100);
        win.setContentPane(new Box(BoxLayout.Y_AXIS));
        JTextArea text = new JTextArea();
        text.setColumns(20);
        text.setRows(80);
        text.setLineWrap(true);
        text.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        win.getContentPane().add(text);
        JButton button = new JButton("Проверить");
        button.addActionListener(e -> {
            String str = text.getText();
            if ( str == null || str.isEmpty() ) {
                JDialog dialog = new JDialog(win, "Текст не введён", true);
                dialog.setBounds(100, 200, 400, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.getContentPane().add(new JLabel("Введите текст и попробуйте снова."));
                dialog.setVisible(true);
            }
            else {
                Set<Character> symbols = new HashSet<>();
                for (char c : str.toCharArray()){
                    if ( ! ( Character.isLetter(c) || Character.isSpaceChar(c) ) )
                        symbols.add(c);
                }
                if ( symbols.isEmpty() ) {
                    JDialog dialog = new JDialog(win, "Символы не найдены.", true);
                    dialog.setBounds(100, 200, 400, 100);
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.getContentPane().add(new JLabel("Нет символов отличных от букв и пробелов."));
                    dialog.setVisible(true);
                }
                else {
                    StringBuilder sb = new StringBuilder();
                    for ( char c : symbols )
                        sb.append(c);

                    JDialog dialog = new JDialog(win, "Символы, отличные от букв и пробелов", true);
                    dialog.setBounds(100, 200, 400, 100);
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.getContentPane().add(new JLabel(sb.toString(), SwingConstants.CENTER));
                    dialog.setVisible(true);
                }
            }
        });

        win.getContentPane().add(button);
        win.pack();
        win.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> createGUI());
    }
}