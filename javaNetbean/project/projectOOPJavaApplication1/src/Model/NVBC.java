
package Model;

import java.io.Serializable;

/**
 *
 * @author lê văn vỹ
 */
public class NVBC implements Serializable{
    private String name, SoCMT, DonVi, TGBatDau;
    private long SoGioLamThem;

    public NVBC(String name, String SoCMT, String Donvi, String TGBatDau, long SoGioLamThem) {
        this.name = name;
        this.SoCMT = SoCMT;
        this.DonVi = Donvi;
        this.TGBatDau = TGBatDau;
        this.SoGioLamThem = SoGioLamThem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoCMT() {
        return SoCMT;
    }

    public void setSoCMT(String SoCMT) {
        this.SoCMT = SoCMT;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public String getTGBatDau() {
        return TGBatDau;
    }

    public void setTGBatDau(String TGBatDau) {
        this.TGBatDau = TGBatDau;
    }

    
    public long getSoGioLamThem(){
        return SoGioLamThem;
    }
    
    public void setSoGioLamThem(long SoGioLamThem){
        this.SoGioLamThem = SoGioLamThem;
    }
    
}


