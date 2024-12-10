package X;

import com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper", f = "CoroutineDirectConnectionHelper.kt", i = {0, 0, 0}, l = {42, 43}, m = "generateDirectConnectionEncryptedInfo", n = {"this", "jid", "postcode"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.AoL  reason: case insensitive filesystem */
public final class C21692AoL extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoroutineDirectConnectionHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21692AoL(CoroutineDirectConnectionHelper coroutineDirectConnectionHelper, C30391dr r2) {
        super(r2);
        this.this$0 = coroutineDirectConnectionHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((UserJid) null, (String) null, this);
    }
}
