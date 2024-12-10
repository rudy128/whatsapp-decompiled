package X;

/* renamed from: X.BfU  reason: case insensitive filesystem */
public final class C23342BfU extends C23345BfX {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C23345BfX zzc;

    public final int size() {
        return this.A01;
    }

    public C23342BfU(C23345BfX bfX, int i, int i2) {
        this.zzc = bfX;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        C25874Cni.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }
}
