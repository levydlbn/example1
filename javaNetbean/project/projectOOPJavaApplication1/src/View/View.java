
package View;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lê văn vỹ
 */
public interface View {
    <T> void showData(List<T> list, DefaultTableModel Model);
    
}
