package X;

/* renamed from: X.0nO  reason: invalid class name and case insensitive filesystem */
public final class C13430nO extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13430nO(AnonymousClass0tB r2, C36001nB r3, int i, long j) {
        super(2);
        this.$contentColor = j;
        this.$contentPadding = r2;
        this.$content = r3;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r6, int i) {
        if ((i & 11) != 2 || !r6.BZO()) {
            C03230Hd[] r4 = new C03230Hd[1];
            AnonymousClass0OI.A01(AnonymousClass0G4.A00, r4, this.$contentColor);
            AnonymousClass0PZ.A04(r6, AnonymousClass0LC.A00(r6, new C13260n7(this.$contentPadding, this.$content, this.$$dirty), 1582292974), r4, 56);
            return;
        }
        r6.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
