package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import X.C75503hd;
import X.C97134oy;
import X.C99694tJ;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$optOut$2;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onOptOutConfirmed$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsPrivacyCameraEffectsViewModel$onOptOutConfirmed$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ SettingsPrivacyCameraEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsPrivacyCameraEffectsViewModel$onOptOutConfirmed$1(SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = settingsPrivacyCameraEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SettingsPrivacyCameraEffectsViewModel$onOptOutConfirmed$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SettingsPrivacyCameraEffectsViewModel$onOptOutConfirmed$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ArEffectsFlmConsentManager arEffectsFlmConsentManager = this.this$0.A02;
            this.label = 1;
            if (!C72453Mb.A1a(((C97134oy) arEffectsFlmConsentManager.A02.get()).A03)) {
                throw new C75503hd();
            } else if (AnonymousClass000.A1Y(arEffectsFlmConsentManager.A07.getValue()) && C30451dy.A00(this, arEffectsFlmConsentManager.A06, new ArEffectsFlmConsentManager$optOut$2(arEffectsFlmConsentManager, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (C99694tJ e) {
                Log.e("SettingsPrivacyCameraEffectsViewModel/onPreferenceClicked Failed to opt out", e);
                AnonymousClass3MY.A1Y(this.this$0.A04, false);
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
