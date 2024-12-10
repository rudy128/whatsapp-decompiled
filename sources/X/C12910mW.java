package X;

/* renamed from: X.0mW  reason: invalid class name and case insensitive filesystem */
public final class C12910mW extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12910mW(C16110rj r2, AnonymousClass0NY r3, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = r2;
        this.$colors = r3;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn r6 = (C17130tn) obj;
        if ((AnonymousClass000.A0M(obj2) & 11) != 2 || !r6.BZO()) {
            AnonymousClass0PR r3 = AnonymousClass0PR.A00;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            C16110rj r4 = this.$interactionSource;
            AnonymousClass0NY r5 = this.$colors;
            int i = this.$$dirty;
            r3.A03(r4, r5, r6, (C16370s9) null, 0.0f, 0.0f, ((i >> 9) & 896) | ((i >> 6) & 14) | 12582912 | ((i >> 15) & 112) | ((this.$$dirty1 >> 3) & 7168), 112, z, z2);
        } else {
            r6.CNR();
        }
        return C27621Wu.A00;
    }
}
