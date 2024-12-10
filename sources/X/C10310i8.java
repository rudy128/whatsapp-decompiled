package X;

/* renamed from: X.0i8  reason: invalid class name and case insensitive filesystem */
public final class C10310i8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ float $maxBound;
    public final /* synthetic */ float $minBound;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10310i8(float f, float f2) {
        super(1);
        this.$maxBound = f;
        this.$minBound = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        if (AnonymousClass000.A1Y(obj)) {
            f = this.$maxBound;
        } else {
            f = this.$minBound;
        }
        return Float.valueOf(f);
    }
}
