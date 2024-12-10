package X;

import android.view.View;
import com.whatsapp.calling.callhistory.calllog.CallLogActivityV2;

/* renamed from: X.5Ua  reason: invalid class name and case insensitive filesystem */
public final class C105965Ua extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass4SR $uiState;
    public final /* synthetic */ CallLogActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105965Ua(CallLogActivityV2 callLogActivityV2, AnonymousClass4SR r3) {
        super(1);
        this.$uiState = r3;
        this.this$0 = callLogActivityV2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C18070vi.A0d(view, 0);
        AnonymousClass1BI r1 = ((AnonymousClass1E7) C29431cG.A0b(this.$uiState.A07)).A0J;
        if (r1 != null) {
            AnonymousClass3MY.A0R(this.this$0).A0U(view, r1);
        }
        return C27621Wu.A00;
    }
}
