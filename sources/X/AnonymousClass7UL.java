package X;

import com.whatsapp.dobverification.WaConsentRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.WaConsentRepository", f = "WaConsentRepository.kt", i = {0, 0}, l = {181, 186}, m = "startVerification", n = {"this", "age"}, s = {"L$0", "I$0"})
/* renamed from: X.7UL  reason: invalid class name */
public final class AnonymousClass7UL extends C30421du {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WaConsentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UL(WaConsentRepository waConsentRepository, C30391dr r2) {
        super(r2);
        this.this$0 = waConsentRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.COM(this, 0, 0, 0, 0);
    }
}
