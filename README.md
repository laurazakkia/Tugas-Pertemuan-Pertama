# **INHERITANCE**
## Pengertian Inheritance
Inheritance (pewarisan) adalah konsep dalam pemrograman berorientasi objek (OOP) di mana sebuah kelas baru mewarisi sifat dan perilaku dari kelas yang sudah ada. Kelas yang diturunkan disebut kelas induk (parent class), sedangkan kelas yang menerima penurunan disebut kelas anak (child class). Inheritance memungkinkan kelas anak untuk mengakses atribut dan metode dari kelas induk.

## Extends
Menggunakan kata kunci extends dalam definisi kelas menunjukkan bahwa kelas tersebut merupakan turunan dari kelas lain. Kelas anak dapat mengakses metode dan atribut publik serta protected dari kelas induk. Untuk menurunkan kelas di Java, tulis nama kelas anak, diikuti dengan extends, dan kemudian nama kelas induk.

## Source Code Penggunaan Inheritance dan Extends
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
  //INI ADALAH KELAS ANAK
  public class Tumbuhan extends MakhlukHidup {
    private String WarnaDaun;
    private String ArahDaun;
    private String LingkunganHidup;
    private int biji;
    }
</pre>
- MakhlukHidup adalah kelas induk yang berfungsi sebagai dasar untuk kelas-kelas lainnya. Kelas ini memiliki satu metode, yaitu bernafas(), yang mencetak pesan "Saya bernafas ..." ketika dipanggil. Ini menunjukkan bahwa semua makhluk hidup memiliki kemampuan untuk bernapas.
- Hewan adalah kelas anak yang mewarisi sifat dari kelas MakhlukHidup. Dengan kata kunci extends, kelas Hewan dapat menggunakan metode yang ada di kelas MakhlukHidup, termasuk bernafas(). Kelas hewan memiliki tiga atribut yaitu jumlahKaki, Bergerak, Habitat.
- Tumbuhan adalah kelas anak yang mewarisi sifat dari kelas MakhlukHidup. Dengan kata kunci extends, kelas Tumbuhan dapat menggunakan metode yang ada di kelas MakhlukHidup, termasuk bernafas(). Kelas hewan memiliki empat atribut yaitu WarnaDaun, ArahDaun, LingkunganHidup, Biji.

# **SETTER DAN GETTER**
- Setter -> Metode yang digunakan untuk mengatur nilai dari atribut privat.
- Getter -> Metode yang digunakan untuk mengambil nilai dari atribut privat.

## Source Code Setter dan Getter
<pre>
  public class Hewan extends MakhlukHidup {
    private int JumlahKaki;
    private String Bergerak;
    private String Habitat; 
  
    public int getJumlahKaki() {
        return JumlahKaki;
    }

    public void setJumlahKaki(int JumlahKaki) {
        this.JumlahKaki = JumlahKaki;
    }

    public String getBergerak() {
        return Bergerak;
    }

    public void setBergerak(String Bergerak) {
        this.Bergerak = Bergerak;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }
}
</pre>
- Metode getter untuk jumlahKaki digunakan untuk mengambil nilai dari atribut jumlahKaki. Metode setter untuk jumlahKaki digunakan untuk mengatur nilai dari atribut jumlahKaki.
- Metode getter untuk Bergerak digunakan untuk mengambil nilai dari atribut Bergerak. Metode setter untuk Bergerak digunakan untuk mengatur nilai dari atribut Bergerak.
- Metode getter untuk habitat digunakan untuk mengambil nilai dari atribut habitat. Metode setter untuk habitat digunakan untuk mengatur nilai dari atribut habitat.

