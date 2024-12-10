package X;

/* renamed from: X.Dp7  reason: case insensitive filesystem */
public final class C27971Dp7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BXM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27971Dp7(BXM bxm) {
        super(1);
        this.this$0 = bxm;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C24358Bzt bzt = (C24358Bzt) obj;
        C18070vi.A0d(bzt, 0);
        C24712CGy.A01.A04("sup:StreamingStateDelegate", AnonymousClass001.A1E(bzt, "Failed to switchLink: ", AnonymousClass000.A10()), (Throwable) null);
        CYR cyr = this.this$0.A00.A0I;
        if (cyr != null) {
            cyr.A01("failure_reason", bzt.name());
            cyr.A00(3);
        }
        return C27621Wu.A00;
    }
}
