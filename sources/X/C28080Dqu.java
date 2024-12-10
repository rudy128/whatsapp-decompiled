package X;

/* renamed from: X.Dqu  reason: case insensitive filesystem */
public final class C28080Dqu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26127Csp $device;
    public final /* synthetic */ C22821Di $success;
    public final /* synthetic */ C188599hg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28080Dqu(C26127Csp csp, C188599hg r3, C22821Di r4) {
        super(1);
        this.this$0 = r3;
        this.$device = csp;
        this.$success = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26294Cx6.A06("lam:LinkedDeviceManager", AnonymousClass001.A1E(obj, "Link switched to ", C18070vi.A0K(obj)));
        this.this$0.A09.invoke(this.$device);
        this.$success.invoke(obj);
        return C27621Wu.A00;
    }
}
