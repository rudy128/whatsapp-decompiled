package X;

import android.net.Network;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.silentauth.VerifySilentAuthUseCase", f = "SilentAuthUseCase.kt", i = {0, 0, 1, 1}, l = {164, 167, 178, 180}, m = "onVerifySilentAuthUsingCarrierApi", n = {"this", "params", "this", "params"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.AoJ  reason: case insensitive filesystem */
public final class C21690AoJ extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifySilentAuthUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21690AoJ(VerifySilentAuthUseCase verifySilentAuthUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = verifySilentAuthUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VerifySilentAuthUseCase.A00((Network) null, (C194109rB) null, this.this$0, (String) null, this);
    }
}
