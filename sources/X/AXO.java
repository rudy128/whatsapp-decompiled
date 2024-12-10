package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AXO implements C33661jB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AXO(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A00() {
        C33341if r2 = (C33341if) this.A01;
        int i = r2.A00;
        if (i < 3) {
            r2.A00 = i + 1;
            r2.A08.A0A(this);
            return;
        }
        AnonymousClass1QE r3 = r2.A0B;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, i);
        r3.A05(String.format(locale, "AccountRecoveryNotification: sendGetPaymentMethods retry failed, attempts made: %d", objArr));
    }

    public void C3L(A7B a7b) {
        AnonymousClass1FU r1;
        switch (this.A00) {
            case 0:
                ((C33341if) this.A01).A0B.A05("handlePaymentMethodUpdate: sendGetPaymentMethods request error");
                return;
            case 1:
                ((C33341if) this.A01).A0B.A05("AccountRecoveryNotification: sendGetPaymentMethods request error");
                A00();
                return;
            case 2:
                ((C190169kU) this.A02).A00.invoke();
                return;
            case 5:
                AnonymousClass91y r3 = (AnonymousClass91y) this.A01;
                r3.A0M.A04(AnonymousClass001.A1E(a7b, "removePayment/onRequestError. paymentNetworkError: ", AnonymousClass000.A10()));
                BD4 bd4 = (BD4) this.A02;
                if (bd4 != null) {
                    bd4.Bi4(a7b, 13);
                }
                r3.CEx();
                r3.BhQ(2131893659);
                return;
            case 6:
                A0R a0r = (A0R) this.A01;
                a0r.A0G.A04(AnonymousClass001.A1E(a7b, "onClosePaymentAccountConfirmed/onRequestError. paymentNetworkError: ", AnonymousClass000.A10()));
                a0r.A0C.A01((Context) this.A02, a0r.A0B, a0r.A0F, a7b.A00, 2131893597).show();
                return;
            case 7:
                AnonymousClass8BX.A1D(((C161588Gc) this.A01).A0g, a7b, "syncPendingTransaction onRequestError: ", AnonymousClass000.A10());
                BD4 bd42 = (BD4) this.A02;
                if (bd42 != null) {
                    bd42.Bi4(a7b, 10);
                    return;
                }
                return;
            case 8:
                C17900vP.A0Y(a7b, "IndiaUpiPaymentSettingsFragment/onDeleteAccount onRequestError: ", C18070vi.A0K(a7b));
                Activity activity = (Activity) this.A01;
                if ((activity instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) activity) != null) {
                    r1.CEx();
                    r1.BhQ(2131893867);
                    return;
                }
                return;
            case 9:
                return;
            default:
                AnonymousClass91q.A0q((C194839sN) this.A02, (Map) null, a7b.A00);
                return;
        }
    }

    public void C3X(A7B a7b) {
        switch (this.A00) {
            case 0:
                ((C33341if) this.A01).A0B.A05("handlePaymentMethodUpdate: sendGetPaymentMethods response error");
                return;
            case 1:
                ((C33341if) this.A01).A0B.A05("AccountRecoveryNotification: sendGetPaymentMethods response error");
                A00();
                return;
            case 2:
                ((C190169kU) this.A02).A00.invoke();
                return;
            case 5:
                AnonymousClass91y r3 = (AnonymousClass91y) this.A01;
                AnonymousClass8BX.A1D(r3.A0M, a7b, "removePayment/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
                BD4 bd4 = (BD4) this.A02;
                if (bd4 != null) {
                    bd4.Bi4(a7b, 13);
                }
                r3.CEx();
                r3.BhQ(2131893659);
                return;
            case 6:
                A0R a0r = (A0R) this.A01;
                AnonymousClass8BX.A1D(a0r.A0G, a7b, "onClosePaymentAccountConfirmed/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
                AnonymousClass1FU r1 = (AnonymousClass1FU) this.A02;
                r1.CEx();
                a0r.A0C.A01(r1, a0r.A0B, a0r.A0F, a7b.A00, 2131893597).show();
                return;
            case 7:
                AnonymousClass8BX.A1D(((C161588Gc) this.A01).A0g, a7b, "syncPendingTransaction onResponseError: ", AnonymousClass000.A10());
                BD4 bd42 = (BD4) this.A02;
                if (bd42 != null) {
                    bd42.Bi4(a7b, 10);
                    return;
                }
                return;
            case 8:
                C17900vP.A0Y(a7b, "IndiaUpiPaymentSettingsFragment/onDeleteAccount onResponseError: ", C18070vi.A0K(a7b));
                Activity activity = (Activity) this.A01;
                if (activity instanceof AnonymousClass1FU) {
                    AnonymousClass1FU r12 = (AnonymousClass1FU) activity;
                    r12.CEx();
                    r12.BhQ(2131893867);
                    return;
                }
                return;
            case 9:
                return;
            default:
                AnonymousClass91q.A0q((C194839sN) this.A02, (Map) null, a7b.A00);
                return;
        }
    }

    public void C3Y(C186089dd r7) {
        C18090vk r0;
        AnonymousClass1FU r1;
        switch (this.A00) {
            case 0:
                ((C33341if) this.A01).A01.A0J(new C70653Bz(this, this.A02, 33));
                return;
            case 1:
                C33341if r2 = (C33341if) this.A01;
                r2.A0B.A06("AccountRecoveryNotification: sendGetPaymentMethods success");
                AnonymousClass1QS r22 = r2.A0A;
                AnonymousClass1KH A0R = AnonymousClass8BR.A0R(r22);
                if (A0R != null) {
                    AnonymousClass1QS.A00(r22);
                    if (A0R.A07() != null) {
                        AnonymousClass1QS.A00(r22);
                        C20284AEs A07 = A0R.A07();
                        if (A07 != null) {
                            AnonymousClass3M8 r23 = (AnonymousClass3M8) this.A02;
                            r23.CRC(A07.A08);
                            r23.BIG((String) null, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                List list = ((C176018ze) r7).A00;
                if (list.isEmpty()) {
                    r0 = ((C190169kU) this.A02).A00;
                } else {
                    C190169kU r5 = (C190169kU) this.A02;
                    if (C18020vd.A05(C18040vf.A02, ((C31071ey) this.A01).A07.A06.A02, 4781)) {
                        ArrayList A13 = AnonymousClass000.A13();
                        Iterator it = list.iterator();
                        AnonymousClass8pO r24 = null;
                        while (it.hasNext()) {
                            C20284AEs A0P = AnonymousClass8BR.A0P(it);
                            if (A0P instanceof AnonymousClass8pO) {
                                r24 = (AnonymousClass8pO) A0P;
                            } else if (A0P instanceof AnonymousClass8pM) {
                                A13.add(A0P);
                            }
                        }
                        if (r24 != null || !A13.isEmpty()) {
                            r5.A00(r24);
                            return;
                        }
                    } else {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C20284AEs A0P2 = AnonymousClass8BR.A0P(it2);
                            if (A0P2 instanceof AnonymousClass8pO) {
                                r5.A00((AnonymousClass8pO) A0P2);
                                return;
                            }
                        }
                    }
                    r0 = r5.A00;
                }
                r0.invoke();
                return;
            case 5:
                AnonymousClass91y r3 = (AnonymousClass91y) this.A01;
                r3.A0M.A06("removePayment Success");
                BD4 bd4 = (BD4) this.A02;
                if (bd4 != null) {
                    bd4.Bi4((A7B) null, 13);
                }
                r3.CEx();
                r3.BhQ(2131893663);
                return;
            case 6:
                A0R a0r = (A0R) this.A01;
                a0r.A0G.A06("onClosePaymentAccountConfirmed/onResponseSuccess");
                AnonymousClass1FU r32 = (AnonymousClass1FU) this.A02;
                r32.CEx();
                C17880vN.A1F(AnonymousClass8BU.A07(a0r.A04), "payment_brazil_nux_dismissed", true);
                AnonymousClass4Yv.A01(r32, 100);
                return;
            case 7:
                ((C161588Gc) this.A01).A0g.A06("syncPendingTransaction onResponseSuccess");
                BD4 bd42 = (BD4) this.A02;
                if (bd42 != null) {
                    bd42.Bi4((A7B) null, 10);
                    return;
                }
                return;
            case 8:
                StringBuilder A0K = C18070vi.A0K(r7);
                A0K.append("IndiaUpiPaymentSettingsFragment/onDeleteAccount onResponseSuccess: ");
                C17900vP.A0r(A0K, r7.A02);
                if (r7.A02) {
                    IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = ((AnonymousClass9YS) this.A02).A00;
                    indiaUpiPaymentSettingsFragment.A0a.A09(true, true);
                    IndiaUpiPaymentSettingsFragment.A08(indiaUpiPaymentSettingsFragment);
                }
                Activity activity = (Activity) this.A01;
                if ((activity instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) activity) != null) {
                    r1.CEx();
                    return;
                }
                return;
            case 9:
                C20118A8b a8b = (C20118A8b) this.A02;
                a8b.A09 = A8e.A05(((C176018ze) r7).A00);
                ((IndiaUpiSecureQrCodeViewModel) this.A01).A00.A0E(a8b);
                return;
            default:
                ((C194839sN) this.A02).A00("on_success");
                return;
        }
    }
}
