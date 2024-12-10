package X;

import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ak  reason: invalid class name and case insensitive filesystem */
public class C177749Ak extends A34 {
    public final /* synthetic */ AnonymousClass91R A00;

    public C177749Ak(AnonymousClass91R r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int i;
        List list = (List) obj;
        if (list == null || list.size() == 0) {
            AnonymousClass91R r2 = this.A00;
            r2.A0i.A06("PopulateMethodsForSend could not find methods;");
            r2.finish();
            return;
        }
        AnonymousClass91R r1 = this.A00;
        AnonymousClass1QE r4 = r1.A0i;
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A15("onPostExecute got methods: ", A10, list);
        AnonymousClass8BS.A19(r4, A10);
        ArrayList A04 = C20284AEs.A04(r1.A0O.A02(), list);
        r1.A0j = A04;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("onPostExecute got paymentMethodList for store: ");
        r4.A04(C17890vO.A0V(Integer.valueOf(A04.size()), A102));
        List list2 = r1.A0j;
        if (list2 != null && list2.size() > 0) {
            boolean z = false;
            if (r1.A0B != null) {
                Iterator it = r1.A0j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C20284AEs A0P = AnonymousClass8BR.A0P(it);
                    if (A0P.A0A.equals(r1.A0B.A0A)) {
                        r1.A0j.remove(A0P);
                        break;
                    }
                }
                r1.A0j.add(0, r1.A0B);
            } else {
                List list3 = r1.A0j;
                r1.A0B = AnonymousClass8BR.A0Q(list3, r1.A0O.A03(r1.A0t, r1.A0a, list3, r1.A0x, r1.A5c()));
            }
            if (r1.A0U != null) {
                Iterator it2 = r1.A0j.iterator();
                while (it2.hasNext()) {
                    C20284AEs A0P2 = AnonymousClass8BR.A0P(it2);
                    String str = A0P2.A0A;
                    C18070vi.A0d(str, 0);
                    if (!AnonymousClass3MW.A12(((A0u) r1.A0N.get()).A01).containsKey(str)) {
                        r1.A0j.remove(A0P2);
                    }
                }
            }
            PaymentView paymentView = r1.A0J;
            if (paymentView != null) {
                paymentView.setBankLogo(r1.A0B.A06());
                PaymentView paymentView2 = r1.A0J;
                A56 A0c = AnonymousClass8BR.A0c(r1.A0P);
                List list4 = r1.A0j;
                C20284AEs aEs = r1.A0B;
                if (aEs != null) {
                    i = 0;
                    while (true) {
                        if (i < list4.size()) {
                            if (AnonymousClass8BR.A0Q(list4, i).A0A.equals(aEs.A0A)) {
                                break;
                            }
                            i++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                } else {
                    i = r1.A0O.A03(r1.A0t, r1.A0a, list4, r1.A0x, r1.A5c());
                }
                C20284AEs A0Q = AnonymousClass8BR.A0Q(list4, i);
                C18070vi.A0d(A0Q, 0);
                paymentView2.setPaymentMethodText(A0c.A03(A0Q, true));
                PaymentView paymentView3 = r1.A0J;
                if (r1.A0B == null) {
                    z = true;
                }
                paymentView3.A0I(z);
                PaymentView paymentView4 = r1.A0J;
                if (paymentView4.A00 != 1) {
                    paymentView4.A0F();
                }
            }
        }
        r1.A0H = null;
    }
}
