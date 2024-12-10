package X;

import android.content.Intent;
import com.whatsapp.inappsupport.ui.SupportAiActivity;

/* renamed from: X.5Sy  reason: invalid class name and case insensitive filesystem */
public final class C105685Sy extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SupportAiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105685Sy(SupportAiActivity supportAiActivity) {
        super(1);
        this.this$0 = supportAiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1BI r4 = (AnonymousClass1BI) obj;
        C17900vP.A0Y(r4, "SupportAiActivity/openSupportChat/", AnonymousClass000.A10());
        SupportAiActivity supportAiActivity = this.this$0;
        AnonymousClass1LU r0 = supportAiActivity.A00;
        if (r0 != null) {
            Intent A06 = AnonymousClass3MY.A06(supportAiActivity, r0, r4);
            C18070vi.A0X(A06);
            this.this$0.A3q(A06, true);
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }
}
