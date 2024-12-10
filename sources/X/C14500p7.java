package X;

/* renamed from: X.0p7  reason: invalid class name and case insensitive filesystem */
public final class C14500p7 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ AnonymousClass0W2 $holder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14500p7(AnonymousClass0W2 r2, C36001nB r3) {
        super(2);
        this.$holder = r2;
        this.$content = r3;
    }

    public final void A01(C17130tn r4, int i) {
        if ((i & 11) != 2 || !r4.BZO()) {
            AnonymousClass0W2 r0 = this.$holder;
            r0.A00.setValue(A00(r4));
            this.$content.invoke(this.$holder, r4, 8);
            return;
        }
        r4.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A01((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }

    public static final C05850Vy A00(C17130tn r4) {
        r4.COB(15454635);
        C05850Vy r1 = (C05850Vy) AnonymousClass0EU.A00(r4, C05850Vy.A03, C08960fw.A00, new Object[0], 4);
        r1.A00 = (AnonymousClass0tC) r4.BFh(C04100Lv.A00);
        AnonymousClass0VR.A0T(r4);
        return r1;
    }
}
