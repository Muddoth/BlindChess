/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pp3a.blindchess;

/**
 *
 * @author Himiko
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlindChess {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Blind Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Welcome to Blind Chess!");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);

        JButton playButton = new JButton("Play");
        playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openChessboardWindow();
            }
        });
        panel.add(playButton);

        JButton instructionsButton = new JButton("Instructions");
        instructionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        instructionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showInstructions();
            }
        });
        panel.add(instructionsButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }

    private static void openChessboardWindow() {
        JFrame chessboardFrame = new JFrame("Chessboard");
        chessboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessboardFrame.setSize(400, 400);
        chessboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessboardFrame.setLocationRelativeTo(null);
        

        JPanel chessboardPanel = new JPanel(new GridLayout(8, 8));

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                square.setBackground((row + col) % 2 == 0 ? Color.PINK : Color.BLACK);
                chessboardPanel.add(square);
            }
        }
        
        chessboardFrame.getContentPane().add(chessboardPanel);
        chessboardFrame.setVisible(true);
    }

    private static void showInstructions() {
        JFrame instructionsFrame = new JFrame("Instructions");
        instructionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instructionsFrame.setSize(400, 200);

        JTextArea instructionsTextArea = new JTextArea();
        instructionsTextArea.setText("Write your instructions here...");

        JScrollPane scrollPane = new JScrollPane(instructionsTextArea);
        instructionsFrame.getContentPane().add(scrollPane);

        instructionsFrame.setVisible(true);
    }
}
