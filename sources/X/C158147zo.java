package X;

import android.webkit.ValueCallback;
import com.whatsapp.flows.webview.view.FlowsWebViewFragment;

/* renamed from: X.7zo  reason: invalid class name and case insensitive filesystem */
public final class C158147zo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158147zo(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135236rs r5 = (C135236rs) obj;
        C110125ey r3 = this.this$0.A00;
        if (r3 != null) {
            C72453Mb.A1R(r5);
            String A0H = C18070vi.A0H(AnonymousClass84U.A00(new C158007za(r5)));
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("window.onNativeComponentValueChange(");
            r3.evaluateJavascript(C17900vP.A0B(A0H, A10), (ValueCallback) null);
        }
        return C27621Wu.A00;
    }
}
