package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C37291pH;
import X.C97134oy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3", f = "ArEffectsFlmConsentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C97134oy $disclosureProvider;
    public final /* synthetic */ C37291pH $launcher;
    public int label;
    public final /* synthetic */ ArEffectsFlmConsentManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3(C97134oy r2, ArEffectsFlmConsentManager arEffectsFlmConsentManager, C37291pH r4, C30391dr r5) {
        super(2, r5);
        this.$launcher = r4;
        this.$disclosureProvider = r2;
        this.this$0 = arEffectsFlmConsentManager;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3(this.$disclosureProvider, this.this$0, this.$launcher, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$launcher.A04(this.$disclosureProvider.CEA());
            this.this$0.A00 = true;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
