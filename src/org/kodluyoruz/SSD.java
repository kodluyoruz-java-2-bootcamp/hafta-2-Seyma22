package org.kodluyoruz;

import org.kodluyoruz.Hardware;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 *      - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 *
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware
{

    private int memory;

    public SSD(int memory){
        super("",0.0,0);
        this.memory=memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    public double fiyat(int memory){
        if(memory>750){
            price+=memory/250*275;
        }
        return price;
    }

}
