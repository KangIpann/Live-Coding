public class Anak extends SuperClass{

    @Override
    public int panjang(int panjang){
        return panjang;
    }

    @Override
    public int lebar(int lebar){
        return lebar;
    }

    public void nama () {
        String nama = "Ivan";
        System.out.println("Nama saya " + nama);
    }
    public void nama (String umur){
        String nama = "Ivan";
        System.out.println("Nama saya " + nama + "Umur saya " + umur);
    }

    public static void main(String[] args) {
//        Deklarasi Object
        SuperClass anu = new SuperClass();
        Anak anu2 = new Anak();

//         Overriding
        System.out.println(anu2.panjang(90));
        System.out.println(anu2.lebar(10));

//        Overloading
        anu2.nama();
        anu2.nama("16");
    }
}
