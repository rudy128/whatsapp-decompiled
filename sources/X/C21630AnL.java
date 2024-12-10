package X;

import com.whatsapp.registration.AccountTransferManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.AccountTransferManager", f = "AccountTransferManager.kt", i = {}, l = {140}, m = "verifyOtpCode", n = {}, s = {})
/* renamed from: X.AnL  reason: case insensitive filesystem */
public final class C21630AnL extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountTransferManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21630AnL(AccountTransferManager accountTransferManager, C30391dr r2) {
        super(r2);
        this.this$0 = accountTransferManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((String) null, this);
    }
}
