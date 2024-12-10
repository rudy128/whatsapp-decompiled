package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;

/* renamed from: X.5qR  reason: invalid class name and case insensitive filesystem */
public final class C114275qR extends C6X {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ PrivacyDisclosureBottomSheetFragment A01;
    public final /* synthetic */ boolean A02;

    public void A02(View view, float f) {
    }

    public void A03(View view, int i) {
        if (i == 4 || i == 5) {
            AnonymousClass1FL A1B = this.A01.A1B();
            if (A1B != null) {
                AnonymousClass6XD.A00(AnonymousClass3MX.A0O(A1B), AnonymousClass00R.A0N);
            }
        } else if (this.A02) {
            this.A00.A0W(3);
        }
    }

    public C114275qR(BottomSheetBehavior bottomSheetBehavior, PrivacyDisclosureBottomSheetFragment privacyDisclosureBottomSheetFragment, boolean z) {
        this.A01 = privacyDisclosureBottomSheetFragment;
        this.A02 = z;
        this.A00 = bottomSheetBehavior;
    }
}
