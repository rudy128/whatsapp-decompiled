package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.AbO  reason: case insensitive filesystem */
public class C20908AbO implements B9H {
    public final int A00;
    public final Object A01;

    public C20908AbO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CCh(C29621ca r5) {
        C20284AEs A02;
        AnonymousClass1QS r0;
        C29621ca A0K;
        C29621ca A0K2;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                A5D a5d = (A5D) obj;
                C29621ca A0K3 = r5.A0K("pay");
                C17960vV.A07(A0K3);
                C29621ca A0K4 = A0K3.A0K("merchant");
                C17960vV.A07(A0K4);
                A02 = C170278pb.A02(a5d.A02, new AnonymousClass8pZ(), A0K4);
                r0 = a5d.A04;
                break;
            case 1:
                BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) obj;
                C29621ca A0K5 = r5.A0K("pay");
                if (A0K5 != null && (A0K = A0K5.A0K("card")) != null) {
                    C20284AEs A022 = C170278pb.A02(brazilPaymentActivity.A08, new AnonymousClass8pT(), A0K);
                    brazilPaymentActivity.A0Q.A01().A03((C22442B7y) null, A022);
                    brazilPaymentActivity.A0N.A0K(C108965cb.A0s(A022));
                    brazilPaymentActivity.A0F.A0C();
                    return;
                }
                return;
            default:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) obj;
                C29621ca A0K6 = r5.A0K("pay");
                if (A0K6 != null && (A0K2 = A0K6.A0K("card")) != null) {
                    A02 = C170278pb.A02(brazilPaymentCardDetailsActivity.A00, new AnonymousClass8pT(), A0K2);
                    r0 = brazilPaymentCardDetailsActivity.A0A;
                    break;
                } else {
                    return;
                }
        }
        r0.A01().A03((C22442B7y) null, A02);
    }
}
