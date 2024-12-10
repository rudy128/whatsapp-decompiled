package X;

public final class B1F extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0CD $category;
    public final /* synthetic */ int $index;
    public final /* synthetic */ C20528AOn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1F(AnonymousClass0CD r2, C20528AOn aOn, int i) {
        super(1);
        this.this$0 = aOn;
        this.$category = r2;
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A01.A0E(this.$category);
        C20528AOn aOn = this.this$0;
        if (aOn.A02.A00(aOn.A06)) {
            A17 a17 = this.this$0.A05;
            long j = ((long) this.$index) + 1;
            String str = this.$category.A01;
            C171608rz r5 = new C171608rz();
            r5.A01 = C17880vN.A0m();
            r5.A03 = AnonymousClass3MY.A0f();
            if (C18020vd.A05(C18040vf.A02, a17.A03, 2828)) {
                r5.A0B = str;
                r5.A05 = Long.valueOf(j);
            }
            A17.A00(r5, a17);
        }
        return C27621Wu.A00;
    }
}
