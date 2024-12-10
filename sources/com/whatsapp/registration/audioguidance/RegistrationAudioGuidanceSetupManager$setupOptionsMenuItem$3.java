package com.whatsapp.registration.audioguidance;

import X.A1I;
import X.AnonymousClass000;
import X.AnonymousClass1KB;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass4SH;
import X.C17880vN;
import X.C21449AkG;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3", f = "RegistrationAudioGuidanceSetupManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ RegistrationAudioGuidanceViewModel $viewModel;
    public int label;
    public final /* synthetic */ AnonymousClass4SH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3(AnonymousClass4SH r2, RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, C30391dr r4) {
        super(2, r4);
        this.$viewModel = registrationAudioGuidanceViewModel;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3(this.this$0, this.$viewModel, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass4SH r3;
        AnonymousClass1KB r2;
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (AnonymousClass3MX.A1T(C17880vN.A0C(this.$viewModel.A0D.A01), "is_reg_audio_guidance_enabled")) {
                RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = this.$viewModel;
                File A02 = ((A1I) registrationAudioGuidanceViewModel.A0F.get()).A02(RegistrationAudioGuidanceViewModel.A03(registrationAudioGuidanceViewModel));
                if (A02 != null && A02.exists()) {
                    r3 = this.this$0;
                    r2 = r3.A03;
                    i = 44;
                    r2.A0J(new C21449AkG((Object) r3, i));
                    return C27621Wu.A00;
                }
            }
            r3 = this.this$0;
            r2 = r3.A03;
            i = 43;
            r2.A0J(new C21449AkG((Object) r3, i));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
