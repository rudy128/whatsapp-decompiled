package X;

import android.app.Activity;
import com.whatsapp.passkeys.PasskeyAndroidApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyAndroidApiImpl", f = "PasskeyAndroidApiImpl.kt", i = {}, l = {332}, m = "loginWithPasskey", n = {}, s = {})
/* renamed from: X.AnE  reason: case insensitive filesystem */
public final class C21623AnE extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyAndroidApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21623AnE(PasskeyAndroidApiImpl passkeyAndroidApiImpl, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyAndroidApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A07((Activity) null, (String) null, this);
    }
}
