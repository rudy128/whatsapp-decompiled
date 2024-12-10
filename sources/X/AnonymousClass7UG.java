package X;

import com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher", f = "WebAuthAccessTokenFetcher.kt", i = {0}, l = {41, 62}, m = "awaitExchangeTokenAndBlobForAccessToken", n = {"this"}, s = {"L$0"})
/* renamed from: X.7UG  reason: invalid class name */
public final class AnonymousClass7UG extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WebAuthAccessTokenFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UG(WebAuthAccessTokenFetcher webAuthAccessTokenFetcher, C30391dr r2) {
        super(r2);
        this.this$0 = webAuthAccessTokenFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, (String) null, this);
    }
}
