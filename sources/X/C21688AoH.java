package X;

import com.whatsapp.registration.passkey.PasskeyUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkey.PasskeyUseCase", f = "PasskeyUseCase.kt", i = {0, 0, 1, 1, 2, 2}, l = {82, 91, 100, 110, 120}, m = "onRegisterEntrypointResponse", n = {"this", "credentialId", "this", "credentialId", "this", "credentialId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.AoH  reason: case insensitive filesystem */
public final class C21688AoH extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21688AoH(PasskeyUseCase passkeyUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PasskeyUseCase.A00((C188779hy) null, this.this$0, (C194669s6) null, this);
    }
}
