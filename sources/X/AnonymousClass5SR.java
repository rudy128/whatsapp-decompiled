package X;

import com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState;

/* renamed from: X.5SR  reason: invalid class name */
public final class AnonymousClass5SR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsMarketingDisclosureState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SR(FlowsMarketingDisclosureState flowsMarketingDisclosureState) {
        super(1);
        this.this$0 = flowsMarketingDisclosureState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U r4 = (AnonymousClass84U) obj;
        C18070vi.A0d(r4, 0);
        AnonymousClass4X2 A00 = this.this$0.A03.A00();
        r4.A01("title_text", this.this$0.A00.getString(A00.A07));
        r4.A01("data_row_one_text", this.this$0.A00.getString(A00.A00));
        r4.A01("data_row_two_text", this.this$0.A00.getString(A00.A04));
        r4.A01("data_row_three_text", this.this$0.A00.getString(A00.A02));
        r4.A01("learn_more_url", A00.A0C);
        r4.A01("disclosure_description", this.this$0.A00.getString(A00.A05));
        Integer num = A00.A09;
        if (num != null) {
            FlowsMarketingDisclosureState flowsMarketingDisclosureState = this.this$0;
            r4.A01("disclosure_description_text_icon", flowsMarketingDisclosureState.A00.getString(num.intValue()));
        }
        return C27621Wu.A00;
    }
}
