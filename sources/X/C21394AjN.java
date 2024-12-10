package X;

import android.content.Context;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.AjN  reason: case insensitive filesystem */
public class C21394AjN implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    public C21394AjN(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = str;
        this.A07 = str2;
    }

    public void run() {
        switch (this.A00) {
            case 0:
                Iterator it = ((DGH) this.A01).A00.iterator();
                while (it.hasNext()) {
                    D40 d40 = (D40) this.A02;
                    ((C28613EAh) it.next()).C0l((CA0) this.A04, (C25951CpJ) this.A05, d40, (D49) this.A03, this.A06, this.A07);
                }
                return;
            case 1:
                C188029gl r15 = (C188029gl) this.A01;
                AW0 aw0 = (AW0) this.A02;
                AnonymousClass9YK r14 = (AnonymousClass9YK) this.A03;
                String str = this.A06;
                String str2 = this.A07;
                Jid jid = (Jid) this.A04;
                Context context = (Context) this.A05;
                UserJid A012 = C60432o1.A01((AnonymousClass190) null, r15.A02, r15.A03, aw0.A0D, (String) null);
                if (A012 == null) {
                    String A013 = AnonymousClass1QE.A01("BrazilCancelUnilateralAction", "lidCompatibleJid is null");
                    Log.e(A013);
                    A7B.A00().A07 = A013;
                    BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = r14.A00;
                    brazilPaymentTransactionDetailActivity.CEx();
                    C108965cb.A18(brazilPaymentTransactionDetailActivity, 2131887913, 2131893867);
                    return;
                }
                String str3 = aw0.A0K;
                String str4 = aw0.A0L;
                C72473Md.A1M(str3, str4, str2, 3);
                C29591cX A0Y = C108955ca.A0Y();
                AnonymousClass8BY.A13(A0Y);
                boolean A1X = AnonymousClass8BY.A1X(A0Y, str);
                C29591cX A0R = AnonymousClass8BS.A0R();
                C29591cX.A01(A0R, "action", "br-cancel-unilateral");
                AnonymousClass8BT.A1E(A012, A0R, "receiver");
                if (AnonymousClass8BV.A1Y(str3, 1, A1X)) {
                    C29591cX.A01(A0R, "transaction_id", str3);
                }
                if (AnonymousClass8BU.A1Z(str4, 0, A1X)) {
                    C29591cX.A01(A0R, "message_id", str4);
                }
                if (AnonymousClass8BV.A1Y(str2, 1, A1X)) {
                    C29591cX.A01(A0R, "nonce", str2);
                }
                if (jid != null) {
                    AnonymousClass8BT.A1E(jid, A0R, "group");
                }
                C29621ca A002 = C29591cX.A00(A0R, A0Y);
                r15.A04.A0H(new C175428yh(context, AnonymousClass8BR.A0a(r15.A06), r15.A00, r14, r15, 6), A002, str, 0);
                return;
            case 2:
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A01;
                String str5 = this.A06;
                String str6 = this.A07;
                P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment = (P2mLiteConfirmLegalNameBottomSheetFragment) this.A02;
                PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A03;
                PaymentBottomSheet paymentBottomSheet2 = (PaymentBottomSheet) this.A04;
                AnonymousClass21L r8 = (AnonymousClass21L) this.A05;
                C18070vi.A0p(str6, p2mLiteConfirmLegalNameBottomSheetFragment, paymentBottomSheet);
                A2C a2c = p2mLiteOrderDetailsActivity.A0G;
                if (a2c != null) {
                    a2c.A03(new C20794AYx(p2mLiteConfirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, paymentBottomSheet2, r8, str6), str5, "p2m-lite-buyer-check");
                    return;
                } else {
                    C18070vi.A11("paymentsComplianceManager");
                    throw null;
                }
            default:
                C87904Xn r2 = (C87904Xn) this.A01;
                Object obj = this.A05;
                r2.A01((UserJid) this.A02);
                r2.A00.A0J(new C146767Qn(obj, 45));
                return;
        }
    }
}
