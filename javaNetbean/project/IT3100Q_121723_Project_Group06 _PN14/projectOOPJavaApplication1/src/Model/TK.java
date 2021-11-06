
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lê văn vỹ
 */
public class TK implements Serializable{
    private long salaryTB;
    private String time; 

    public TK() {
    }
  
    public TK(long salaryTB, String time) {
        this.salaryTB = salaryTB;
        this.time = time;
    }

    public long getSalaryTB() {
        return salaryTB;
    }

    public void setSalaryTB(long salaryTB) {
        this.salaryTB = salaryTB;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}


