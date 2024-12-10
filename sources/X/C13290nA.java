package X;

/* renamed from: X.0nA  reason: invalid class name and case insensitive filesystem */
public final class C13290nA extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ long $contentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13290nA(AnonymousClass1OS r2, int i, long j) {
        super(2);
        this.$contentColor = j;
        this.$content = r2;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r5, int i) {
        if ((i & 11) != 2 || !r5.BZO()) {
            C03230Hd[] r3 = new C03230Hd[1];
            AnonymousClass0OI.A01(AnonymousClass0G4.A00, r3, this.$contentColor);
            AnonymousClass0PZ.A04(r5, this.$content, r3, ((this.$$dirty >> 3) & 112) | 8);
            return;
        }
        r5.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
