package X;

/* renamed from: X.0nK  reason: invalid class name and case insensitive filesystem */
public final class C13390nK extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isLeft;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C16250rx $offsetProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13390nK(C16250rx r2, C17090tj r3, boolean z, boolean z2) {
        super(2);
        this.$modifier = r3;
        this.$isLeft = z;
        this.$offsetProvider = r2;
        this.$isStartHandle = z2;
    }

    public final void A00(C17130tn r7, int i) {
        if ((i & 11) != 2 || !r7.BZO()) {
            C17090tj r5 = this.$modifier;
            C16250rx r4 = this.$offsetProvider;
            boolean z = this.$isStartHandle;
            boolean z2 = this.$isLeft;
            AnonymousClass0Q8.A04(r7, AnonymousClass0PD.A02(r5, new C10430iK(r4, z, z2), false), new C08060eU(r4), 0, z2);
            return;
        }
        r7.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
