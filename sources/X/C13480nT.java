package X;

/* renamed from: X.0nT  reason: invalid class name and case insensitive filesystem */
public final class C13480nT extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isLeft;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C16250rx $offsetProvider;
    public final /* synthetic */ C16880tN $viewConfiguration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13480nT(C16250rx r2, C17090tj r3, C16880tN r4, boolean z, boolean z2) {
        super(2);
        this.$viewConfiguration = r4;
        this.$modifier = r3;
        this.$isLeft = z;
        this.$offsetProvider = r2;
        this.$isStartHandle = z2;
    }

    public final void A00(C17130tn r7, int i) {
        if ((i & 11) != 2 || !r7.BZO()) {
            AnonymousClass0PZ.A03(r7, AnonymousClass0OD.A0B.A03(this.$viewConfiguration), AnonymousClass0LC.A00(r7, new C13390nK(this.$offsetProvider, this.$modifier, this.$isLeft, this.$isStartHandle), -1338858912), 56);
            return;
        }
        r7.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
