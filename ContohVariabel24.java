public class ContohVariabel24 {
    public static void main (String [] args) {
        String salahSatuHobySayaAdalah = "Mendengarkan Musik";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 17;
        double ipkSaya = 4.00, tinggiBadan= 1.62;

        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipkSaya, tinggiBadan));
    }
}
