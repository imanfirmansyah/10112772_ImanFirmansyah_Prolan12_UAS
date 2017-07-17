import java.util.Scanner;

class Data{
     Scanner scan = new Scanner(System.in);
        int pil,jumlah,harga,hargaMkn,hargaMnm,hargam,ttl;
        String nama, alamat;

public void dataPelanggan(){
     System.out.print("Masukkan nama: ");
     nama=scan.nextLine();
     System.out.print("Masukkan alamat: ");
     alamat=scan.nextLine();
}
public void dataMakanan(){
        
System.out.println("+=========================================+");
System.out.println("|             *Warung Mandiri*            |");
System.out.println("+=========================================+");
System.out.println("\n\n Daftar Menu :                         ");
System.out.println("+------------------------+----------------+");
System.out.println("|        Makanan         |      Harga     |");
System.out.println("+------------------------+----------------+");
System.out.println("+ 1. Soto                +  Rp 8000       +");
System.out.println("+ 2. Rawon               +  Rp 7000       |");
System.out.println("+ 3. Pecel               +  Rp 5000       +");
System.out.println("+=========================================+");
System.out.print("Makanan yang anda pesan : ");

pil = scan.nextInt();
System.out.print("Makanan yang anda pesan: ");
hargam=0;
switch(pil) { 
    case 1: harga=8000;
    System.out.println("Soto  ");
    System.out.println("Jumlah Pesanan : ");
    jumlah= scan.nextInt();
    hargaMkn=harga*jumlah;//pemberian Harga
    System.out.println("\n---------------------------------------------------");
                break;
case 2: harga=7000;
    System.out.println("Rawon ");
    System.out.println("Jumlah Pesanan : ");
    jumlah=scan.nextInt();
     hargaMkn=harga*jumlah;//pemberian Harga
     System.out.println("\n---------------------------------------------------");
            break;
    case 3: harga=5000;
    System.out.println("Pecel ");
    System.out.println("Jumlah Pesanan : ");
    jumlah=scan.nextInt();
    hargaMkn=harga*jumlah;
     System.out.println("\n---------------------------------------------------");
     
     break ;
    default:
    System.out.println("Makanan yang anda pesan tidak ada");
}
    }
public void dataMinum(){
System.out.println("+==============================================+");
System.out.println("|          *Pilih Minum Wr Mandiri*            |");
System.out.println("+==============================================+");
System.out.println("\n\n Menu Minuman : ");
System.out.println("+------------------------------+---------------+");
System.out.println("+           Minuman            +     Harga     +");
System.out.println("+------------------------------+---------------+");
System.out.println("+ 1. Es Teh                    + Rp 3000       +");
System.out.println("+ 2. Es Buah                   + Rp 5000       +");
System.out.println("+ 3. Air Mineral               + Rp 2000       +");
System.out.println("+==============================+===============+");
System.out.println("Minuman yang anda pesan : ");
pil=scan.nextInt();
System.out.println("Minuman yang anda pesan: ");

switch(pil)
 { case 1: hargam=3000;
    System.out.println("Es Teh  ");
    System.out.print("Jumlah Pesanan : ");
    jumlah= scan.nextInt();
     hargaMnm=hargam*jumlah;
     System.out.println("\n---------------------------------------------------");
 case 4:;           
     break;
case 2: hargam=5000;
    System.out.println("Es Buah ");
    System.out.print("Jumlah Pesanan : ");
    jumlah=scan.nextInt();
     hargaMnm=hargam*jumlah;//pemberian Harga
     System.out.println("\n---------------------------------------------------");
            break;
    case 3: hargam=2000;
    System.out.println("Air Putih ");
    System.out.println("Jumlah Pesanan : ");
    jumlah=scan.nextInt();
    hargaMnm=hargam*jumlah;//pemberian Harga
     System.out.println("\n---------------------------------------------------");

     break;
    default:
    System.out.println("Minuman yang anda pesan tidak ada ");

    }
}

public void hitungHarga(){
    ttl=hargaMkn+hargaMnm;
    System.out.println("Di pesan Oleh:");
    System.out.println("Nama   : " + nama);
    System.out.println("Alamat : " +alamat);
    System.out.println("Total Harganya adalah = "+ttl);
	}
}

public class WarungMandiri {
    public static void main(String[] args) {
        Data data = new Data();
        data.dataPelanggan();
        data.dataMakanan();
        data.dataMinum();
        data.hitungHarga();
       

    }
}
