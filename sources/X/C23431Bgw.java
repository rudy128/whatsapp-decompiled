package X;

/* renamed from: X.Bgw  reason: case insensitive filesystem */
public final class C23431Bgw extends C23433Bgy {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C23433Bgy zzc;

    public final int size() {
        return this.A01;
    }

    public C23431Bgw(C23433Bgy bgy, int i, int i2) {
        this.zzc = bgy;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        C25875Cnj.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }
}
