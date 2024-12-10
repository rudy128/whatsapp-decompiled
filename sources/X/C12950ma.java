package X;

/* renamed from: X.0ma  reason: invalid class name and case insensitive filesystem */
public final class C12950ma extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C16370s9 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12950ma(C17210uI r2, AnonymousClass0NY r3, C16370s9 r4, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = r2;
        this.$colors = r3;
        this.$shape = r4;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$$dirty2 = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn r6 = (C17130tn) obj;
        if ((AnonymousClass000.A0M(obj2) & 11) != 2 || !r6.BZO()) {
            AnonymousClass0PR r3 = AnonymousClass0PR.A00;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            C17210uI r4 = this.$interactionSource;
            AnonymousClass0NY r5 = this.$colors;
            C16370s9 r7 = this.$shape;
            int i = this.$$dirty2;
            r3.A03(r4, r5, r6, r7, 0.0f, 0.0f, ((this.$$dirty >> 9) & 14) | 12582912 | ((this.$$dirty1 >> 6) & 112) | ((i << 6) & 896) | ((i << 3) & 7168) | ((i << 9) & 57344), 96, z, z2);
        } else {
            r6.CNR();
        }
        return C27621Wu.A00;
    }
}
