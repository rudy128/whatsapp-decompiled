package X;

import android.app.Activity;
import com.whatsapp.passkeys.PasskeyAndroidApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyAndroidApiImpl", f = "PasskeyAndroidApiImpl.kt", i = {0}, l = {357}, m = "executePasskeyLogin", n = {"this"}, s = {"L$0"})
/* renamed from: X.Anl  reason: case insensitive filesystem */
public final class C21656Anl extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyAndroidApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21656Anl(PasskeyAndroidApiImpl passkeyAndroidApiImpl, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyAndroidApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PasskeyAndroidApiImpl.A03((Activity) null, this.this$0, (String) null, this);
    }
}
