package X;

public class DB5 implements E4J {
    public Object A00;
    public boolean A01 = false;
    public final E4J A02;

    public Object get() {
        if (!this.A01) {
            this.A00 = this.A02.get();
            this.A01 = true;
        }
        return this.A00;
    }

    public DB5(E4J e4j) {
        this.A02 = e4j;
    }
}
