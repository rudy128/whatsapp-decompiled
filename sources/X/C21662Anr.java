package X;

import com.whatsapp.registration.AccountTransferManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.AccountTransferManager", f = "AccountTransferManager.kt", i = {0}, l = {63}, m = "requestCode", n = {"this"}, s = {"L$0"})
/* renamed from: X.Anr  reason: case insensitive filesystem */
public final class C21662Anr extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountTransferManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21662Anr(AccountTransferManager accountTransferManager, C30391dr r2) {
        super(r2);
        this.this$0 = accountTransferManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03(this);
    }
}
