package X;

import com.whatsapp.bot.home.AiHomeFetchService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeFetchService", f = "AiHomeFetchService.kt", i = {0, 0, 0, 0, 0, 2, 2, 2, 3, 3}, l = {153, 155, 161, 169, 171}, m = "requestData", n = {"this", "query", "flowCollector", "responseHandler", "isFirstLoad", "flowCollector", "responseHandler", "isFirstLoad", "flowCollector", "isFirstLoad"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "Z$0", "L$0", "Z$0"})
/* renamed from: X.7V6  reason: invalid class name */
public final class AnonymousClass7V6 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiHomeFetchService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V6(AiHomeFetchService aiHomeFetchService, C30391dr r2) {
        super(r2);
        this.this$0 = aiHomeFetchService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AiHomeFetchService.A00((AnonymousClass5WY) null, this.this$0, this, (C22821Di) null, (AnonymousClass1G2) null, false);
    }
}
