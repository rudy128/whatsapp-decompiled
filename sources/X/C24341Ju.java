package X;

/* renamed from: X.1Ju  reason: invalid class name and case insensitive filesystem */
public final class C24341Ju implements AnonymousClass00S {
    public final int A00;
    public final C24331Jt A01;
    public final AnonymousClass10E A02;

    public C24341Ju(C24331Jt r1, AnonymousClass10E r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public Object get() {
        int i = this.A00;
        if (i == 0) {
            return A00();
        }
        if (i == 1) {
            return new C199419zy(C000200d.A00(this.A02.AGz));
        }
        AnonymousClass10E r1 = this.A02;
        C18000vb r4 = (C18000vb) r1.ABz.get();
        return new C130076iq(C000500i.A00(r1.Ao9), (AnonymousClass11P) r1.AAv.get(), r4, (C1193367s) r1.Afz.get(), C000200d.A00(r1.A04), C27011Uj.A00());
    }

    public static AnonymousClass047 A00() {
        return new AnonymousClass047();
    }
}
