package X;

/* renamed from: X.7C1  reason: invalid class name */
public class AnonymousClass7C1 implements C1604788q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7C1(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BJB(boolean z) {
        AnonymousClass1KB r4;
        Runnable r3;
        if (this.A00 != 0) {
            Object obj = this.A02;
            r4 = ((AnonymousClass6pB) this.A01).A00;
            r3 = new C146787Qp(obj, 35);
        } else {
            C191869nK r2 = (C191869nK) this.A01;
            Object obj2 = this.A02;
            r4 = r2.A04;
            r3 = new AnonymousClass7RF(obj2, r2, 13, z);
        }
        r4.CGP(r3);
    }

    public /* synthetic */ void BJC(Exception exc, boolean z) {
        throw AnonymousClass04E.createAndThrow();
    }
}
