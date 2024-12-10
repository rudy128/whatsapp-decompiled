package X;

import com.whatsapp.passkeys.PasskeyServerApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyServerApiImpl", f = "PasskeyServerApiImpl.kt", i = {0, 0}, l = {155}, m = "sendIq", n = {"iqId", "sendType"}, s = {"L$0", "I$0"})
/* renamed from: X.AoF  reason: case insensitive filesystem */
public final class C21686AoF extends C30421du {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyServerApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21686AoF(PasskeyServerApiImpl passkeyServerApiImpl, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyServerApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PasskeyServerApiImpl.A01(this.this$0, (String) null, this, (C22821Di) null, 0, 0);
    }
}
