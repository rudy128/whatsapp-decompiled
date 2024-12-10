package X;

import com.whatsapp.calling.dialer.DialerDataSourceLocal;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerDataSourceLocal", f = "DialerDataSourceLocal.kt", i = {0, 0, 1, 1, 2}, l = {32, 35, 41}, m = "updateContactDetailsReadFromLocalCache", n = {"this", "$this$updateContactDetailsReadFromLocalCache_u24lambda_u240", "this", "$this$updateContactDetailsReadFromLocalCache_u24lambda_u240", "$this$updateContactDetailsReadFromLocalCache_u24lambda_u240"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* renamed from: X.Ddh  reason: case insensitive filesystem */
public final class C27426Ddh extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerDataSourceLocal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27426Ddh(DialerDataSourceLocal dialerDataSourceLocal, C30391dr r2) {
        super(r2);
        this.this$0 = dialerDataSourceLocal;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C26023Cqh) null, this);
    }
}
