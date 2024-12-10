package X;

public class DWV implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final String A02;

    public DWV(String str, C22821Di r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = str;
    }

    public final Object invoke() {
        ((C22821Di) this.A01).invoke(this.A02);
        return C27621Wu.A00;
    }
}
