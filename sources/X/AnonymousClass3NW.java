package X;

import android.telephony.PhoneStateListener;
import com.whatsapp.WaImageButton;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.util.Log;

/* renamed from: X.3NW  reason: invalid class name */
public class AnonymousClass3NW extends PhoneStateListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass3NW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onCallStateChanged(int i, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                ((AnonymousClass4aY) this.A01).A2Y.A0W(AnonymousClass000.A1S(i, 2));
                return;
            case 1:
                if (i == 0) {
                    str2 = "phone/state idle";
                } else if (i == 1) {
                    Log.i("phone/state ringing");
                    ((C31131f4) this.A01).A04();
                    return;
                } else if (i == 2) {
                    str2 = "phone/state offhook";
                } else {
                    return;
                }
                Log.i(str2);
                return;
            default:
                TokenizedSearchInput tokenizedSearchInput = ((SearchFragment) this.A01).A0d;
                if (i == 2) {
                    WaImageButton waImageButton = tokenizedSearchInput.A05;
                    if (waImageButton != null && waImageButton.getVisibility() == 0) {
                        tokenizedSearchInput.A05.setEnabled(false);
                        return;
                    }
                    return;
                }
                tokenizedSearchInput.A0M();
                return;
        }
    }
}
