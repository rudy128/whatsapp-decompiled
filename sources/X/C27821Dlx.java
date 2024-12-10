package X;

/* renamed from: X.Dlx  reason: case insensitive filesystem */
public final class C27821Dlx extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24426C3b $obj;
    public final /* synthetic */ BXM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27821Dlx(C24426C3b c3b, BXM bxm) {
        super(0);
        this.$obj = c3b;
        this.this$0 = bxm;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BQm bQm;
        C6B A01;
        C24426C3b c3b = this.$obj;
        boolean z = true;
        if (c3b instanceof BXP) {
            this.this$0.A00.A0D((BXP) c3b);
        } else if (c3b instanceof BXS) {
            this.this$0.A00.A0E((BXS) c3b);
        } else {
            if (c3b instanceof C22955BXb) {
                BXM.A00(this.this$0);
            } else if (c3b instanceof BXX) {
                BXM.A00(this.this$0);
                bQm = this.this$0.A00;
                A01 = BQm.A01(bQm);
                bQm.A00.A03 = A01;
            } else if (c3b instanceof C22956BXc) {
                C24712CGy.A01.A02("sup:StreamingStateDelegate", "Already streaming, ignoring message");
            } else if (!(c3b instanceof BXY)) {
                z = false;
            }
            bQm = this.this$0.A00;
            A01 = bQm.A06();
            bQm.A00.A03 = A01;
        }
        return Boolean.valueOf(z);
    }
}
