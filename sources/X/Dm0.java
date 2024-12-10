package X;

import com.facebook.wearable.applinks.AppLinkRegisterRequest;

public final class Dm0 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AppLinkRegisterRequest $appLinkRegisterRequest;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm0(AppLinkRegisterRequest appLinkRegisterRequest, Cw1 cw1) {
        super(0);
        this.this$0 = cw1;
        this.$appLinkRegisterRequest = appLinkRegisterRequest;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Cw1 cw1 = this.this$0;
        AppLinkRegisterRequest appLinkRegisterRequest = this.$appLinkRegisterRequest;
        if (cw1.A0H) {
            Cw1.A05(new Dm1(appLinkRegisterRequest, cw1));
            return C27621Wu.A00;
        }
        IllegalStateException A0n = AnonymousClass000.A0n("Please update to MWA v127+ to use applinks");
        C26294Cx6.A09("lam:LinkedAppManager", "registerLinkableAppService: unsupported", A0n);
        throw A0n;
    }
}
