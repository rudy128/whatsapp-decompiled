package X;

/* renamed from: X.Dlz  reason: case insensitive filesystem */
public final class C27823Dlz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24426C3b $obj;
    public final /* synthetic */ BXI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27823Dlz(C24426C3b c3b, BXI bxi) {
        super(0);
        this.$obj = c3b;
        this.this$0 = bxi;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BQm bQm;
        C6B A01;
        C24426C3b c3b = this.$obj;
        boolean z = true;
        if (c3b instanceof BXR) {
            bQm = this.this$0.A00;
            A01 = bQm.A08();
        } else if (c3b instanceof BXX) {
            bQm = this.this$0.A00;
            A01 = BQm.A01(bQm);
        } else {
            z = false;
            return Boolean.valueOf(z);
        }
        bQm.A00.A03 = A01;
        return Boolean.valueOf(z);
    }
}
