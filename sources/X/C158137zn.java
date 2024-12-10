package X;

import android.webkit.ValueCallback;
import com.whatsapp.flows.webview.view.FlowsWebViewFragment;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import org.json.JSONArray;

/* renamed from: X.7zn  reason: invalid class name and case insensitive filesystem */
public final class C158137zn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158137zn(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C110125ey r4;
        C22821Di r1;
        String A0H;
        StringBuilder A10;
        String str;
        AnonymousClass6TO r6 = (AnonymousClass6TO) obj;
        if (r6 instanceof C1187064p) {
            r4 = this.this$0.A00;
            if (r4 != null) {
                AnonymousClass7zP r12 = new AnonymousClass7zP(((C1187064p) r6).A00);
                JSONArray jSONArray = new JSONArray();
                r12.invoke(jSONArray);
                A0H = C18070vi.A0H(jSONArray);
                A10 = AnonymousClass000.A10();
                str = "window.media_add(";
            }
            return C27621Wu.A00;
        }
        if (r6 instanceof C1187164q) {
            C136356tg r3 = ((C1187164q) r6).A00;
            if (r3.A05) {
                WaFlowsViewModel A25 = this.this$0.A25();
                A25.A0R.put(r3.A04, r3);
            }
            r4 = this.this$0.A00;
            if (r4 != null) {
                r1 = new AnonymousClass7zS(r3);
            }
            return C27621Wu.A00;
        } else if (r6 instanceof C1187264r) {
            r4 = this.this$0.A00;
            if (r4 != null) {
                r1 = new AnonymousClass7zV(((C1187264r) r6).A00);
            }
            return C27621Wu.A00;
        } else {
            if ((r6 instanceof C1187364s) && (r4 = this.this$0.A00) != null) {
                r1 = new AnonymousClass7zZ(((C1187364s) r6).A00);
            }
            return C27621Wu.A00;
        }
        JSONArray jSONArray2 = new JSONArray();
        r1.invoke(jSONArray2);
        A0H = C18070vi.A0H(jSONArray2);
        A10 = AnonymousClass000.A10();
        str = "window.media_state(";
        A10.append(str);
        r4.evaluateJavascript(C17900vP.A0B(A0H, A10), (ValueCallback) null);
        return C27621Wu.A00;
    }
}
