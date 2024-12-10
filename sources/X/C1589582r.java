package X;

/* renamed from: X.82r  reason: invalid class name and case insensitive filesystem */
public final class C1589582r extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C36001nB $progressListener;
    public final /* synthetic */ AnonymousClass8Ak $provider;
    public final /* synthetic */ int $totalSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589582r(AnonymousClass8Ak r2, C36001nB r3, int i) {
        super(1);
        this.$progressListener = r3;
        this.$totalSize = i;
        this.$provider = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$progressListener.invoke(Integer.valueOf(this.$totalSize), Integer.valueOf(this.$provider.BVR().A00), Integer.valueOf(AnonymousClass000.A0M(obj)));
        return C27621Wu.A00;
    }
}
