package X;

import android.app.Activity;
import com.whatsapp.registration.passkey.PasskeyVerifier;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkey.PasskeyVerifier", f = "PasskeyVerifier.kt", i = {0, 0, 0}, l = {37}, m = "onPasskeyChallengeReceived", n = {"this", "callback", "passkeyApiRequestStartTime"}, s = {"L$0", "L$1", "J$0"})
/* renamed from: X.AoT  reason: case insensitive filesystem */
public final class C21700AoT extends C30421du {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyVerifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21700AoT(PasskeyVerifier passkeyVerifier, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyVerifier;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Activity) null, (String) null, this, (AnonymousClass1OS) null);
    }
}
