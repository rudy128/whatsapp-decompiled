package X;

import android.text.TextUtils;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;

/* renamed from: X.1vf  reason: invalid class name and case insensitive filesystem */
public abstract class C41011vf {
    public void A01(AnonymousClass1EC r1) {
    }

    public void A00(AnonymousClass1EC r3) {
        if (this instanceof C41021vg) {
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = ((C41021vg) this).A00;
            synchronized (callsHistoryFragmentViewModel) {
                callsHistoryFragmentViewModel.A0H = null;
            }
            C41101vo r1 = callsHistoryFragmentViewModel.A0Y;
            if (!TextUtils.isEmpty(r1.A01)) {
                r1.filter(r1.A01);
            }
        }
    }
}
