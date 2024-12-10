package X;

/* renamed from: X.0jT  reason: invalid class name and case insensitive filesystem */
public final class C11090jT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ AnonymousClass0VS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11090jT(AnonymousClass0VS r2, AnonymousClass1OS r3) {
        super(1);
        this.this$0 = r2;
        this.$content = r3;
    }

    public final void A00(AnonymousClass0Ii r5) {
        if (!this.this$0.A02) {
            C23381Fv lifecycle = r5.A00().getLifecycle();
            AnonymousClass0VS r1 = this.this$0;
            r1.A01 = this.$content;
            if (r1.A00 == null) {
                r1.A00 = lifecycle;
                lifecycle.A05(r1);
            } else if (lifecycle.A04().A00(C23401Fx.CREATED)) {
                AnonymousClass0VS r12 = this.this$0;
                r12.A04().CIT(AnonymousClass0LC.A01(new C13210n0(r12, this.$content), -2000640158, true));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0Ii) obj);
        return C27621Wu.A00;
    }
}
