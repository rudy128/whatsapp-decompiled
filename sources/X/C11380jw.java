package X;

/* renamed from: X.0jw  reason: invalid class name and case insensitive filesystem */
public final class C11380jw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0HD $colorFilter;
    public final /* synthetic */ C16980tX $handleImage;
    public final /* synthetic */ C18090vk $iconVisible;
    public final /* synthetic */ boolean $isLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11380jw(AnonymousClass0HD r2, C16980tX r3, C18090vk r4, boolean z) {
        super(1);
        this.$iconVisible = r4;
        this.$isLeft = z;
        this.$handleImage = r3;
        this.$colorFilter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17480uj) obj);
        return C27621Wu.A00;
    }

    public final void A00(C17480uj r11) {
        r11.BJR();
        if (AnonymousClass000.A1Y(this.$iconVisible.invoke())) {
            boolean z = this.$isLeft;
            C16980tX r9 = this.$handleImage;
            AnonymousClass0HD r8 = this.$colorFilter;
            if (z) {
                long BOQ = r11.BOQ();
                AnonymousClass0t6 BQs = r11.BQs();
                long BZL = BQs.BZL();
                AnonymousClass0WZ.A00(BQs).CGs(-1.0f, 1.0f, BOQ);
                C04820Pb.A01(r8, r9, r11);
                AnonymousClass001.A1P(BQs, BZL);
                return;
            }
            C04820Pb.A01(r8, r9, r11);
        }
    }
}
