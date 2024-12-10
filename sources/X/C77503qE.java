package X;

import android.widget.TextView;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;

/* renamed from: X.3qE  reason: invalid class name and case insensitive filesystem */
public final class C77503qE extends C180599Ne {
    public final /* synthetic */ CountryAndPhoneNumberFragment A00;

    public C77503qE(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment) {
        this.A00 = countryAndPhoneNumberFragment;
    }

    public void A00(String str, String str2) {
        String str3;
        boolean z;
        boolean A18 = C18070vi.A18(str, "");
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment = this.A00;
        if (A18) {
            TextView textView = countryAndPhoneNumberFragment.A02;
            if (textView != null) {
                textView.setText(2131894983);
            }
        } else if (str2 == null) {
            TextView textView2 = countryAndPhoneNumberFragment.A02;
            if (textView2 != null) {
                textView2.setText(2131894983);
            }
            z = true;
            CountryAndPhoneNumberFragment.A01(countryAndPhoneNumberFragment, z);
        } else {
            TextView textView3 = countryAndPhoneNumberFragment.A02;
            if (textView3 != null) {
                AnonymousClass1K3 r1 = countryAndPhoneNumberFragment.A0C;
                if (r1 != null) {
                    C18000vb r0 = countryAndPhoneNumberFragment.A09;
                    if (r0 != null) {
                        textView3.setText(r1.A03(r0, str2));
                    } else {
                        str3 = "whatsAppLocale";
                    }
                } else {
                    str3 = "countryUtils";
                }
                C18070vi.A11(str3);
                throw null;
            }
        }
        z = false;
        CountryAndPhoneNumberFragment.A01(countryAndPhoneNumberFragment, z);
    }
}
