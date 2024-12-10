package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C108195bI;
import X.C138126wZ;
import X.C145317Ku;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C37291pH;
import X.C72453Mb;
import X.C97134oy;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4", f = "ArEffectsFlmConsentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108195bI $callback;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C97134oy $disclosureProvider;
    public final /* synthetic */ C37291pH $launcher;
    public int label;
    public final /* synthetic */ ArEffectsFlmConsentManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4(Context context, C97134oy r3, C108195bI r4, ArEffectsFlmConsentManager arEffectsFlmConsentManager, C37291pH r6, C30391dr r7) {
        super(2, r7);
        this.$launcher = r6;
        this.$context = context;
        this.$disclosureProvider = r3;
        this.$callback = r4;
        this.this$0 = arEffectsFlmConsentManager;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4(this.$context, this.$disclosureProvider, this.$callback, this.this$0, this.$launcher, r9);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C37291pH r3 = this.$launcher;
            Context context = this.$context;
            Integer A0v = AnonymousClass3MW.A0v(C72453Mb.A0I(this.$disclosureProvider.A01));
            r3.A02(context, C138126wZ.A05, new C145317Ku(this.$callback, this.this$0, 0), A0v, (String) null);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
