package X;

import android.content.Context;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

public final class AXE implements C33661jB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A01;
    public final /* synthetic */ Integer A02;

    public AXE(HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, Integer num, int i) {
        this.A01 = hybridPaymentMethodPickerFragment;
        this.A02 = num;
        this.A00 = i;
    }

    public void C3L(A7B a7b) {
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        Context A1n = hybridPaymentMethodPickerFragment.A1n();
        if (A1n != null) {
            AnonymousClass1QS r0 = hybridPaymentMethodPickerFragment.A08;
            if (r0 != null) {
                AnonymousClass1R2.A0D(A1n, hybridPaymentMethodPickerFragment.A1H(2131893867), r0.A06().BQc());
                return;
            }
            C18070vi.A11("paymentsManager");
            throw null;
        }
    }

    public void C3X(A7B a7b) {
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        Context A1n = hybridPaymentMethodPickerFragment.A1n();
        if (A1n != null) {
            AnonymousClass1QS r0 = hybridPaymentMethodPickerFragment.A08;
            if (r0 != null) {
                AnonymousClass1R2.A0D(A1n, hybridPaymentMethodPickerFragment.A1H(2131893867), r0.A06().BQc());
                return;
            }
            C18070vi.A11("paymentsManager");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3Y(X.C186089dd r6) {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A02
            int r4 = r0.intValue()
            r3 = 1
            r1 = 0
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r2 = r5.A01
            X.1QD r0 = r2.A06
            if (r4 == r1) goto L_0x0028
            if (r0 == 0) goto L_0x002e
            if (r4 == r3) goto L_0x0019
            r0.A0A()
            X.1QD r0 = r2.A06
            if (r0 == 0) goto L_0x002e
        L_0x0019:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "pref_p2m_hybrid_v2_tos_accepted"
            X.C17880vN.A1F(r1, r0, r3)
        L_0x0022:
            int r0 = r5.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A01(r2, r0)
            return
        L_0x0028:
            if (r0 == 0) goto L_0x002e
            r0.A0A()
            goto L_0x0022
        L_0x002e:
            java.lang.String r0 = "paymentSharedPrefs"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXE.C3Y(X.9dd):void");
    }
}
