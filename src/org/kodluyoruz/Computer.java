package org.kodluyoruz;

/**
 * Bu sınıf bir bilgisayarı temsil eder.
 * Bilgisayarın beş adet donamımı vardır:
 *      - Anakart
 *      - CPU
 *      - RAM
 *      - SSD
 *      - Ekran kartı
 *
 * TODO Bu alanların getter ve setter metotlarını oluşturun.
 */
public class Computer
{


    /**
     * anakart
     */
    private Hardware motherboard;

    /**
     * işlemci
     */
    private Hardware cpu;

    /**
     * RAM
     */
    private Hardware ram;

    /**
     * SSD
     * İsteğe bağlı: Her bilgisayarda SSD olmayabilir
     */
    private Hardware ssd;

    /**
     * ekran kartı
     * İsteğe bağlı: Her bilgisayarda ekran kartı olmayabilir
     */
    private Hardware gpu;

    public Computer(Hardware motherboard, Hardware cpu, Hardware ram, Hardware ssd, Hardware gpu) {
        this(null,null,null);
        this.ssd = ssd;
        this.gpu = gpu;
    }

    public Computer(Hardware motherboard, Hardware cpu, Hardware ram, Hardware ssd,null) {
        this(null,null,null,ssd,null);
        this.ssd = ssd;
    }

    public Computer(Hardware motherboard, Hardware cpu, Hardware ram,null,Hardware gpu) {
        this(null,null,null);
        this.gpu = gpu;
    }

    public Computer(Hardware motherboard, Hardware cpu, Hardware ram) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
    }

    public double getTotalPrice()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplam fiyatını hesaplar.
        // TODO metodu doldurun


        return 0.0;
    }

    public int getTotalPower()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplamda ne kadar güç tüketeceğini hesaplar.
        // TODO metodu doldurun
        return 0;
    }

    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }
}
