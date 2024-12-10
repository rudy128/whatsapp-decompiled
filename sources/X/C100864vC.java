package X;

import android.content.Context;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager", f = "ArEffectsFlmConsentManager.kt", i = {1, 1, 1, 1, 1}, l = {129, 136, 144}, m = "maybeShowFlmConsentBottomSheet", n = {"this", "context", "callback", "disclosureProvider", "launcher"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: X.4vC  reason: invalid class name and case insensitive filesystem */
public final class C100864vC extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArEffectsFlmConsentManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100864vC(ArEffectsFlmConsentManager arEffectsFlmConsentManager, C30391dr r2) {
        super(r2);
        this.this$0 = arEffectsFlmConsentManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Context) null, (C108195bI) null, this);
    }
}
