package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.Aa9  reason: case insensitive filesystem */
public class C20831Aa9 implements BDA {
    public final /* synthetic */ AnonymousClass91R A00;
    public final /* synthetic */ PaymentMethodsListPickerFragment A01;

    public boolean CMP() {
        return false;
    }

    public C20831Aa9(AnonymousClass91R r1, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A00 = r1;
        this.A01 = paymentMethodsListPickerFragment;
    }

    public View BMa(LayoutInflater layoutInflater) {
        return this.A00.A5F(layoutInflater);
    }

    public int BUr(C20284AEs aEs) {
        AnonymousClass91R r2 = this.A00;
        if (r2.A5e(aEs, r2.A0a) || !aEs.equals(r2.A0B)) {
            return 0;
        }
        return 2131231805;
    }

    public String BUt(C20284AEs aEs) {
        AnonymousClass91R r3 = this.A00;
        return r3.A0O.A06(aEs, r3.A0j, r3.A5e(aEs, r3.A0a));
    }

    public String BUu(C20284AEs aEs) {
        return A56.A00(aEs, this.A00.A0P);
    }

    public void BWm() {
        AnonymousClass91R r0 = this.A00;
        r0.A0S.BiL((Integer) null, "available_payment_methods_prompt", r0.A0g, 0);
    }

    public void Bl3() {
        AnonymousClass91R r2 = this.A00;
        r2.A4t(57, "available_payment_methods_prompt");
        if (TextUtils.isEmpty(r2.A0a) || !r2.A0O.A0A(AXS.A02(r2))) {
            r2.A5b((String) null);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01.A0E;
        paymentBottomSheet.A2L(new IndiaUpiAccountTypeSelectionFragment(new C20812AZp(this, paymentBottomSheet, 1)));
    }

    public void Bl9() {
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01.A19();
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A2K();
        }
        this.A00.A5J();
    }

    public void Bm8() {
        this.A00.A4t(1, "available_payment_methods_prompt");
    }

    public boolean CLr(C20284AEs aEs) {
        AnonymousClass91R r1 = this.A00;
        return r1.A5e(aEs, r1.A0a);
    }

    public boolean CMF() {
        return AnonymousClass000.A1X(this.A00.A0U);
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        C20063A5m.A00(aEs, paymentMethodRow, this.A00.A0M);
    }

    public View BRv(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return AnonymousClass3MX.A09(layoutInflater, frameLayout, 2131626508);
    }
}
