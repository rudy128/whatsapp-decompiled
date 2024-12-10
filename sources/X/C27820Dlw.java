package X;

/* renamed from: X.Dlw  reason: case insensitive filesystem */
public final class C27820Dlw extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24426C3b $obj;
    public final /* synthetic */ BXG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27820Dlw(BXG bxg, C24426C3b c3b) {
        super(0);
        this.$obj = c3b;
        this.this$0 = bxg;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BQm bQm;
        C6B A00;
        C24426C3b c3b = this.$obj;
        boolean z = true;
        if (c3b instanceof BXR) {
            if (C18070vi.A18(((BXR) c3b).A00, this.this$0.A00.A09())) {
                C25838Cms cms = this.this$0.A00.A0J;
                if (cms != null) {
                    cms.A03("socket_connection_connected");
                }
                bQm = this.this$0.A00;
                A00 = bQm.A08();
            }
            z = false;
            return Boolean.valueOf(z);
        }
        if ((c3b instanceof BXQ) || (c3b instanceof BXX)) {
            bQm = this.this$0.A00;
            A00 = C25522ChK.A00(bQm.A04, bQm, BQm.A0R, 1);
        }
        z = false;
        return Boolean.valueOf(z);
        bQm.A00.A03 = A00;
        return Boolean.valueOf(z);
    }
}
