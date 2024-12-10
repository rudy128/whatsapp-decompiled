package X;

/* renamed from: X.0pi  reason: invalid class name and case insensitive filesystem */
public final class C14870pi extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ long $containerConstraints;
    public final /* synthetic */ C17510um $this_null;
    public final /* synthetic */ int $totalHorizontalPadding;
    public final /* synthetic */ int $totalVerticalPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14870pi(C17510um r2, int i, int i2, long j) {
        super(3);
        this.$this_null = r2;
        this.$containerConstraints = j;
        this.$totalHorizontalPadding = i;
        this.$totalVerticalPadding = i2;
    }

    public final C16820tH A00(C22821Di r6, int i, int i2) {
        C17510um r4 = this.$this_null;
        long j = this.$containerConstraints;
        return r4.BhL(AnonymousClass1D7.A0I(), r6, C26229CvL.A01(j, i + this.$totalHorizontalPadding), C26229CvL.A00(j, i2 + this.$totalVerticalPadding));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00((C22821Di) obj3, AnonymousClass000.A0M(obj), AnonymousClass000.A0M(obj2));
    }
}
