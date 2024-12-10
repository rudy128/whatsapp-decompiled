package X;

import android.view.View;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1mB  reason: invalid class name and case insensitive filesystem */
public class C35401mB {
    public final /* synthetic */ CallsHistoryFragment A00;

    public C35401mB(CallsHistoryFragment callsHistoryFragment) {
        this.A00 = callsHistoryFragment;
    }

    public void A00(View view, C41121vq r7, AnonymousClass28W r8) {
        CallsHistoryFragment callsHistoryFragment = this.A00;
        AnonymousClass1FL A1B = callsHistoryFragment.A1B();
        if (callsHistoryFragment.A02 != null) {
            CallsHistoryFragment.A07(r8, callsHistoryFragment);
        } else if (A1B == null) {
            Log.w("voip/CallsFragment no activity registered to open contact");
        } else {
            callsHistoryFragment.A0r.get();
            A09 a09 = new A09(view, r7.BTb(), 6);
            a09.A02 = AnonymousClass1Xr.A02(view);
            a09.A01(A1B);
            callsHistoryFragment.A0C.A0Y(r7);
        }
    }
}
