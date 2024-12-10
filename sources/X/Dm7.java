package X;

public final class Dm7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1GP $fragmentManager;
    public final /* synthetic */ C22654BId this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm7(AnonymousClass1GP r2, C22654BId bId) {
        super(0);
        this.$fragmentManager = r2;
        this.this$0 = bId;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1GP r4 = this.$fragmentManager;
        C22654BId bId = this.this$0;
        C36171nS A0Z = bId.getSmbSoftEnforcementLoggingUtil();
        AnonymousClass18K A0O = this.this$0.getWamRuntime();
        C133876pe r9 = new C133876pe(this.this$0.getWaSharedPreferences(), this.this$0.getAbProps(), A0O, new C139736zM(this.this$0.getWaSharedPreferences()));
        return new C142917Bh(r4, bId, (C123696Vm) this.this$0.A0h.get(), (AnonymousClass6XS) this.this$0.A0i.get(), A0Z, r9);
    }
}
