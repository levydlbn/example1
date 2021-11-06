/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author lê văn vỹ
 */
public class NVTV extends NV implements Serializable{
    private long SoHopDong;

    public NVTV(String name,String SoCMT, String Donvi, String TGBatDau, long SoHopDong) {
        super(name, SoCMT, Donvi, TGBatDau);
        this.SoHopDong = SoHopDong;
    }

    public long getSoHopDong(){
        return SoHopDong;
    }
    
    public void setSoHopDong(long SoHopDong){
        this.SoHopDong = SoHopDong;
    }
    
    public long salary(){
       long salary = this.SoHopDong*200000;
       return salary;
    }
}
