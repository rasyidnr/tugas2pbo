package tugas2pbo; 

 public class Dosen extends Elemen { 
     public int jamSibuk; 
     private int jumlahHariKerja; 

 public Dosen (String nama, int jumlahHariKerja){ 
     super(nama);

//downcasting dari class elemen ke class dosen
     this.jumlahHariKerja = jumlahHariKerja; 
 } 

 // berfungsi untuk mengambil jam sibuk, jam sibuk = hari kerja dikali 8
 public int getJamSibuk () { 
     return this.jumlahHariKerja * 8 ;   
 } 

 public void display(){ 
     System.out.println(getNama() + "adalah seorang dosen dengan jam sibuk" + getJamSibuk()); 
 } 
 }

package tugas2pbo; 

 public class Mahasiswa extends Elemen { 
     private int sks; 

     public Mahasiswa (String nama, int sks ) { 
         super(nama);

//downcasting turunan class elemen ke class mahasiswa 
         this.sks = sks; 
     } 

     public int getJamSibuk(){ 
         return sks * 3; 
     } 

     public void display () { 
         System.out.println(getNama() + "adalah seorang mahasiswa dengan jam sibuk" + getJamSibuk()); 
     } 
 }

package tugas2pbo;  

 public class Asdos extends Mahasiswa { 
     private int jamNgasdos;  

 public Asdos (String nama, int sks, int jamNgasdos) { 
     super(nama,sks);

// downcasting dari class mahasiswa ke class asdos
     this.jamNgasdos = jamNgasdos; 
 } 

 public int jamNgasdos(){ 
     return this.jamNgasdos; 
 } 

 public int getJamSibuk () { 
     return super.getJamSibuk() + jamNgasdos;   
 } 

 public void display(){ 
     System.out.println(getNama() + "adalah seorang asdos dengan jam sibuk" + getJamSibuk()); 
 } 
 }

package tugas2pbo; 

 public class hasil { 
    public static void main(String[] args) { 

     //upcasting 
     Elemen    s = new Asdos ("Fairuzikan", 23, 4); 
     Dosen     y = new Dosen ("Raja OP Danamik",5); 
     Elemen    a = new Asdos ("Angel-chan", 17, 13); 
     Mahasiswa d = new Mahasiswa ("Firman", 20); 
     Elemen    z = new Mahasiswa ("Nid to pass this sem", 23 ); 
     Elemen    i = new Dosen ("Nivotko", 3); 

     s.display(); 
     y.display(); 
     a.display(); 
     d.display(); 
     z.display(); 
     i.display(); 
      
 //untuk menampilkan total jam sibuk elemen fasilkom int total = s.getJamSibuk() + y.getJamSibuk() + a.getJamSibuk() + d.getJamSibuk() + z.getJamSibuk() + i.getJamSibuk() ; 
 System.out.println("Total jam sibuk elemen Fasilikom adalah"+ total); 
     } 
 ]
