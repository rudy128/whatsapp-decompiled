package X;

import com.whatsapp.WaTextView;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.AGl  reason: case insensitive filesystem */
public final /* synthetic */ class C20329AGl implements C22851Dl {
    public final /* synthetic */ VerifyPhoneNumber A00;
    public final /* synthetic */ String A01;

    public final void Bo9(Object obj) {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        String str = this.A01;
        if (AnonymousClass026.A00(obj, "complete")) {
            if (AnonymousClass8BR.A1U(str) && C19963A0w.A00(verifyPhoneNumber)) {
                verifyPhoneNumber.A4h(1);
            }
            if (C18020vd.A05(C18040vf.A02, verifyPhoneNumber.A00, 8780)) {
                verifyPhoneNumber.A11.setEnabled(true);
            } else {
                verifyPhoneNumber.A0U.setClickable(true);
                WaTextView waTextView = verifyPhoneNumber.A0U;
                AnonymousClass8BW.A0z(verifyPhoneNumber.A0U.getContext(), verifyPhoneNumber.getResources(), waTextView, 2130970928, 2131102377);
            }
            verifyPhoneNumber.A10.A04(8);
            verifyPhoneNumber.A0s.A0V(str);
        }
    }

    public /* synthetic */ C20329AGl(VerifyPhoneNumber verifyPhoneNumber, String str) {
        this.A00 = verifyPhoneNumber;
        this.A01 = str;
    }
}
