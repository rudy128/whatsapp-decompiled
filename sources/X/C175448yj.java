package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.8yj  reason: invalid class name and case insensitive filesystem */
public class C175448yj extends C20992Ack {
    public final /* synthetic */ C33661jB A00;
    public final /* synthetic */ C31061ex A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175448yj(Context context, C33661jB r2, C33711jG r3, C31061ex r4, AnonymousClass119 r5, boolean z, boolean z2) {
        super(context, r3, r5);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
    }

    public void A04(A7B a7b) {
        AnonymousClass8BX.A1C(this.A01.A0D, a7b, "TosV2 onRequestError: ", AnonymousClass000.A10());
        this.A00.C3L(a7b);
    }

    public void A05(A7B a7b) {
        AnonymousClass8BX.A1C(this.A01.A0D, a7b, "TosV2 onResponseError: ", AnonymousClass000.A10());
        this.A00.C3X(a7b);
    }

    public void A06(C29621ca r9) {
        C29621ca A0K = r9.A0K("accept_pay");
        C176008zd r3 = new C176008zd();
        boolean z = false;
        if (A0K != null) {
            String A0Q = A0K.A0Q("consumer", (String) null);
            String A0Q2 = A0K.A0Q("merchant", (String) null);
            if ((!this.A02 || "1".equals(A0Q)) && (!this.A03 || "1".equals(A0Q2))) {
                z = true;
            }
            r3.A02 = z;
            r3.A00 = AnonymousClass8BU.A1T(A0K, "outage", "1");
            r3.A01 = AnonymousClass8BU.A1T(A0K, "sandbox", "1");
            if (!TextUtils.isEmpty(A0Q) && !TextUtils.isEmpty("tos_no_wallet")) {
                AnonymousClass1QL r2 = this.A01.A06;
                AnonymousClass1QM A04 = r2.A04("tos_no_wallet");
                if ("1".equals(A0Q)) {
                    r2.A0A(A04);
                } else {
                    r2.A09(A04);
                }
            }
            if (!TextUtils.isEmpty(A0Q2) && !TextUtils.isEmpty("tos_merchant")) {
                C31051ew r22 = this.A01.A07;
                AnonymousClass1QM A042 = r22.A04("tos_merchant");
                if ("1".equals(A0Q2)) {
                    r22.A0A(A042);
                } else {
                    r22.A09(A042);
                }
            }
            this.A01.A08.A0P(r3.A01);
        } else {
            r3.A02 = false;
        }
        this.A00.C3Y(r3);
    }
}
