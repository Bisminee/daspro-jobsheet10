import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String penonton[][] = new String[4][2];
        int baris, kolom, pilihan;
        String nama, next;

        while(true){

            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        penonton[i][j] = "***";
                    }
                }
            }

            System.out.println("SELAMAT DATANG DI BIOSKOP KOPKOP");
            System.out.println("1. Pesan Tempat Duduk");
            System.out.println("2. Daftar Penonton");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan dengan angka: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                
                case 0:
                break;
                case 1:
                    while(true){
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if(penonton[(baris-1)][(kolom-1)] != "***"){
                            System.out.println("\nKURSI SUDAH TERISI!");
                            System.out.println("MOHON LIHAT DAFTAR PENONTON UNTUK MENGETAHUI KURSI KOSONG!\n");
                            break;
                        }

                        if(baris > penonton.length || kolom > penonton[0].length || baris <= 0 || kolom <= 0){
                            System.out.println("\nMASUKKAN KURSI YANG TERSEDIA!");
                            System.out.println("MOHON LIHAT DAFTAR PENONTON UNTUK MENGETAHUI KURSI KOSONG!\n");
                            break;
                        }

                        penonton[(baris - 1)][(kolom - 1)] = nama;


                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if(next.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                break;
                case 2:
                    System.out.println();
                    System.out.println("Daftar Penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                    }
                    System.out.println();
                break;
                default:
                    System.out.println("MASUKKAN PILIHAN YANG TERSEDIA SAJA!!!");
            }

            if(pilihan == 0){
                break;
            }
            
            
        }
        System.out.println("TERIMA KASIH");
    }
}
