package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C108465bk;
import X.C200410p;
import X.C20741AWw;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C97804q5;
import X.C97814q6;
import X.C97824q7;
import X.C98924rw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupViewModel$updateItemStatus$1", f = "SettingsSecurityCheckupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsSecurityCheckupViewModel$updateItemStatus$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ SettingsSecurityCheckupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsSecurityCheckupViewModel$updateItemStatus$1(SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = settingsSecurityCheckupViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SettingsSecurityCheckupViewModel$updateItemStatus$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SettingsSecurityCheckupViewModel$updateItemStatus$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C97804q5 r1;
        if (this.label == 0) {
            C30691eM.A01(obj);
            SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel = this.this$0;
            AnonymousClass1G4 r2 = settingsSecurityCheckupViewModel.A03;
            C108465bk[] r3 = new C108465bk[3];
            if (settingsSecurityCheckupViewModel.A00.A01()) {
                r1 = new C97804q5(this.this$0.A01.A02.A03.getValue() instanceof C20741AWw);
            } else {
                r1 = null;
            }
            r3[0] = r1;
            r3[1] = new C97824q7(this.this$0.A01.A00.A0o(), this.this$0.A01.A00.A2N());
            r3[2] = new C97814q6(!this.this$0.A01.A03.A02().isEmpty());
            r2.setValue(C98924rw.A00(C200410p.A0P(r3), 18));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
