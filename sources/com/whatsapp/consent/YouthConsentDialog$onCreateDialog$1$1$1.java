package com.whatsapp.consent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.YouthConsentDialog$onCreateDialog$1$1$1", f = "YouthConsentDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class YouthConsentDialog$onCreateDialog$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ YouthConsentDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YouthConsentDialog$onCreateDialog$1$1$1(YouthConsentDialog youthConsentDialog, C30391dr r3) {
        super(2, r3);
        this.this$0 = youthConsentDialog;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new YouthConsentDialog$onCreateDialog$1$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new YouthConsentDialog$onCreateDialog$1$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ConsentNavigationViewModel consentNavigationViewModel = (ConsentNavigationViewModel) this.this$0.A00.getValue();
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.this$0.A14());
            C18070vi.A0X(defaultSharedPreferences);
            AnonymousClass3MW.A1X(consentNavigationViewModel.A09, new ConsentNavigationViewModel$resetPreferences$1(defaultSharedPreferences, (C30391dr) null), consentNavigationViewModel.A0A);
            consentNavigationViewModel.A04.A01.A08.A01(0);
            ConsentNavigationViewModel.A03(consentNavigationViewModel);
            this.this$0.A28();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
