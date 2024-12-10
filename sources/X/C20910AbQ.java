package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.AbQ  reason: case insensitive filesystem */
public class C20910AbQ implements B9H {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20910AbQ(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A00 = i;
        this.A01 = brazilPayBloksActivity;
        this.A02 = r1;
    }

    public final void CCh(C29621ca r7) {
        C29621ca A0K;
        C29621ca A0K2;
        if (this.A00 != 0) {
            BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A01;
            Object obj = this.A02;
            C29621ca A0K3 = r7.A0K("pay");
            if (A0K3 != null && (A0K2 = A0K3.A0K("card")) != null) {
                brazilPayBloksActivity.A0D.A01().A03(new ARF(obj, 3), C170278pb.A02(brazilPayBloksActivity.A02, new AnonymousClass8pT(), A0K2));
                return;
            }
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = (BrazilPayBloksActivity) this.A01;
        Object obj2 = this.A02;
        C29621ca A0K4 = r7.A0K("pay");
        if (A0K4 != null && (A0K = A0K4.A0K("card")) != null) {
            C20284AEs A022 = C170278pb.A02(brazilPayBloksActivity2.A02, new AnonymousClass8pT(), A0K);
            brazilPayBloksActivity2.A0D.A01().A04(new ARF(obj2, 4), A022, "p2m_context");
            brazilPayBloksActivity2.A0A.A0K(C108965cb.A0s(A022));
            brazilPayBloksActivity2.A09.A0C();
        }
    }
}
