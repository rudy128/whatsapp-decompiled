package X;

import com.whatsapp.passkeys.PasskeyServerApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyServerApiImpl", f = "PasskeyServerApiImpl.kt", i = {0}, l = {122}, m = "passkeyDelete", n = {"this"}, s = {"L$0"})
/* renamed from: X.Anp  reason: case insensitive filesystem */
public final class C21660Anp extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyServerApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21660Anp(PasskeyServerApiImpl passkeyServerApiImpl, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyServerApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03(this);
    }
}
