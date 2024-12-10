package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass7RM;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C33501iv;
import X.C62882s9;
import X.C88314Ze;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.setting.InteropSettingsViewModel$onTurnOffClicked$1", f = "InteropSettingsViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
public final class InteropSettingsViewModel$onTurnOffClicked$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InteropSettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropSettingsViewModel$onTurnOffClicked$1(InteropSettingsViewModel interopSettingsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopSettingsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropSettingsViewModel$onTurnOffClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropSettingsViewModel$onTurnOffClicked$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.A0E(new C88314Ze(AnonymousClass00R.A01, (Long) null, (Object) null));
            InteropSettingsViewModel interopSettingsViewModel = this.this$0;
            long currentTimeMillis = System.currentTimeMillis();
            C33501iv r2 = interopSettingsViewModel.A03;
            r2.A05.CGF(new AnonymousClass7RM(r2));
            this.label = 1;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 < 1000 && C62882s9.A00(this, 1000 - currentTimeMillis2) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A03.A06();
        this.this$0.A01.A0E(new C88314Ze(AnonymousClass00R.A0N, (Long) null, (Object) null));
        return C27621Wu.A00;
    }
}
