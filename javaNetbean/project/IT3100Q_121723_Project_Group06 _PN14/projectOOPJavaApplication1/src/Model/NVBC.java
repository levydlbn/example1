
package Model;

import java.io.Serializable;

/**
 *
 * @author lê văn vỹ
 */
public class NVBC extends NV implements Serializable{
    private long SoGioLamThem;

    public NVBC(String name, String SoCMT, String Donvi, String TGBatDau, long SoGioLamThem) {
        super(name, SoCMT, Donvi, TGBatDau);
        this.SoGioLamThem = SoGioLamThem;
    }

    public long getSoGioLamThem(){
        return SoGioLamThem;
    }
    
    public void setSoGioLamThem(long SoGioLamThem){
        this.SoGioLamThem = SoGioLamThem;
    }
    
    public long salary(){
        long salary = 2000000 + this.SoGioLamThem*200000;
        return salary;
    }
    
}


