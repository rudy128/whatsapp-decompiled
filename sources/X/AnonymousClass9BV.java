package X;

import android.util.Pair;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9BV  reason: invalid class name */
public class AnonymousClass9BV extends A34 {
    public final AnonymousClass11E A00;
    public final AnonymousClass1M9 A01;
    public final C678831f A02;
    public final AnonymousClass1OZ A03;
    public final WeakReference A04;
    public final List A05;

    public void A0E() {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A04.get();
        if (indiaUpiPaymentSettingsFragment != null) {
            IndiaUpiPaymentSettingsFragment.A0C(indiaUpiPaymentSettingsFragment, indiaUpiPaymentSettingsFragment.A0e);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        String str2;
        Pair pair = (Pair) obj;
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A04.get();
        if (indiaUpiPaymentSettingsFragment != null) {
            if (pair == null) {
                str2 = "handlecontactlesssync/fetchContactUsingNumbers/disconnected/";
            } else {
                C62602rf r1 = (C62602rf) pair.first;
                if (r1.A01()) {
                    ArrayList A13 = AnonymousClass000.A13();
                    HashMap A11 = C17880vN.A11();
                    for (AnonymousClass1E7 r12 : (AnonymousClass1E7[]) pair.second) {
                        if (!(r12 == null || r12.A0J == null)) {
                            A11.put(r12.A0J.getRawString(), r12);
                        }
                    }
                    Iterator it = this.A05.iterator();
                    while (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        try {
                            C22951Dx r0 = PhoneUserJid.Companion;
                            A13.add(A11.get(C22951Dx.A01(A0v).getRawString()));
                        } catch (AnonymousClass11T unused) {
                            C17900vP.A0f("handlecontactlesssync/onPostExecute unable to get phone num jid for contact: ", A0v, AnonymousClass000.A10());
                        }
                    }
                    if (!A13.isEmpty()) {
                        List list = indiaUpiPaymentSettingsFragment.A0e;
                        if (list == null) {
                            list = AnonymousClass000.A13();
                            indiaUpiPaymentSettingsFragment.A0e = list;
                        }
                        list.addAll(A13);
                    }
                } else {
                    int i = r1.A00;
                    if (i == 0) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/network-unavailable/";
                    } else if (i == 5) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/rateLimited/try-again-later/";
                    } else if (i == 4) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/try-again/";
                    } else if (i == 1) {
                        str2 = "handlecontactlesssync/fetchContactUsingNumbers/existing request ongoing/";
                    } else if (i == 6) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/exception-occurred/";
                    } else {
                        return;
                    }
                    Log.w(str);
                }
                IndiaUpiPaymentSettingsFragment.A0C(indiaUpiPaymentSettingsFragment, indiaUpiPaymentSettingsFragment.A0e);
                return;
            }
            Log.w(str2);
        }
    }

    public AnonymousClass9BV(AnonymousClass11E r2, AnonymousClass1M9 r3, C678831f r4, AnonymousClass1OZ r5, IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, List list) {
        this.A04 = AnonymousClass3MW.A0z(indiaUpiPaymentSettingsFragment);
        this.A05 = list;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
