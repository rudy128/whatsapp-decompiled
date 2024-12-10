package X;

import com.whatsapp.registration.AccountTransferManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.AccountTransferManager", f = "AccountTransferManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {180, 182, 218}, m = "onExecuteRegisterTask", n = {"this", "accountTransferCallback", "tryAttempt", "this", "accountTransferCallback", "tryAttempt", "this", "accountTransferCallback", "tryAttempt"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* renamed from: X.AoS  reason: case insensitive filesystem */
public final class C21699AoS extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountTransferManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21699AoS(AccountTransferManager accountTransferManager, C30391dr r2) {
        super(r2);
        this.this$0 = accountTransferManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((C22385B5o) null, this);
    }
}
