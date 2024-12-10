package X;

import android.net.Network;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.silentauth.VerifySilentAuthUseCase", f = "SilentAuthUseCase.kt", i = {0, 0, 1, 1}, l = {86, 88, 100, 102}, m = "executeSilentAuthCoverageRequest", n = {"this", "params", "this", "params"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.AoI  reason: case insensitive filesystem */
public final class C21689AoI extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifySilentAuthUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21689AoI(VerifySilentAuthUseCase verifySilentAuthUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = verifySilentAuthUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VerifySilentAuthUseCase.A01((Network) null, (C194109rB) null, this.this$0, this);
    }
}
