package X;

/* renamed from: X.0n8  reason: invalid class name and case insensitive filesystem */
public final class C13270n8 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass1OS $bottomBar;
    public final /* synthetic */ AnonymousClass0HP $fabPlacement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13270n8(AnonymousClass0HP r2, AnonymousClass1OS r3, int i) {
        super(2);
        this.$fabPlacement = r2;
        this.$bottomBar = r3;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r4, int i) {
        if ((i & 11) != 2 || !r4.BZO()) {
            AnonymousClass0PZ.A04(r4, this.$bottomBar, new C03230Hd[]{AnonymousClass0P9.A00.A03(this.$fabPlacement)}, ((this.$$dirty >> 15) & 112) | 8);
            return;
        }
        r4.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
