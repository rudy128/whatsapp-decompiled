package com.whatsapp.registration.audioguidance;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass8BR;
import X.C17880vN;
import X.C18070vi;
import X.C21721ArX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1", f = "RegistrationAudioGuidanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ RegistrationAudioGuidanceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = registrationAudioGuidanceViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Log.i("RegistrationAudioGuidanceViewModel/cleanupAudioFiles");
            String absolutePath = C17880vN.A0e(AnonymousClass8BR.A0t(this.this$0.A0C), "NetworkResource/Dynamic").getAbsolutePath();
            C18070vi.A0X(absolutePath);
            File A0u = AnonymousClass8BR.A0u(absolutePath, "reg_audio_guidance");
            if (A0u.exists()) {
                Log.i("RegistrationAudioGuidanceViewModel/cleanupAudioFiles/deleting audio files");
                C21721ArX.A05(A0u);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
