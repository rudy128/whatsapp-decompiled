package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.ArrayList;

/* renamed from: X.A9b  reason: case insensitive filesystem */
public class C20140A9b implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C20140A9b(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, AnonymousClass21L r2, String str, int i) {
        this.A00 = i;
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A03 = str;
        this.A02 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (this.A00 != 0) {
            P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A01;
            String str2 = this.A03;
            String A0F = C18070vi.A0F(p2mLiteOrderDetailsActivity, 2131899304);
            C20112A7u A002 = C196449v5.A00();
            A002.A07("payments_error_code", "10755");
            A002.A07("payments_error_text", A0F);
            P2mLiteOrderDetailsActivity.A0Q(A002, p2mLiteOrderDetailsActivity, (AnonymousClass21L) this.A02, 158, "error_dialog", str2, 1);
            C132216mP r1 = p2mLiteOrderDetailsActivity.A00;
            if (r1 != null) {
                AnonymousClass1MB r0 = p2mLiteOrderDetailsActivity.A0A;
                if (r0 != null) {
                    p2mLiteOrderDetailsActivity.startActivity(r1.A00.A00((Bundle) null, (AnonymousClass770) null, (Integer) null, "payments-blocked", (String) null, (ArrayList) null, (ArrayList) null, r0.A00()));
                    return;
                }
                str = "supportGatingUtils";
            } else {
                str = "sendFeedback";
            }
            C18070vi.A11(str);
            throw null;
        }
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = (P2mLiteOrderDetailsActivity) this.A01;
        String str3 = this.A03;
        String A0F2 = C18070vi.A0F(p2mLiteOrderDetailsActivity2, 2131899304);
        C20112A7u A003 = C196449v5.A00();
        A003.A07("payments_error_code", "10755");
        A003.A07("payments_error_text", A0F2);
        P2mLiteOrderDetailsActivity.A0Q(A003, p2mLiteOrderDetailsActivity2, (AnonymousClass21L) this.A02, 115, "error_dialog", str3, 1);
    }
}
