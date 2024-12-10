package X;

/* renamed from: X.2LU  reason: invalid class name */
public final class AnonymousClass2LU extends AnonymousClass11L implements AnonymousClass1GC {
    public final AnonymousClass1F9 A00;
    public final C27581Wq A01;
    public final C22821Di A02;

    public AnonymousClass2LU(C27581Wq r1, AnonymousClass1F9 r2, Object obj, C22821Di r4) {
        super(obj);
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = r4;
    }

    public void C6U(C27581Wq r4, AnonymousClass1F9 r5) {
        C18070vi.A0h(r5, r4);
        AnonymousClass1F9 r2 = this.A00;
        if (r5 != r2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LifecycleBoundObserver/ownerMismatch/");
            C17900vP.A0a(r2, A10);
            A10.append('/');
            C17890vO.A19(A10, r5.getClass().getSimpleName());
        }
        if (r4 != C27581Wq.ON_ANY && r4.compareTo(this.A01) >= 0) {
            this.A02.invoke(this.A00);
        }
    }
}
