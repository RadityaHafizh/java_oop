public class utama {
    public static void main(String[] args) {
        
        template class_temp = new template();

        // cara merubah nilai menggunakan method setter
        class_temp.setNama("Kunti");

        // cara melihat nilai(value) nama pada CLass "template" dengan mennggunakan method getter
        System.out.println(class_temp.getNama());

        // cara memanggil method pada class "template"
        class_temp.mulaiTertawa();

        // menggunakan construct pada class Construct
        construct class_const = new construct("Valen");
        System.out.println(class_const.nama);


        // mengakses modifier pada variable dan method
        modifier class_mod = new modifier();
        System.out.println(class_mod.nama);
        System.out.println(class_mod.getUmur());
        System.out.println(class_mod.hobby);
        System.out.println(class_mod.tinggi_badan);
    }
}