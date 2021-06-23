/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.fmc;


import java.io.File;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Developer
 */
public class FileBrowser {
    public String guardarComo() {
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resultado = f.showSaveDialog(null);
        if (resultado==JFileChooser.CANCEL_OPTION);
        return f.getSelectedFile().toString();
    }

    public String abrirArchivos(Map<String,String> typeFile) {
        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(typeFile.get("Desc"), typeFile.get("Ext"),typeFile.get("Type"));
        f.setFileFilter(filter);
        int resultado = f.showOpenDialog(null);
        File file = f.getSelectedFile();
        if (resultado==JFileChooser.CANCEL_OPTION);
        return file.getAbsolutePath();
    }
}
