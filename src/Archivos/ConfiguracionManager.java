/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class ConfiguracionManager 
{
 private static ConfiguracionManager cm = new ConfiguracionManager();

    private Properties props;

    private ConfiguracionManager() {
        
        props = new Properties();
    }

    public static ConfiguracionManager getInstance() {
        
        return cm;
    }

    public String getProperty(String key) {
        return props.getProperty(key, "");
    }

    public void setProperty(String key, String value) {
        props.setProperty(key, value);
    }

    private Path get_config_dir() throws IOException {
        
        Path path = FileSystems.getDefault().getPath(System.getProperty("user.home"), ".LeeArchivos");
        if (!Files.isDirectory(path)) {
            Files.createDirectories(path);
        }
        return path;
    }

    private String get_config_file() throws IOException {
        
        Path path = this.get_config_dir();
        path = path.getFileSystem().getPath(path.toString(), "config.properties");
        return path.toString();
    }

    public void load_config() {
        
        File configFile;
        try {
            configFile = new File(this.get_config_file());
            InputStream inputStream = new FileInputStream(configFile);
            props.load(inputStream);
            inputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(ConfiguracionManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save_config() {
        
        Path path = FileSystems.getDefault().getPath(System.getProperty("user.home", ".LeeArchivos"));
        System.out.println(path.toString());
        File configFile = null;
        FileWriter writer = null;
        props.setProperty("formato", "json");
        try {
            writer = new FileWriter(this.get_config_file());
            props.store(writer, "leearchivos settings");

        } catch (IOException ex) {
            Logger.getLogger(ConfiguracionManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ConfiguracionManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}
