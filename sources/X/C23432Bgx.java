package X;

/* renamed from: X.Bgx  reason: case insensitive filesystem */
public final class C23432Bgx extends C23433Bgy {
    public static final C23433Bgy A02 = new C23432Bgx(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] A01;

    public final int size() {
        return this.A00;
    }

    public final Object get(int i) {
        C25875Cnj.A01(i, this.A00);
        Object obj = this.A01[i];
        obj.getClass();
        return obj;
    }

    public C23432Bgx(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
