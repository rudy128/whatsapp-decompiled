package X;

/* renamed from: X.0Lt  reason: invalid class name and case insensitive filesystem */
public abstract class C04080Lt {
    public static final Object A00 = new Object();

    public static final void A00(AnonymousClass0OL r2, Object obj, Object obj2) {
        int A002 = AnonymousClass0OL.A00(r2, obj);
        if (A002 >= 0) {
            C06990aB r0 = (C06990aB) r2.A02[A002];
            if (r0 != null) {
                r0.add(obj2);
                return;
            }
            return;
        }
        C06990aB r02 = new C06990aB();
        r02.add(obj2);
        r2.A02(obj, r02);
    }
}
