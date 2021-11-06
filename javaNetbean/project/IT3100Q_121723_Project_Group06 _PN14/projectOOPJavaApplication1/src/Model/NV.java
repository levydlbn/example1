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
public abstract class NV implements Serializable{
    private String name, SoCMT, DonVi, TGBatDau;

    public NV(String name, String SoCMT, String DonVi, String TGBatDau) {
        this.name = name;
        this.SoCMT = SoCMT;
        this.DonVi = DonVi;
        this.TGBatDau = TGBatDau;
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
    
    public abstract long salary();
    
}
