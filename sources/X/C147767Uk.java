package X;

import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView", f = "FlowsInitialLoadingView.kt", i = {0, 0, 0}, l = {113}, m = "setupFooter", n = {"this", "businessJid", "articleId"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.7Uk  reason: invalid class name and case insensitive filesystem */
public final class C147767Uk extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsInitialLoadingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147767Uk(FlowsInitialLoadingView flowsInitialLoadingView, C30391dr r2) {
        super(r2);
        this.this$0 = flowsInitialLoadingView;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((UserJid) null, (String) null, this, false);
    }
}
