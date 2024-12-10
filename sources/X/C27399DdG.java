package X;

import com.whatsapp.calling.dialer.DialerContactQuerySyncManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerContactQuerySyncManager", f = "DialerContactQuerySyncManager.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {43, 52, 60, 66}, m = "querySyncUserForPhoneNumber", n = {"this", "enteredPhoneNumber", "this", "enteredPhoneNumber", "this", "enteredPhoneNumber", "this", "enteredPhoneNumber"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.DdG  reason: case insensitive filesystem */
public final class C27399DdG extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerContactQuerySyncManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27399DdG(DialerContactQuerySyncManager dialerContactQuerySyncManager, C30391dr r2) {
        super(r2);
        this.this$0 = dialerContactQuerySyncManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, this);
    }
}
