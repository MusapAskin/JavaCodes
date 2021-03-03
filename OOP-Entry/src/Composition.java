import com.sun.source.tree.CaseTree;

public class Composition {
    public static class Mainboard{
        private String model;
        private String manufacturer;
        private int slots;
        private String os;

        public Mainboard(String model, String manufacturer, int slots, String os) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.slots = slots;
            this.os = os;
        }
        public void install_os(String os){
            this.os=os;
            System.out.println(os+" işletim sistemi yüklendi.");
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public int getSlots() {
            return slots;
        }

        public void setSlots(int slots) {
            this.slots = slots;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }
    }

    public static class Case{
        private String model;
        private String manufacturer;
        private String material;

        public Case(String model, String manufacturer, String material) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.material = material;
        }

        public void open_computer(){
            System.out.println("Tardis Açılıyor...");
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }

    public static class Resolution{
        private int size;
        private int width;

        public Resolution(int size, int width) {
            this.size = size;
            this.width = width;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }

    public static class Monitor{
        private String model;
        private String manufacturer;
        private String size;
        private Resolution resolution;

        public Monitor(String model, String manufacturer, String size, Resolution resolution) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.size = size;
            this.resolution = resolution;
        }

        public void close_monitor(){
            System.out.println("Monitör kapatılıyor...");
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Resolution getResolution() {
            return resolution;
        }

        public void setResolution(Resolution resolution) {
            this.resolution = resolution;
        }
    }

    public static class Computer{
        private Monitor monitor;
        private Case safe;
        private Mainboard mainboard;

        public Computer(Monitor monitor, Case safe, Mainboard mainboard) {
            this.monitor = monitor;
            this.safe = safe;
            this.mainboard = mainboard;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        public void setMonitor(Monitor monitor) {
            this.monitor = monitor;
        }

        public Case getSafe() {
            return safe;
        }

        public void setSafe(Case safe) {
            this.safe = safe;
        }

        public Mainboard getMainboard() {
            return mainboard;
        }

        public void setMainboard(Mainboard mainboard) {
            this.mainboard = mainboard;
        }
    }

    public static class Test{
        public static void main(String[] args) {
            Resolution resolution=new Resolution(1920,1080);
            Monitor monitor=new Monitor("Optix MAG241C","MSİ","24.0",resolution);
            Case safe=new Case("H50/50","LENOVA","Metal & Plastik");
            Mainboard mainboard=new Mainboard("SHARKBAY","LENOVA",2,"WİNDOWS 10 PRO");
            Computer pc=new Computer(monitor,safe,mainboard);

            pc.getSafe().open_computer();
            pc.getMainboard().install_os("Ubuntu");
            pc.getMonitor().close_monitor();

        }
    }
}
