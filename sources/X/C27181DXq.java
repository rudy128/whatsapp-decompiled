package X;

/* renamed from: X.DXq  reason: case insensitive filesystem */
public final class C27181DXq implements C23421Fz {
    public final C22821Di A00;
    public final AnonymousClass1OS A01;
    public final C23421Fz A02;

    public C27181DXq(C22821Di r1, AnonymousClass1OS r2, C23421Fz r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public Object BFC(C30391dr r5, AnonymousClass1G2 r6) {
        C98494rF A002 = C98494rF.A00();
        A002.element = AnonymousClass4IV.A01;
        Object BFC = this.A02.BFC(r5, new C27186DXw(this, r6, A002, 0));
        if (BFC != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return BFC;
    }
}
