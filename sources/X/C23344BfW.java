package X;

/* renamed from: X.BfW  reason: case insensitive filesystem */
public final class C23344BfW extends C23345BfX {
    public static final C23345BfX A02 = new C23344BfW(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] A01;

    public final int size() {
        return this.A00;
    }

    public final Object get(int i) {
        C25874Cni.A01(i, this.A00);
        Object obj = this.A01[i];
        obj.getClass();
        return obj;
    }

    public C23344BfW(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
