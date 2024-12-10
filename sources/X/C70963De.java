package X;

/* renamed from: X.3De  reason: invalid class name and case insensitive filesystem */
public class C70963De implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C70963De(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A04 = obj;
    }

    public final Object get() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C219217x r1 = (C219217x) this.A03;
            return new C54212dm((AnonymousClass190) this.A04, (AnonymousClass1L7) obj, r1, (AnonymousClass11Z) this.A02);
        }
        AnonymousClass18O r2 = (AnonymousClass18O) ((AnonymousClass00H) this.A02).get();
        C18000vb r12 = (C18000vb) ((AnonymousClass00H) this.A03).get();
        return new AnonymousClass1QI(r2, C17880vN.A0K((AnonymousClass00H) this.A04), r12, (C18030ve) ((AnonymousClass00H) obj).get());
    }
}
