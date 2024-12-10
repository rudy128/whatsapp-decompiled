package X;

import com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper", f = "CompanionWafflePingHelper.kt", i = {0}, l = {51}, m = "ping", n = {"this"}, s = {"L$0"})
/* renamed from: X.7UF  reason: invalid class name */
public final class AnonymousClass7UF extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CompanionWafflePingHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UF(CompanionWafflePingHelper companionWafflePingHelper, C30391dr r2) {
        super(r2);
        this.this$0 = companionWafflePingHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
