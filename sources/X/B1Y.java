package X;

public final class B1Y extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22811Dh $appliedPromotionTriggered;
    public final /* synthetic */ C22811Dh $isFetchedAtLeastOnce;
    public final /* synthetic */ C22801Dg $this_apply;
    public final /* synthetic */ C161558Fv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1Y(C22801Dg r2, C161558Fv r3, C22811Dh r4, C22811Dh r5) {
        super(1);
        this.$this_apply = r2;
        this.$appliedPromotionTriggered = r4;
        this.this$0 = r3;
        this.$isFetchedAtLeastOnce = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C195679tj r6 = (C195679tj) obj;
        C19972A1h a1h = (C19972A1h) this.$this_apply.A06();
        if (a1h != null) {
            this.$this_apply.A0F(new C19972A1h(r6, a1h.A01, a1h.A02));
        }
        C22811Dh r1 = this.$appliedPromotionTriggered;
        if (!r1.element) {
            r1.element = true;
            C22801Dg r4 = this.$this_apply;
            C161558Fv r3 = this.this$0;
            C20339AGv.A01(r3.A02.A02, r4, new B1C(r4, r3, this.$isFetchedAtLeastOnce), 3);
        }
        return C27621Wu.A00;
    }
}
