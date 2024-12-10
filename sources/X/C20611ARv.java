package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1;

/* renamed from: X.ARv  reason: case insensitive filesystem */
public final class C20611ARv implements BCV {
    public final /* synthetic */ A2N A00;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines A01;
    public final /* synthetic */ C195709tm A02;
    public final /* synthetic */ B9G A03;
    public final /* synthetic */ C22521BBe A04;

    public C20611ARv(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C195709tm r3, B9G b9g, C22521BBe bBe) {
        this.A01 = phoenixFlowsManagerWithCoroutines;
        this.A00 = a2n;
        this.A02 = r3;
        this.A03 = b9g;
        this.A04 = bBe;
    }

    public void Bki() {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A01;
        C20081A6h A0V = AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0K);
        String str = this.A00.A05;
        A0V.A08(str.hashCode(), 105);
        PhoenixFlowsManagerWithCoroutines.A08(phoenixFlowsManagerWithCoroutines, this.A04, "Download aborted", str);
    }

    public /* bridge */ /* synthetic */ void Bsy(Integer num) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A01;
        C20081A6h A0V = AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0K);
        String str = this.A00.A05;
        A0V.A08(str.hashCode(), 3);
        PhoenixFlowsManagerWithCoroutines.A08(phoenixFlowsManagerWithCoroutines, this.A04, "Download failed", str);
    }

    public /* bridge */ /* synthetic */ void C8h(Integer num) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A01;
        C20081A6h A0V = AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0K);
        String str = this.A00.A05;
        A0V.A08(str.hashCode(), 3);
        PhoenixFlowsManagerWithCoroutines.A08(phoenixFlowsManagerWithCoroutines, this.A04, "Download timed out", str);
    }

    public void onSuccess() {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A01;
        AnonymousClass3MX.A1Q(new PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(this.A00, phoenixFlowsManagerWithCoroutines, this.A02, this.A03, this.A04, (C30391dr) null), phoenixFlowsManagerWithCoroutines.A0R);
    }
}
