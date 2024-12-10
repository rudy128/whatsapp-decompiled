package X;

/* renamed from: X.35A  reason: invalid class name */
public class AnonymousClass35A implements B8R {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass35A(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void CFT(String str) {
        if (this.A00 != 0) {
            C62312rC r1 = (C62312rC) this.A02;
            synchronized (r1) {
                C41681wt.A00(r1.A04).remove(str);
            }
            B8R b8r = (B8R) this.A01;
            if (b8r != null) {
                b8r.CFT(str);
                return;
            }
            return;
        }
        ((C57562jH) ((C55822gQ) this.A02).A04.get()).A00((AnonymousClass206) this.A01);
    }
}
