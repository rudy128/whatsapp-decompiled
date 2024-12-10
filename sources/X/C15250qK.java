package X;

/* renamed from: X.0qK  reason: invalid class name and case insensitive filesystem */
public final class C15250qK extends AnonymousClass11G implements AnonymousClass20G {
    public final /* synthetic */ C36001nB $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15250qK(C36001nB r2) {
        super(4);
        this.$content = r2;
    }

    public final void A00(C15680r1 r3, C17130tn r4, int i) {
        if ((i & 14) == 0) {
            i |= AnonymousClass001.A0Q(r4, r3);
        }
        if ((i & 651) != 130 || !r4.BZO()) {
            this.$content.invoke(r3, r4, AnonymousClass000.A0p(i));
        } else {
            r4.CNR();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        A00((C15680r1) obj, (C17130tn) obj3, AnonymousClass000.A0M(obj4));
        return C27621Wu.A00;
    }
}
