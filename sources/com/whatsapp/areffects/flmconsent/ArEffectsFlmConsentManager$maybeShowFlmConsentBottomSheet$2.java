package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108195bI;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2", f = "ArEffectsFlmConsentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108195bI $callback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2(C108195bI r2, C30391dr r3) {
        super(2, r3);
        this.$callback = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2(this.$callback, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2(this.$callback, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$callback.Bsl();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
