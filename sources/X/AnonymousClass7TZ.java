package X;

import com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthT1T2TokensFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthT1T2TokensFetcher", f = "WebAuthT1T2TokensFetcher.kt", i = {}, l = {30}, m = "awaitFetchTokenPair", n = {}, s = {})
/* renamed from: X.7TZ  reason: invalid class name */
public final class AnonymousClass7TZ extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WebAuthT1T2TokensFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TZ(WebAuthT1T2TokensFetcher webAuthT1T2TokensFetcher, C30391dr r2) {
        super(r2);
        this.this$0 = webAuthT1T2TokensFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
