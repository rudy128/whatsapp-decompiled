package X;

/* renamed from: X.0hs  reason: invalid class name and case insensitive filesystem */
public final class C10150hs extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ AnonymousClass0Q5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10150hs(AnonymousClass0Q5 r2, float f) {
        super(1);
        this.this$0 = r2;
        this.$durationScale = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        if (!AnonymousClass001.A1b(this.this$0.A04)) {
            this.this$0.A05(this.$durationScale, longValue / 1);
        }
        return C27621Wu.A00;
    }
}
