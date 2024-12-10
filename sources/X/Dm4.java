package X;

import android.content.Context;
import android.view.View;

public final class Dm4 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C22654BId this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm4(Context context, C22654BId bId) {
        super(0);
        this.$context = context;
        this.this$0 = bId;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.$context;
        C18030ve A0N = this.this$0.getAbProps();
        AnonymousClass18K A0O = this.this$0.getWamRuntime();
        AnonymousClass1L9 A07 = this.this$0.getActivityUtils();
        C18000vb A0L = this.this$0.getWhatsAppLocale();
        C19830z4 A0K = this.this$0.getWaSharedPreferences();
        return new C20441ALe(context, (View) null, A07, this.this$0, this.this$0.getBackupSharedPreferences(), this.this$0.getBackupStorageBannerManager(), A0K, A0L, A0N, A0O, 0);
    }
}
