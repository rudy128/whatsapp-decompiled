package X;

import android.app.Activity;
import com.whatsapp.passkeys.PasskeyAndroidApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyAndroidApiImpl", f = "PasskeyAndroidApiImpl.kt", i = {0}, l = {104}, m = "createPasskey", n = {"prfInput"}, s = {"L$0"})
/* renamed from: X.Anj  reason: case insensitive filesystem */
public final class C21654Anj extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyAndroidApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21654Anj(PasskeyAndroidApiImpl passkeyAndroidApiImpl, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyAndroidApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A06((Activity) null, (C193169pe) null, (String) null, this);
    }
}
