package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41561wd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupViewModel$refreshStatus$1", f = "SettingsSecurityCheckupViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsSecurityCheckupViewModel$refreshStatus$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ SettingsSecurityCheckupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsSecurityCheckupViewModel$refreshStatus$1(SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = settingsSecurityCheckupViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SettingsSecurityCheckupViewModel$refreshStatus$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SettingsSecurityCheckupViewModel$refreshStatus$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            SecurityCheckupStatusRepository securityCheckupStatusRepository = this.this$0.A01;
            this.label = 1;
            if (securityCheckupStatusRepository.A00(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel = this.this$0;
        AnonymousClass3MX.A1Q(new SettingsSecurityCheckupViewModel$updateItemStatus$1(settingsSecurityCheckupViewModel, (C30391dr) null), C41561wd.A00(settingsSecurityCheckupViewModel));
        return C27621Wu.A00;
    }
}
