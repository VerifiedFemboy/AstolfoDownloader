package utils;

import javax.swing.*;

public class FileChooser extends JPanel {

    JFileChooser chooser;
    String choosertitle = "Location";

    public void choosing(){
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            PathUtils.setPath(chooser.getSelectedFile().getPath());
            System.out.println(chooser.getSelectedFile().getPath());
        }
        else {
            System.out.println("No Selection ");
        }
    }
}
