package X;

/* renamed from: X.0iG  reason: invalid class name and case insensitive filesystem */
public final class C10390iG extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16300s2 $alpha;
    public final /* synthetic */ C16300s2 $scale;
    public final /* synthetic */ C16300s2 $transformOrigin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10390iG(C16300s2 r2, C16300s2 r3, C16300s2 r4) {
        super(1);
        this.$alpha = r2;
        this.$scale = r3;
        this.$transformOrigin = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        float f2;
        long j;
        C17760vB r3 = (C17760vB) obj;
        C16300s2 r0 = this.$alpha;
        float f3 = 1.0f;
        if (r0 != null) {
            f = AnonymousClass001.A06(r0);
        } else {
            f = 1.0f;
        }
        r3.CHo(f);
        C16300s2 r02 = this.$scale;
        if (r02 != null) {
            f2 = AnonymousClass001.A06(r02);
        } else {
            f2 = 1.0f;
        }
        r3.CKX(f2);
        C16300s2 r03 = this.$scale;
        if (r03 != null) {
            f3 = AnonymousClass001.A06(r03);
        }
        r3.CKY(f3);
        C16300s2 r04 = this.$transformOrigin;
        if (r04 != null) {
            j = ((AnonymousClass0NB) r04.getValue()).A00;
        } else {
            j = AnonymousClass0NB.A01;
        }
        r3.CLD(j);
        return C27621Wu.A00;
    }
}
