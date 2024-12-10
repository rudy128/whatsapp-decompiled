package X;

/* renamed from: X.0jA  reason: invalid class name and case insensitive filesystem */
public final class C10900jA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $extraSizePx;
    public final /* synthetic */ AnonymousClass0XJ $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10900jA(AnonymousClass0XJ r2, int i) {
        super(1);
        this.$placeable = r2;
        this.$extraSizePx = i;
    }

    public final void A00() {
        AnonymousClass0XJ r4 = this.$placeable;
        int A0W = ((-this.$extraSizePx) / 2) - ((r4.A01 - r4.A0W()) / 2);
        int i = (-this.$extraSizePx) / 2;
        AnonymousClass0XJ r0 = this.$placeable;
        AnonymousClass0QZ.A07(r4, (C22821Di) null, A0W, i - ((r0.A00 - r0.A0V()) / 2), 12);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
