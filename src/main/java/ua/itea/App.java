package ua.itea;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App extends JFrame {
    public App() throws IOException {
        super("2");
        setVisible(true);
        setSize(100, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        URL url = getClass().getClassLoader().getResource("Pudge.png");
        URL url2 = getClass().getClassLoader().getResource("1.png");
        JLabel label = new JLabel(new ImageIcon(url));
        JLabel label1 = new JLabel(readTxt("D:\\java\\Maven_hm6\\hmMaven\\src\\main\\resources\\1.txt"));
        JLabel label2 = new JLabel(new ImageIcon(url2));
        JLabel label3 = new JLabel(readTxt("D:\\java\\Maven_hm6\\hmMaven\\src\\main\\resources\\2.txt"));
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(label1);
        panel.add((label2));
      panel.add(label3);
        add(panel);
    }

    public static void main(String[] args) throws IOException {
        new App();
    }

    private static String readTxt(String filename) throws IOException {
        Path path = Paths.get(filename);
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            return line;
        }
        scanner.close();
        return null;
    }
}
