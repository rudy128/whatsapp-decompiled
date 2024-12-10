package com.whatsapp.bot.metaai.imagineme.settings;

import X.AnonymousClass000;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass6RD;
import X.AnonymousClass8B8;
import X.C108955ca;
import X.C21445AkC;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1", f = "ImagineMeSettingsViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ImagineMeSettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1(ImagineMeSettingsViewModel imagineMeSettingsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = imagineMeSettingsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ImagineMeOnboardingRequester imagineMeOnboardingRequester = this.this$0.A0A;
            this.label = 1;
            A00 = imagineMeOnboardingRequester.A00(this);
            if (A00 == r2) {
                return r2;
            }
        } else if (i == 1) {
            A00 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass3MY.A1M(this.this$0.A0D, false);
        boolean z = !(A00 instanceof AnonymousClass1IU);
        ImagineMeSettingsViewModel imagineMeSettingsViewModel = this.this$0;
        if (z) {
            imagineMeSettingsViewModel.A08.A00(false);
            this.this$0.A0C.A0E(AnonymousClass3MW.A0v(2131892176));
            ImagineMeSettingsViewModel imagineMeSettingsViewModel2 = this.this$0;
            imagineMeSettingsViewModel2.A07.CGP(new C21445AkC(imagineMeSettingsViewModel2, 47));
            this.this$0.A09.A07((AnonymousClass8B8) null, AnonymousClass6RD.META_AI_IMAGINE_ME_TOS);
        } else {
            imagineMeSettingsViewModel.A0C.A0E(AnonymousClass3MW.A0v(2131892181));
        }
        return C27621Wu.A00;
    }
}
