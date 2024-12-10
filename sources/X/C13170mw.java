package X;

/* renamed from: X.0mw  reason: invalid class name and case insensitive filesystem */
public final class C13170mw extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $it;
    public final /* synthetic */ long $leadingIconColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13170mw(AnonymousClass1OS r2, long j) {
        super(2);
        this.$leadingIconColor = j;
        this.$it = r2;
    }

    public final void A00(C17130tn r9, int i) {
        C17130tn r1 = r9;
        if ((i & 11) != 2 || !r9.BZO()) {
            AnonymousClass0PE.A02(r1, (C26251Cvq) null, this.$it, 0, 2, this.$leadingIconColor);
            return;
        }
        r9.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
