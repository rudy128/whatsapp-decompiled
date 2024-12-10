package X;

/* renamed from: X.DoP  reason: case insensitive filesystem */
public final class C27927DoP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ float $ratio;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27927DoP(float f) {
        super(1);
        this.$ratio = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).floatValue();
        float f = this.$ratio;
        double d = (double) f;
        boolean z = false;
        if (0.0d <= d && d <= 1.0d) {
            Float[] fArr = new Float[2];
            BE6.A1T(fArr, 0.0f, 0);
            BE8.A1J(fArr, 1.0f);
            if (!C200410p.A0U(Float.valueOf(f), fArr)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
