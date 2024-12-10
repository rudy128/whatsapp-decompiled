package X;

/* renamed from: X.4gn  reason: invalid class name and case insensitive filesystem */
public class C92124gn implements AnonymousClass5YY {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C92124gn(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BEy() {
        if (this.A00 != 0) {
            AnonymousClass3uP r4 = (AnonymousClass3uP) this.A01;
            Object obj = this.A02;
            r4.A1C.A00(1);
            if (C18020vd.A05(C18040vf.A02, r4.A0F, 7578)) {
                r4.A1X.CGF(new C146497Pi(r4, obj, 43));
                return;
            }
            return;
        }
        ((AnonymousClass1GV) this.A01).accept(((CQT) this.A02).A02);
    }
}
