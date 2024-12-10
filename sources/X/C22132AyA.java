package X;

/* renamed from: X.AyA  reason: case insensitive filesystem */
public final class C22132AyA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass8F5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22132AyA(AnonymousClass8F5 r2) {
        super(1);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.AN6] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass8F5 r1 = this.this$0;
        r1.A06.A00 = (C194359rb) obj;
        boolean A09 = r1.A08.A09();
        AnonymousClass8F5 r2 = this.this$0;
        if (A09) {
            C21424Ajr.A00(r2.A0A, r2, 48);
            AnonymousClass8F5 r12 = this.this$0;
            C192789oz r0 = r12.A05;
            r0.A04.remove(r12.A06);
            AnonymousClass1DT r22 = this.this$0.A03;
            ? obj2 = new Object();
            obj2.A00 = 4;
            r22.A0E(obj2);
            AnonymousClass8F5 r02 = this.this$0;
            r02.A05.A00(r02.A03, r02.A06);
            AnonymousClass8F5 r03 = this.this$0;
            r03.A05.A01(r03.A06);
        } else {
            C192789oz r04 = r2.A05;
            C20501ANm aNm = (C20501ANm) r04.A04.get(r2.A06);
            if (aNm != null && aNm.A00 < aNm.A06.size()) {
                AnonymousClass3MX.A1J(this.this$0.A01, 5);
            }
        }
        return C27621Wu.A00;
    }
}
