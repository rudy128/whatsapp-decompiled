package X;

import android.app.Activity;
import com.whatsapp.passkeys.PasskeyAndroidApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyAndroidApiImpl", f = "PasskeyAndroidApiImpl.kt", i = {}, l = {498}, m = "evaluatePrfForExistingPasskey", n = {}, s = {})
/* renamed from: X.AnD  reason: case insensitive filesystem */
public final class C21622AnD extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyAndroidApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21622AnD(PasskeyAndroidApiImpl passkeyAndroidApiImpl, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyAndroidApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05((Activity) null, (C193139pb) null, (C193169pe) null, this);
    }
}
