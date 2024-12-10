package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4IV;
import X.C17890vO;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import X.C41731wy;
import X.C72453Mb;
import X.C87324Vd;
import android.content.Context;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class SettingsPrivacyCameraEffectsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final ArEffectsFlmConsentManager A02;
    public final C41731wy A03 = AnonymousClass3MW.A0o();
    public final AnonymousClass1G4 A04;
    public final boolean A05;
    public final C18600wl A06;

    @DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                SettingsPrivacyCameraEffectsViewModel.this.A02.A01();
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    public final void A0T(Context context, boolean z) {
        C18070vi.A0d(context, 0);
        if (C18070vi.A19(this.A00.A06(), z)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SettingsPrivacyCameraEffectsViewModel/onPreferenceClicked isSwitchChecked is already ");
            A10.append(z);
            C17890vO.A0w(A10);
            return;
        }
        this.A04.setValue((Object) null);
        if (z) {
            AnonymousClass3MX.A1Q(new SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1(context, this, (C30391dr) null), C41561wd.A00(this));
            return;
        }
        this.A03.A0F(C27621Wu.A00);
    }

    public SettingsPrivacyCameraEffectsViewModel(ArEffectsFlmConsentManager arEffectsFlmConsentManager, C18600wl r6) {
        C18070vi.A0j(arEffectsFlmConsentManager, r6);
        this.A02 = arEffectsFlmConsentManager;
        this.A06 = r6;
        boolean A1a = C72453Mb.A1a(arEffectsFlmConsentManager.A05);
        this.A05 = A1a;
        AnonymousClass1G4 r0 = arEffectsFlmConsentManager.A07;
        AnonymousClass1OR r1 = AnonymousClass1OR.A00;
        this.A00 = C87324Vd.A00(r1, r0);
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(AnonymousClass4IV.A01);
        this.A04 = A18;
        this.A01 = C87324Vd.A00(r1, A18);
        if (A1a) {
            AnonymousClass3MW.A1X(r6, new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
        }
    }
}
