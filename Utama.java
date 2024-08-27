/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpertama1;

/**
 *
 * @author win 10
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Hewan gukguk = new Hewan();
        System.out.println("Nama saya gukguk");
        gukguk.bernafas();
        gukguk.tumbuh();
        gukguk.berkembangbiak();
        gukguk.makan();
        gukguk.setJumlahKaki(4);
        gukguk.setBergerak("berjalan");
        gukguk.setHabitat("daratan");
        System.out.println("Jumlah kaki saya ada " + gukguk.getJumlahKaki());
        System.out.println("Saya bergerak dengan cara " + gukguk.getBergerak());
        System.out.println("Saya bertempat tinggal di " + gukguk.getHabitat());
        System.out.println();
        
        Tumbuhan pencit = new Tumbuhan();
        System.out.println("Nama saya pencit");
        pencit.bernafas();
        pencit.tumbuh();
        pencit.berkembangbiak();
        pencit.makan();
        pencit.setWarnaDaun("hijau");
        pencit.setArahDaun("timur");
        pencit.setLingkunganHidup("dataran rendah");
        pencit.setBiji(2);
        System.out.println("Arah daun pagi hari " + pencit.getArahDaun());
        System.out.println("Warna daun " + pencit.getWarnaDaun());
        System.out.println("Saya tumbuh di daerah " + pencit.getLingkunganHidup());
        System.out.println("Saya memilki " + pencit.getBiji() + (" keping biji"));
        System.out.println("");
        
        Pisces lele = new Pisces();
        System.out.println("Nama saya lele");
        lele.bernafas();
        lele.tumbuh();
        lele.berkembangbiak();
        lele.makan();
        lele.setBergerak("berenang menggunakan sirip");
        lele.setJumlahKaki(0);
        lele.setHabitat("air tawar");
        lele.setBentukSirip("membulat");
        lele.setBentukInsang("sIsir");
        System.out.println("Saya bergerak dengan cara " + lele.getBergerak());
        System.out.println("Saya memiliki kaki berjumlah " + lele.getJumlahKaki());
        System.out.println("Saya hidup di " + lele.getHabitat());
        System.out.println("Saya memiliki sirip berbentuk " + lele.getBentukSirip());
        System.out.println("Saya memilki insang berbentuk " + lele.getBentukInsang());
        System.out.println();
        
        Aves ayam = new Aves();
        System.out.println("Nama saya ayam");
        ayam.bernafas();
        ayam.tumbuh();
        ayam.berkembangbiak();
        ayam.makan();
        ayam.setBergerak("berjalan menggunakan kaki");
        ayam.setHabitat("daratan");
        ayam.setJumlahKaki(2);
        ayam.setBentukParuh("kecil, lancip dan tajam");
        ayam.setBentukKaki("pejalan kaki");
        ayam.setBentukSayap("pendek dan bulat");
        System.out.println("Saya bergerak dengan cara " + ayam.getBergerak());
        System.out.println("Saya hidup di " + ayam.getHabitat());
        System.out.println("Saya memilki kaki berjumlah " + ayam.getJumlahKaki());
        System.out.println("Saya memiliki bentuk paruh yang " + ayam.getBentukParuh());
        System.out.println("Saya memiliki kaki berbentuk " + ayam.getBentukKaki());
        System.out.println("Saya memiliki sayap berbentuk " + ayam.getBentukSayap());
        System.out.println("");
        
        Reptil kadal = new Reptil();
        System.out.println("Nama saya kadal");
        kadal.bernafas();
        kadal.tumbuh();
        kadal.berkembangbiak();
        kadal.makan();
        kadal.setBergerak("berjalan menggunakan kaki");
        kadal.setHabitat("daerah kering hingga berair");
        kadal.setJumlahKaki(4);
        kadal.setBentukSisik("tumpang tindih");
        kadal.setBentukKepala("kecil dan pipih");
        System.out.println("Saya bergerak dengan cara " + kadal.getBergerak());
        System.out.println("Saya hidup di " + kadal.getHabitat());
        System.out.println("Saya memilki kaki berjumlah " + kadal.getJumlahKaki());
        System.out.println("Saya memiliki sisik berbentuk " + kadal.getBentukSisik());
        System.out.println("Saya memiliki kepala berbentuk " + kadal.getBentukKepala());
        System.out.println("");
        
        Amfibi katak = new Amfibi();
        System.out.println("Nama saya katak");
        katak.bernafas();
        katak.tumbuh();
        katak.berkembangbiak();
        katak.makan();
        katak.setBergerak("melompat menggunakan kaki");
        katak.setHabitat("daratan dan perairan");
        katak.setJumlahKaki(4);
        katak.setTeksturKulit("halus");
        katak.setOrganPernafasan("paru-paru dan kulit");
        System.out.println("Saya bergerak dengan cara " + katak.getBergerak());
        System.out.println("Saya hidup di " + katak.getHabitat());
        System.out.println("Saya memiliki kaki berjumlah " + katak.getJumlahKaki());
        System.out.println("Saya memiliki kulit bertekstur " + katak.getTeksturKulit());
        System.out.println("Saya bernapas dengan " + katak.getOrganPernafasan());
        System.out.println("");
        
        Mamalia sapi = new Mamalia();
        System.out.println("Nama saya sapi");
        sapi.bernafas();
        sapi.tumbuh();
        sapi.berkembangbiak();
        sapi.makan();
        sapi.setBergerak("berjalan menggunakan kaki");
        sapi.setHabitat("daratan");
        sapi.setJumlahKaki(4);
        sapi.setCaraBerkembangbiak("melahirkan");
        sapi.setJenisMakanan("pemakan rumput");
        System.out.println("Saya bergerak dengan cara " + sapi.getBergerak());
        System.out.println("Saya hidup di " + sapi.getHabitat());
        System.out.println("Saya memiliki kaki berjumlah " + sapi.getJumlahKaki());
        System.out.println("Saya berkembang biak dengan cara " + sapi.getCaraBerkembangbiak());
        System.out.println("Saya adalah hewan " + sapi.getJenisMakanan());
        System.out.println("");
        
        Dikotil mangga = new Dikotil();
        System.out.println("Nama saya mangga");
        mangga.bernafas();
        mangga.tumbuh();
        mangga.berkembangbiak();
        mangga.makan();
        mangga.setArahDaun("barat");
        mangga.setWarnaDaun("hijau");
        mangga.setLingkunganHidup("dataran rendah");
        mangga.setBiji(2);
        mangga.setBentukAkar("akar tunggang");
        mangga.setBentukBunga("piramida");
        System.out.println("Arah daun pada pagi hari mengarah ke " + mangga.getArahDaun());
        System.out.println("Saya memiliki daun berwarna " + mangga.getWarnaDaun());
        System.out.println("Saya hidup di " + mangga.getLingkunganHidup());
        System.out.println("Saya memiliki " + mangga.getBiji() + " keping biji");
        System.out.println("Saya memilki akar yang berbentuk " + mangga.getBentukAkar());
        System.out.println("Saya memilki bunga yang berbentuk " + mangga.getBentukBunga());
        System.out.println("");
        
        Monokotil jagung = new Monokotil();
        System.out.println("Nama saya jagung");
        jagung.bernafas();
        jagung.tumbuh();
        jagung.berkembangbiak();
        jagung.makan();
        jagung.setArahDaun("barat");
        jagung.setWarnaDaun("hijau");
        jagung.setLingkunganHidup("tanah gembur");
        jagung.setBiji(1);
        jagung.setBentukBatang("silinder dan tidak bercabang");
        jagung.setBentukDaun("pita memanjang");
        System.out.println("Arah daun pada sore hari mengarah ke " + jagung.getArahDaun());
        System.out.println("Saya memiliki daun berwarna " + jagung.getWarnaDaun());
        System.out.println("Saya hidup di " + jagung.getLingkunganHidup());
        System.out.println("Saya memiliki " + jagung.getBiji() + " keping biji");
        System.out.println("Saya memiliki batang yang berbentuk " + jagung.getBentukBatang());
        System.out.println("Saya memiliki daun yang berbentuk " + jagung.getBentukDaun());
        System.out.println("");
    }
}