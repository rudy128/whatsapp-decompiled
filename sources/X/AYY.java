package X;

import android.content.DialogInterface;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

public class AYY implements BDs {
    public final /* synthetic */ AZZ A00;

    public AYY(AZZ azz) {
        this.A00 = azz;
    }

    public void Bi3(A7B a7b, Integer num) {
        this.A00.A05.A0O.A02.A01(a7b, num, "pay-precheck");
        BtH(a7b);
    }

    public Integer Bi6() {
        return this.A00.A05.A0O.A02.A00("pay-precheck");
    }

    public void BiO(A7B a7b, Integer num) {
        this.A00.A05.A0O.A02.A01(a7b, num, "get-provider-key");
    }

    public void BiP(Integer num) {
        this.A00.A05.A0O.A04(num, "get-provider-key");
    }

    public void BtH(A7B a7b) {
        ADT A002;
        C20751AXg aXg;
        int i;
        DialogInterface.OnDismissListener a9v;
        String str;
        C20159A9v a9v2;
        C20160A9w a9w;
        AZZ azz = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = azz.A04;
        pinBottomSheetDialogFragment.A2M();
        BrazilPaymentActivity brazilPaymentActivity = azz.A05;
        brazilPaymentActivity.A0O.A05("error_code", (long) a7b.A00, brazilPaymentActivity.A00);
        int i2 = a7b.A00;
        switch (i2) {
            case 454:
                C29621ca r0 = a7b.A04;
                if (!(r0 == null || (A002 = C196789ve.A00(r0)) == null)) {
                    brazilPaymentActivity.A0D.A05(AnonymousClass9RN.A00(brazilPaymentActivity.A05, A002));
                }
                BrazilPaymentActivity.A0u(pinBottomSheetDialogFragment, brazilPaymentActivity);
                return;
            case 1440:
                pinBottomSheetDialogFragment.A2O(a7b.A01, 2131755316);
                return;
            case 1441:
                AnonymousClass8BX.A1E(pinBottomSheetDialogFragment, a7b.A02);
                return;
            case 2826048:
                C20153A9p a9p = new C20153A9p(pinBottomSheetDialogFragment, this, 17);
                C20160A9w A003 = C20160A9w.A00(pinBottomSheetDialogFragment, 10);
                String string = brazilPaymentActivity.getString(2131887423);
                String string2 = brazilPaymentActivity.getString(2131887422);
                C73203Rj A004 = AnonymousClass4a6.A00(brazilPaymentActivity);
                A004.A0Z(a9p, 2131893868);
                A004.A0O(A003);
                if (string2 == null) {
                    A004.A0S(string);
                } else {
                    A004.setTitle(string);
                    A004.A0S(string2);
                }
                AnonymousClass3MY.A1G(A004);
                String string3 = brazilPaymentActivity.A02.getString(2131887422);
                BD4 bd4 = brazilPaymentActivity.A0L;
                C20112A7u A02 = C20112A7u.A02();
                A02.A07("product_flow", "p2m");
                A02.A07("dialog_text", string3);
                C20087A6p.A02(A02, bd4, (Integer) null, "payment_disabled_alert", (String) null, 0);
                return;
            case 2896003:
            case 2896004:
                C20087A6p.A03(C20087A6p.A00(brazilPaymentActivity.A05, (AnonymousClass1KN) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0L, "incentive_unavailable", "payment_confirm_prompt");
                aXg = brazilPaymentActivity.A0C;
                i = a7b.A00;
                a9v = new C20159A9v(pinBottomSheetDialogFragment, this, 3);
                str = null;
                a9v2 = null;
                a9w = null;
                break;
            default:
                if (i2 == 444 || i2 == 478) {
                    brazilPaymentActivity.A0J.A01.A02("FB", "PIN");
                }
                aXg = brazilPaymentActivity.A0C;
                i = a7b.A00;
                str = brazilPaymentActivity.A05.A0I(brazilPaymentActivity.A06.A01(brazilPaymentActivity.A0J));
                a9v2 = new C20159A9v(pinBottomSheetDialogFragment, this, 4);
                a9v = C20160A9w.A00(pinBottomSheetDialogFragment, 11);
                a9w = C20160A9w.A00(pinBottomSheetDialogFragment, 12);
                break;
        }
        aXg.A00(brazilPaymentActivity, a9v2, a9v, a9w, str, i).show();
    }

    public void C3n(String str, Integer num) {
        AZZ azz = this.A00;
        azz.A04.A2M();
        BrazilPaymentActivity brazilPaymentActivity = azz.A05;
        brazilPaymentActivity.A0O.A04(num, "pay-precheck");
        String str2 = azz.A06;
        AnonymousClass1KN r5 = azz.A01;
        C20284AEs aEs = azz.A02;
        String str3 = azz.A07;
        int i = 1;
        if (brazilPaymentActivity.A4o(r5, brazilPaymentActivity.A01) == null) {
            i = 0;
        }
        brazilPaymentActivity.A4p(azz.A00, r5, aEs, azz.A03, str2, str, str3, i);
    }
}
