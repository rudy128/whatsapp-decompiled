package X;

import com.whatsapp.registration.passkey.PasskeyUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkey.PasskeyUseCase", f = "PasskeyUseCase.kt", i = {0, 0, 1, 1}, l = {51, 53, 64}, m = "executePasskeyVerifyCodeRequest", n = {"this", "params", "this", "params"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.AoG  reason: case insensitive filesystem */
public final class C21687AoG extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21687AoG(PasskeyUseCase passkeyUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PasskeyUseCase.A01(this.this$0, (C194669s6) null, this);
    }
}
