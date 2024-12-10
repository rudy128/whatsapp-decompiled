package X;

/* renamed from: X.3JM  reason: invalid class name */
public final class AnonymousClass3JM extends AnonymousClass1ON {
    public final C31781g7 A00;

    public AnonymousClass3JM(C31781g7 r1) {
        this.A00 = r1;
    }

    public void Bdq(Throwable th) {
        Object A01;
        Object A0Z = A03().A0Z();
        boolean z = A0Z instanceof C30681eL;
        C31781g7 r1 = this.A00;
        if (z) {
            A01 = C30691eM.A00(((C30681eL) A0Z).A00);
        } else {
            A01 = AnonymousClass1OF.A01(A0Z);
        }
        r1.resumeWith(A01);
    }
}
