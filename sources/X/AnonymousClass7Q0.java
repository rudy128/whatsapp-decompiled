package X;

import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7Q0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q0 implements Runnable {
    public final /* synthetic */ C136356tg A00;
    public final /* synthetic */ FlowsWebBottomSheetContainer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void run() {
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        C136356tg r1 = this.A00;
        String str3 = this.A04;
        AnonymousClass00H r0 = flowsWebBottomSheetContainer.A0K;
        if (r0 != null) {
            int i = r1.A01;
            ((C139346yg) r0.get()).A01(r1.A02, str, str2, str3, new C158067zg(flowsWebBottomSheetContainer), i, r1.A06);
            return;
        }
        C18070vi.A11("flowsMediaPicker");
        throw null;
    }

    public /* synthetic */ AnonymousClass7Q0(C136356tg r1, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, String str, String str2, String str3) {
        this.A01 = flowsWebBottomSheetContainer;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A04 = str3;
    }
}
