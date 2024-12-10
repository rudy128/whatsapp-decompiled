package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C33501iv;
import X.C37291pH;
import X.C72453Mb;
import X.C75493hc;
import X.C97134oy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$optOut$2", f = "ArEffectsFlmConsentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsFlmConsentManager$optOut$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ArEffectsFlmConsentManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsFlmConsentManager$optOut$2(ArEffectsFlmConsentManager arEffectsFlmConsentManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = arEffectsFlmConsentManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ArEffectsFlmConsentManager$optOut$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ArEffectsFlmConsentManager$optOut$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            int A0I = C72453Mb.A0I(((C97134oy) this.this$0.A02.get()).A01);
            ((C33501iv) this.this$0.A03.get()).A03(A0I, 162, true, true);
            if (!((C37291pH) this.this$0.A04.get()).A01.A0A(A0I)) {
                AnonymousClass3MY.A1Y(this.this$0.A07, false);
                return C27621Wu.A00;
            }
            throw new C75493hc();
        }
        throw AnonymousClass000.A0l();
    }
}
