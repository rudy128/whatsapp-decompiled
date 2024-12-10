package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;

/* renamed from: X.1w9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41311w9 implements C22821Di {
    public final /* synthetic */ CallsHistoryFragment A00;

    public final Object invoke(Object obj) {
        Fragment fragment = (Fragment) obj;
        AnonymousClass1FL A1B = this.A00.A1B();
        if (A1B == null) {
            return null;
        }
        C34001jj r1 = new C34001jj(A1B.A03.A00.A03);
        r1.A0B(fragment, "phone_number_selection_dialog");
        r1.A00(true);
        return null;
    }

    public /* synthetic */ C41311w9(CallsHistoryFragment callsHistoryFragment) {
        this.A00 = callsHistoryFragment;
    }
}
