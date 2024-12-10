package X;

import com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow", f = "AvatarExpressionsDataFlow.kt", i = {0}, l = {250}, m = "checkShouldShowSquidUpsell", n = {"this"}, s = {"L$0"})
/* renamed from: X.7Tr  reason: invalid class name and case insensitive filesystem */
public final class C147577Tr extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147577Tr(AvatarExpressionsDataFlow avatarExpressionsDataFlow, C30391dr r2) {
        super(r2);
        this.this$0 = avatarExpressionsDataFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
