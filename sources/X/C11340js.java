package X;

/* renamed from: X.0js  reason: invalid class name and case insensitive filesystem */
public final class C11340js extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26041Cr5 $imeOptions;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C25147CZy $textInputService;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11340js(C04940Pp r2, C26041Cr5 cr5, C26224CvE cvE, C25147CZy cZy) {
        super(1);
        this.$textInputService = cZy;
        this.$state = r2;
        this.$value = cvE;
        this.$imeOptions = cr5;
    }

    public final AnonymousClass0VV A00() {
        if (this.$textInputService != null && AnonymousClass001.A1b(this.$state.A08)) {
            C04940Pp r1 = this.$state;
            C25147CZy cZy = this.$textInputService;
            r1.A0D(C05090Qj.A00(r1.A07(), this.$imeOptions, this.$value, cZy, r1.A0A(), r1.A09()));
        }
        return new AnonymousClass0VV(0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00();
    }
}
