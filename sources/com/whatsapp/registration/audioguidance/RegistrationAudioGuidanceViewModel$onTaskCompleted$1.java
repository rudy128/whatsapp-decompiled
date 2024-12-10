package com.whatsapp.registration.audioguidance;

import X.A1I;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C82784Cb;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$onTaskCompleted$1", f = "RegistrationAudioGuidanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RegistrationAudioGuidanceViewModel$onTaskCompleted$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ RegistrationAudioGuidanceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationAudioGuidanceViewModel$onTaskCompleted$1(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = registrationAudioGuidanceViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new RegistrationAudioGuidanceViewModel$onTaskCompleted$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new RegistrationAudioGuidanceViewModel$onTaskCompleted$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            File A02 = ((A1I) this.this$0.A0F.get()).A02(RegistrationAudioGuidanceViewModel.A03(this.this$0));
            if (A02 == null || !A02.exists()) {
                RegistrationAudioGuidanceViewModel.A04(this.this$0);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("RegistrationAudioGuidanceViewModel/onTaskCompleted/audio file downloaded successfully/");
                String str = this.this$0.A03;
                if (str == null) {
                    C18070vi.A11("audioFileId");
                    throw null;
                }
                C17890vO.A1A(A10, str);
                this.this$0.A0T();
                this.this$0.A09.A0E(C82784Cb.DOWNLOADED);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
