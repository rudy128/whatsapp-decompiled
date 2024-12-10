package X;

/* renamed from: X.0fe  reason: invalid class name and case insensitive filesystem */
public final class C08780fe extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0Tt $animationSpec;
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ Object $targetValue;
    public final /* synthetic */ C05770Vq $transitionAnimation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08780fe(AnonymousClass0Tt r2, C05770Vq r3, Object obj, Object obj2) {
        super(0);
        this.$initialValue = obj;
        this.$transitionAnimation = r3;
        this.$targetValue = obj2;
        this.$animationSpec = r2;
    }

    public final void A00() {
        if (!C18070vi.A18(this.$initialValue, this.$transitionAnimation.A03) || !C18070vi.A18(this.$targetValue, this.$transitionAnimation.A04)) {
            C05770Vq r2 = this.$transitionAnimation;
            Object obj = this.$initialValue;
            Object obj2 = this.$targetValue;
            AnonymousClass0Tt r4 = this.$animationSpec;
            r2.A03 = obj;
            r2.A04 = obj2;
            r2.A01 = r4;
            r2.A02 = new AnonymousClass0Ts((C16000rY) r4, (AnonymousClass0D0) null, r2.A07, obj, obj2);
            AnonymousClass000.A1C(r2.A09.A02, true);
            r2.A05 = false;
            r2.A06 = true;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
