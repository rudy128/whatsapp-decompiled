package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class AY6 implements BB9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AY6(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    public void Bo0(AnonymousClass8pK r5) {
        A5I A012;
        C22442B7y ari;
        if (this.A00 != 0) {
            Log.i("PAY: BrazilPayBloksActivity BrazilGetVerificationMethods - onCardVerified");
            A012 = ((AnonymousClass91q) this.A01).A0D.A01();
            ari = new ARG(this.A02, this, 15);
        } else {
            Log.i("PAY: BrazilConfirmReceivePayment BrazilGetVerificationMethods - onCardVerified");
            A012 = ((ConfirmReceivePaymentFragment) this.A01).A02.A01();
            ari = new ARI(r5, this, this.A02, 2);
        }
        A012.A03(ari, r5);
    }

    public void C3s(A7B a7b, List list) {
        C21347Aib aib;
        int i;
        if (this.A00 != 0) {
            C21347Aib aib2 = null;
            if (a7b != null) {
                i = a7b.A00;
            } else if (list != null && !list.isEmpty()) {
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A01;
                if (C19944A0b.A00(list)) {
                    i = -233;
                } else {
                    int A022 = AnonymousClass8BX.A02(brazilPayBloksActivity, list);
                    JSONArray A012 = brazilPayBloksActivity.A05.A01(list);
                    int A0d = BrazilPayBloksActivity.A0d(list);
                    if (C18020vd.A05(C18040vf.A02, brazilPayBloksActivity.A0E, A022) && A0d != -1) {
                        aib2 = (C21347Aib) list.get(A0d);
                    }
                    AnonymousClass8pK r3 = (AnonymousClass8pK) brazilPayBloksActivity.A04.A08(this.A03);
                    if (A012 != null) {
                        ((C194839sN) this.A02).A01("on_success", brazilPayBloksActivity.A0H.A04(r3, aib2, A012.toString(), A0d));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            AnonymousClass91q.A0q((C194839sN) this.A02, (Map) null, i);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A01;
        brazilConfirmReceivePaymentFragment.A00.A04();
        if (a7b == null && list != null && !list.isEmpty()) {
            C18030ve r0 = brazilConfirmReceivePaymentFragment.A05;
            C18040vf r2 = C18040vf.A02;
            if (C18020vd.A05(r2, r0, 2443)) {
                Collections.sort(list);
            }
            JSONArray A013 = brazilConfirmReceivePaymentFragment.A06.A01(list);
            int A0d2 = BrazilPayBloksActivity.A0d(list);
            if (A013 != null && !C19944A0b.A00(list)) {
                if (!C18020vd.A05(r2, brazilConfirmReceivePaymentFragment.A05, 2443) || A0d2 == -1) {
                    aib = null;
                } else {
                    aib = (C21347Aib) list.get(A0d2);
                }
                String str = this.A03;
                String obj = A013.toString();
                AnonymousClass8pK r4 = (AnonymousClass8pK) AnonymousClass8BR.A0R(brazilConfirmReceivePaymentFragment.A02).A08(str);
                if (r4 != null) {
                    Intent A032 = brazilConfirmReceivePaymentFragment.A0E.A03(brazilConfirmReceivePaymentFragment.A1B(), r4, aib, obj, A0d2);
                    AnonymousClass8k7.A03(A032, "onboarding_context", "p2p_context");
                    brazilConfirmReceivePaymentFragment.A1k(A032);
                }
                DialogFragment dialogFragment = (DialogFragment) this.A02;
                if (dialogFragment != null) {
                    dialogFragment.A28();
                    return;
                }
                return;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: BrazilConfirmReceivePayment GetVerificationMethods Error: ");
        C17900vP.A0o(A10, 0);
        brazilConfirmReceivePaymentFragment.A07.A01(brazilConfirmReceivePaymentFragment.A1n(), brazilConfirmReceivePaymentFragment.A05, brazilConfirmReceivePaymentFragment.A0B, 0, 2131893770).show();
    }
}
