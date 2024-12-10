package X;

import com.whatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;

/* renamed from: X.6Nd  reason: invalid class name */
public abstract class AnonymousClass6Nd extends WaBloksActivity {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = (BloksCDSBottomSheetActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, bloksCDSBottomSheetActivity);
            AnonymousClass1FB.A0M(A0A, bloksCDSBottomSheetActivity);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, bloksCDSBottomSheetActivity);
            C109005cf.A0e(A0A, r1, bloksCDSBottomSheetActivity, r1.A5A);
            C114935sU.A03(r4, A0A, r1, bloksCDSBottomSheetActivity);
            bloksCDSBottomSheetActivity.A02 = C000200d.A00(A0A.ADS);
            bloksCDSBottomSheetActivity.A03 = C000200d.A00(r4.A05);
            bloksCDSBottomSheetActivity.A04 = C000200d.A00(A0A.A32);
        }
    }

    public AnonymousClass6Nd() {
        C1423379b.A00(this, 20);
    }
}
