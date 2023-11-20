public class klass3 {
String hej;
int ålder;

    public klass3(String hej, int ålder) {
        this.hej = hej;
        this.ålder = ålder;
    }

    public String getHej() {
        return hej;
    }

    public void setHej(String hej) {
        this.hej = hej;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public static void main(String[] args) {
        klass3 k = new klass3("Hej", 27);
        System.out.println(k.getÅlder());

        TestKlass2 t = new TestKlass2("Malin", 26);
        System.out.println(t.getNamn());
    }
}
