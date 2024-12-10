package X;

import android.text.TextUtils;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

public class AXG implements C33661jB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public void C3Y(C186089dd r8) {
        AnonymousClass1QD r2;
        int i;
        if (this.A00 != 0) {
            boolean z = r8 instanceof C176028zf;
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A01;
            if (z) {
                indiaPaymentSettingsViewModel.A07.A04("accountRecovery/getTransactions/onResponseSuccess");
                C176028zf r82 = (C176028zf) r8;
                ADK adk = r82.A00;
                if (adk == null) {
                    return;
                }
                if (adk.A01 || TextUtils.isEmpty(adk.A00)) {
                    r2 = indiaPaymentSettingsViewModel.A07;
                    r2.A0G(AnonymousClass11P.A01(indiaPaymentSettingsViewModel.A05));
                    i = 2;
                } else {
                    indiaPaymentSettingsViewModel.A06.A01(this, (Integer) this.A03, (Integer) this.A02, r82.A00.A00, (String) null);
                    return;
                }
            } else {
                r2 = indiaPaymentSettingsViewModel.A07;
                r2.A0G(AnonymousClass11P.A01(indiaPaymentSettingsViewModel.A05));
                indiaPaymentSettingsViewModel.A07.A04("unexpected payment transaction result type.");
                i = 0;
            }
            r2.A0D(i);
            return;
        }
        ((C33661jB) this.A02).C3Y(r8);
    }

    public AXG(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public void C3L(A7B a7b) {
        if (this.A00 != 0) {
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A01;
            AnonymousClass1QD r2 = indiaPaymentSettingsViewModel.A07;
            r2.A0G(AnonymousClass11P.A01(indiaPaymentSettingsViewModel.A05));
            r2.A0D(0);
            AnonymousClass8BX.A1C(indiaPaymentSettingsViewModel.A07, a7b, "accountRecovery/getPaymentTransactions/onRequestError. paymentNetworkError: ", AnonymousClass000.A10());
            return;
        }
        ((C33661jB) this.A02).C3L(a7b);
    }

    public void C3X(A7B a7b) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) obj;
            AnonymousClass1QD r2 = indiaPaymentSettingsViewModel.A07;
            r2.A0G(AnonymousClass11P.A01(indiaPaymentSettingsViewModel.A05));
            r2.A0D(0);
            AnonymousClass8BX.A1C(indiaPaymentSettingsViewModel.A07, a7b, "accountRecovery/getPaymentTransactions/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
            return;
        }
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) obj;
        AnonymousClass8BX.A1D(indiaUpiBankAccountDetailsActivity.A0P, a7b, "removePayment/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
        BD4 bd4 = (BD4) this.A03;
        if (bd4 != null) {
            bd4.Bi4(a7b, 13);
        }
        C19967A1c A022 = indiaUpiBankAccountDetailsActivity.A03.A02((C196259ui) null, a7b.A00);
        if (A022.A00 != 0) {
            indiaUpiBankAccountDetailsActivity.CEx();
            String A002 = A022.A00(indiaUpiBankAccountDetailsActivity);
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment.A1R(AnonymousClass8BX.A0E(A002));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment, indiaUpiBankAccountDetailsActivity, (String) null);
            return;
        }
        ((C33661jB) this.A02).C3X(a7b);
    }
}
