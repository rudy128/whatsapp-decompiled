package X;

public final class B1D extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22811Dh $isFetchedAtLeastOnce;
    public final /* synthetic */ C22801Dg $this_apply;
    public final /* synthetic */ C161558Fv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1D(C22801Dg r2, C161558Fv r3, C22811Dh r4) {
        super(1);
        this.$isFetchedAtLeastOnce = r4;
        this.$this_apply = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (!this.$isFetchedAtLeastOnce.element && C18070vi.A19(obj, false)) {
            this.$isFetchedAtLeastOnce.element = true;
            C19972A1h a1h = (C19972A1h) this.$this_apply.A06();
            if (a1h != null) {
                this.$this_apply.A0F(new C19972A1h(a1h.A00, a1h.A01, true));
            }
            C161558Fv r2 = this.this$0;
            String str = r2.A00;
            r2.A00 = null;
            if (str != null) {
                r2.A0U(str);
            }
        }
        return C27621Wu.A00;
    }
}
