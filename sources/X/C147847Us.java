package X;

import com.whatsapp.snapl.client.SnaplOhaiHttpClient;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.snapl.client.SnaplOhaiHttpClient", f = "SnaplOhaiHttpClient.kt", i = {0, 0, 1, 1, 1}, l = {52, 140}, m = "upload", n = {"this", "playerPayloads", "this", "formDataBuilder", "postData"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: X.7Us  reason: invalid class name and case insensitive filesystem */
public final class C147847Us extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SnaplOhaiHttpClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147847Us(SnaplOhaiHttpClient snaplOhaiHttpClient, C30391dr r2) {
        super(r2);
        this.this$0 = snaplOhaiHttpClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((List) null, this);
    }
}
