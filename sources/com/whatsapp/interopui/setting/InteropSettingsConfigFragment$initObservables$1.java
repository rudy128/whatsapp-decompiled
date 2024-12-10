package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.setting.InteropSettingsConfigFragment$initObservables$1", f = "InteropSettingsConfigFragment.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class InteropSettingsConfigFragment$initObservables$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InteropSettingsConfigFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropSettingsConfigFragment$initObservables$1(InteropSettingsConfigFragment interopSettingsConfigFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopSettingsConfigFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropSettingsConfigFragment$initObservables$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropSettingsConfigFragment$initObservables$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            InteropSettingsConfigFragment interopSettingsConfigFragment = this.this$0;
            AnonymousClass1G1 r2 = ((InteropSettingsViewModel) this.this$0.A03.getValue()).A06;
            InteropSettingsConfigFragment$initObservables$1$1$1 interopSettingsConfigFragment$initObservables$1$1$1 = new InteropSettingsConfigFragment$initObservables$1$1$1(interopSettingsConfigFragment, (C30391dr) null);
            this.label = 1;
            if (C88604aC.A00(this, interopSettingsConfigFragment$initObservables$1$1$1, r2) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
