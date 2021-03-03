public class Airplane {
    String name;
    boolean ıs_the_gas_tank_full=false;
    boolean ıs_the_gas_tank_lid_open=false;

    Airplane(boolean fiil_the_tank,String name){
        ıs_the_gas_tank_lid_open=true;
        ıs_the_gas_tank_full=fiil_the_tank;
        this.name=name;
    }

    public void finalize(){
        if(ıs_the_gas_tank_lid_open){
            ıs_the_gas_tank_lid_open=false;
            System.out.println(name+" kapakları kapatıldı.");
        }
    }
}

class GasTank{
    public static void main(String[] args) {
        Airplane airplane=new Airplane(true,"F-16");
        new Airplane(true,"F14");
        System.gc();
        System.out.println("Uçakların deposu dolduruldu kapakları kapandı.");//F-16 nın kapağı hala açık çünkü oluşturulan nesne referans alıyor.Çöp toplayıcı referansı olan nesneyi bellekten silmez.
    }
}
