package X;

import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.imagineme.ImagineMeOnboardingRequester", f = "ImagineMeOnboardingRequester.kt", i = {0}, l = {94}, m = "deleteOnboardingWithResult-IoAF18A", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uS  reason: invalid class name and case insensitive filesystem */
public final class C100404uS extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ImagineMeOnboardingRequester this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100404uS(ImagineMeOnboardingRequester imagineMeOnboardingRequester, C30391dr r2) {
        super(r2);
        this.this$0 = imagineMeOnboardingRequester;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00(this);
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return new C30671eK(A00);
        }
        return A00;
    }
}
