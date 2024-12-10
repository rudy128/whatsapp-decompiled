package X;

import android.os.Bundle;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel", f = "WaFlowsViewModel.kt", i = {0}, l = {166}, m = "processFlowDataForWebView", n = {"isSuccess"}, s = {"L$0"})
/* renamed from: X.7Tz  reason: invalid class name and case insensitive filesystem */
public final class C147657Tz extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WaFlowsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147657Tz(WaFlowsViewModel waFlowsViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = waFlowsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0T((Bundle) null, (UserJid) null, this);
    }
}
