package X;

/* renamed from: X.4px  reason: invalid class name and case insensitive filesystem */
public class C97734px implements AnonymousClass3LG {
    public final int A00;
    public final Object A01;

    public C97734px(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C4Q(C59822mw r3) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C91454fi r0 = (C91454fi) obj;
            if (r3 != null) {
                r0.A02 = r3;
                C91454fi.A00(r0);
                return;
            }
            return;
        }
        C77843ra r02 = (C77843ra) obj;
        if (r3 != null) {
            r02.A00 = r3;
            r02.A01.invalidateOptionsMenu();
        }
    }
}
