
package Controller;

import Model.NVBC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lê văn vỹ
 */
public class ControllerImp implements Controller{

    @Override  
    // ghi dữ liệu ra file
    public <T> void writeToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
                
    }

    @Override
    
    // đọc dữ liệu từ file
    public <T> List<T> readDataFromFile(String fileName) {
       List<T> list = new ArrayList<>();
       File file = new File(fileName);
       try{
           file.createNewFile();
           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);
           Object o = ois.readObject();
           list = (List<T>) o;
           ois.close();
           fis.close();
       }catch(IOException ex){
           ex.printStackTrace();
       }catch(ClassNotFoundException ex){
           ex.printStackTrace();
       }
       return list;
    }
       
    
}