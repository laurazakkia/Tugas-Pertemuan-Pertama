# Konsep Pemrograman Berorientasi Objek - Pertemuan Pertama

---

## 📑 Daftar Isi
- [📚 Inheritance](#inheritance)
- [🛠 Set](#SetandGet)

---

## **Inheritance**
Inheritance adalah sebuah kelas baru yang mewarisi perilaku dari kelas yang sudah ada. Kelas yang diturunkan disebut kelas induk, sedangkan kelas yang menerima penurunan disebut kelas anak. Dengan menerapkan inheritance, kelas anak dapat mengakses atribut dan metode dari kelas induk. Extends adalah keyword yang digunakan dalam penerapan konsep Inheritance. 

### Source Code Penerapan Inheritance dan Extends
<pre>
  //INI ADALAH KELAS INDUK
  public class MakhlukHidup {
        public void bernafas(){
        System.out.println("Saya Bernafas...");
    }
  //INI ADALAH KELAS ANAK 
  public class Hewan extends MakhlukHidup {
    private int JumlahKaki;
    private String Bergerak;
    private String Habitat; 
    }
</pre>

- MakhlukHidup merupakan kelas induk. Kelas ini memiliki satu metode, yaitu bernafas(). 
- Hewan adalah kelas anak yang mewarisi sifat dari kelas MakhlukHidup. Dengan keyword extends, kelas Hewan dapat menggunakan metode yang ada di kelas MakhlukHidup, termasuk bernafas(). Kelas hewan memiliki tiga atribut yaitu jumlahKaki, Bergerak, Habitat.

---

## **Set and Get**
- Setter : Metode yang digunakan untuk mengatur nilai dari atribut.
- Getter : Metode yang digunakan untuk mengambil nilai dari atribut.

### Source Code Penerapan Setter dan Getter
<pre>
  public class Hewan extends MakhlukHidup {
    private int JumlahKaki;
  
    public int getJumlahKaki() {
        return JumlahKaki;
    }

    public void setJumlahKaki(int JumlahKaki) {
        this.JumlahKaki = JumlahKaki;
    }
}
</pre>
- Metode getjumlahKaki : mengambil nilai dari atribut jumlahKaki.
- Metode setjumlahKaki : mengatur nilai dari atribut jumlahKaki.

