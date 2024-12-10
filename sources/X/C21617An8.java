package X;

import android.content.Context;
import com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager", f = "WfsNativeAuthManager.kt", i = {}, l = {180}, m = "prefetchSsoAuthData", n = {}, s = {})
/* renamed from: X.An8  reason: case insensitive filesystem */
public final class C21617An8 extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21617An8(WfsNativeAuthManager wfsNativeAuthManager, C30391dr r2) {
        super(r2);
        this.this$0 = wfsNativeAuthManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Context) null, this, (AnonymousClass1OX) null);
    }
}
