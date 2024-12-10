package X;

import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;

public final class B3Y extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BrazilPixKeySettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B3Y(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        super(2);
        this.this$0 = brazilPixKeySettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        C18070vi.A0d(str2, 0);
        BrazilPixKeySettingActivity brazilPixKeySettingActivity = this.this$0;
        AnonymousClass02n r2 = brazilPixKeySettingActivity.A01;
        if (r2 == null) {
            str = "webViewActivityLauncher";
        } else if (brazilPixKeySettingActivity.A03 != null) {
            r2.A02((C1406772n) null, AnonymousClass1LU.A1c(brazilPixKeySettingActivity, str2, str3, (String) null, 1));
            return C27621Wu.A00;
        } else {
            str = "waIntents";
        }
        C18070vi.A11(str);
        throw null;
    }
}
