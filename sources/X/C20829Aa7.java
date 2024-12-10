package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.Aa7  reason: case insensitive filesystem */
public class C20829Aa7 implements BDA {
    public final int A00;
    public final Object A01;

    public C20829Aa7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ View BMa(LayoutInflater layoutInflater) {
        if (this.A00 == 0) {
            return null;
        }
        AnonymousClass933 r3 = (AnonymousClass933) this.A01;
        if (r3.A0I.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(2131625656, (ViewGroup) null);
        AnonymousClass8BU.A15(inflate, 2131429075, AnonymousClass3Ma.A00(r3, 2130971195, 2131102531));
        return inflate;
    }

    public /* synthetic */ View BRv(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        if (this.A00 != 0) {
            return C20080A6g.A00(layoutInflater, frameLayout, ((AnonymousClass933) this.A01).A03, 0, false);
        }
        return null;
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        if (this.A00 == 0 || !aEs.equals(((AnonymousClass933) this.A01).A03)) {
            return 0;
        }
        return 2131231805;
    }

    public /* synthetic */ String BUu(C20284AEs aEs) {
        if (this.A00 != 0) {
            return A56.A00(aEs, ((AnonymousClass933) this.A01).A0H);
        }
        return null;
    }

    public void Bl3() {
        if (this.A00 != 0) {
            AnonymousClass91U r3 = (AnonymousClass91U) this.A01;
            Intent A07 = AnonymousClass1LU.A07(r3);
            A07.putExtra("extra_payments_entry_type", 6);
            A07.putExtra("extra_is_first_payment_method", !AnonymousClass8BR.A1P(r3));
            A07.putExtra("extra_skip_value_props_display", AnonymousClass8BR.A1P(r3));
            r3.A3q(A07, false);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A01;
        String A012 = A5Y.A01(brazilConfirmReceivePaymentFragment.A0E, "p2p_context", false);
        Intent A03 = AnonymousClass8BS.A03(brazilConfirmReceivePaymentFragment.A1B());
        if (A012 == null) {
            A012 = "brpay_p_add_card";
        }
        A03.putExtra("screen_name", A012);
        AnonymousClass8k7.A03(A03, "onboarding_context", "p2p_context");
        brazilConfirmReceivePaymentFragment.A1k(A03);
    }

    public /* synthetic */ void Bl9() {
        Intent intent;
        if (this.A00 != 0) {
            AnonymousClass933 r3 = (AnonymousClass933) this.A01;
            if (r3.A0I.size() == 1) {
                AnonymousClass8pS r0 = (AnonymousClass8pS) AnonymousClass8BR.A0Q(r3.A0I, 0).A08;
                if (r0 == null || C170278pb.A03(r0)) {
                    intent = AnonymousClass8BW.A09(r3, AnonymousClass8BR.A0Q(r3.A0I, 0), IndiaUpiCheckBalanceActivity.class);
                } else {
                    r3.A5K(r3.A0B, "ConfirmPaymentFragment");
                    C73203Rj A002 = AnonymousClass4a6.A00(r3);
                    AnonymousClass8BW.A19(A002);
                    C20154A9q.A00(A002, r3, 11, 2131899101);
                    A002.A0X((DialogInterface.OnClickListener) null, 2131899286);
                    A002.A00.A0O(C20160A9w.A00(r3, 13));
                    AnonymousClass3MY.A1G(A002);
                    return;
                }
            } else {
                List list = r3.A0I;
                intent = AnonymousClass8BR.A07(r3, IndiaUpiPaymentMethodSelectionActivity.class);
                intent.putExtra("bank_accounts", (Serializable) list);
            }
            r3.CNh(intent, 1015);
        }
    }

    public /* synthetic */ boolean CMP() {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        if (this.A00 != 0) {
            C20063A5m.A00(aEs, paymentMethodRow, ((AnonymousClass933) this.A01).A0F);
        } else if (A8e.A08(aEs)) {
            ((BrazilConfirmReceivePaymentFragment) this.A01).A0D.A02(aEs, paymentMethodRow);
        }
    }

    public /* synthetic */ String BUt(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ void BWm() {
    }

    public /* synthetic */ void Bm8() {
    }

    public /* synthetic */ boolean CLr(C20284AEs aEs) {
        return false;
    }

    public /* synthetic */ boolean CMF() {
        return true;
    }
}
