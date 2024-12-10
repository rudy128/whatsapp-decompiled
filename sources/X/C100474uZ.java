package X;

import com.whatsapp.passkeys.PasskeyCreateEducationScreen;
import com.whatsapp.passkeys.PasskeyFacade;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyCreateEducationScreen", f = "PasskeyCreateEducationScreen.kt", i = {0}, l = {280}, m = "createPasskey", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uZ  reason: invalid class name and case insensitive filesystem */
public final class C100474uZ extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyCreateEducationScreen this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100474uZ(PasskeyCreateEducationScreen passkeyCreateEducationScreen, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyCreateEducationScreen;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PasskeyCreateEducationScreen.A03(this.this$0, (PasskeyFacade) null, this);
    }
}
