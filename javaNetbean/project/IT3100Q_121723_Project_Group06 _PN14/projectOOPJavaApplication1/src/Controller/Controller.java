
package Controller;

import java.util.List;



/**
 *
 * @author lê văn vỹ
 */
public interface Controller {
    <T> void writeToFile(List<T> list, String fileName);
    <T> List<T> readDataFromFile(String fileName);            
}
