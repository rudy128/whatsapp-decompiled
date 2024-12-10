package X;

/* renamed from: X.0ji  reason: invalid class name and case insensitive filesystem */
public final class C11240ji extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $height;
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11240ji(AnonymousClass0XJ r2, int i, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = r2;
        this.$height = i2;
    }

    public final void A00(AnonymousClass0QZ r6) {
        C18070vi.A0d(r6, 0);
        int i = this.$width;
        AnonymousClass0XJ r4 = this.$placeable;
        AnonymousClass0QZ.A03(r4, 0.0f, C22339B3q.A01(((float) (i - r4.A01)) / 2.0f), C22339B3q.A01(((float) (this.$height - r4.A00)) / 2.0f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
