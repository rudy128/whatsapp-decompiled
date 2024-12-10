package X;

import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.imagineme.ImagineMeOnboardingRequester", f = "ImagineMeOnboardingRequester.kt", i = {}, l = {79}, m = "getOnboardedStatus", n = {}, s = {})
/* renamed from: X.4to  reason: invalid class name and case insensitive filesystem */
public final class C100004to extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ImagineMeOnboardingRequester this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100004to(ImagineMeOnboardingRequester imagineMeOnboardingRequester, C30391dr r2) {
        super(r2);
        this.this$0 = imagineMeOnboardingRequester;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
