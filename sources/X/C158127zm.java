package X;

import android.webkit.ValueCallback;
import com.whatsapp.flows.webview.view.FlowsWebViewFragment;

/* renamed from: X.7zm  reason: invalid class name and case insensitive filesystem */
public final class C158127zm extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158127zm(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C110125ey r2 = this.this$0.A00;
        if (r2 != null) {
            r2.evaluateJavascript("window.navigateBack()", (ValueCallback) null);
        }
        return C27621Wu.A00;
    }
}
