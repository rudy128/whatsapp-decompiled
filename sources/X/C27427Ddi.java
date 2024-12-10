package X;

import com.whatsapp.calling.dialer.DialerDataSourceRemote;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerDataSourceRemote", f = "DialerDataSourceRemote.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3}, l = {23, 27, 30, 36}, m = "updateContactDetailsWithSyncQuery", n = {"this", "$this$updateContactDetailsWithSyncQuery_u24lambda_u241", "this", "$this$updateContactDetailsWithSyncQuery_u24lambda_u241", "this", "$this$updateContactDetailsWithSyncQuery_u24lambda_u241", "response", "$this$updateContactDetailsWithSyncQuery_u24lambda_u241", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$2"})
/* renamed from: X.Ddi  reason: case insensitive filesystem */
public final class C27427Ddi extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerDataSourceRemote this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27427Ddi(DialerDataSourceRemote dialerDataSourceRemote, C30391dr r2) {
        super(r2);
        this.this$0 = dialerDataSourceRemote;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((C26023Cqh) null, this);
    }
}
