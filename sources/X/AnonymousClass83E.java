package X;

/* renamed from: X.83E  reason: invalid class name */
public final class AnonymousClass83E extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $minSegmentConfidence;
    public final /* synthetic */ C25550Cho $requestLocale;
    public final /* synthetic */ C25550Cho $resultLocale;
    public final /* synthetic */ CM2 $status;
    public final /* synthetic */ String $transcriptionId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83E(C25550Cho cho, C25550Cho cho2, CM2 cm2, String str, int i) {
        super(1);
        this.$status = cm2;
        this.$requestLocale = cho;
        this.$resultLocale = cho2;
        this.$minSegmentConfidence = i;
        this.$transcriptionId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7LG r10 = (AnonymousClass7LG) obj;
        C18070vi.A0d(r10, 0);
        CM2 cm2 = this.$status;
        C25550Cho cho = this.$requestLocale;
        C25550Cho cho2 = this.$resultLocale;
        int i = this.$minSegmentConfidence;
        String str = this.$transcriptionId;
        byte[] bArr = r10.A08;
        int i2 = r10.A00;
        boolean z = r10.A07;
        C18070vi.A0p(cm2, cho, cho2);
        return new AnonymousClass7LG(cho, cho2, cm2, str, bArr, i2, i, z);
    }
}
