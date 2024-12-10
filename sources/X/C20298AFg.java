package X;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;

/* renamed from: X.AFg  reason: case insensitive filesystem */
public final class C20298AFg implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final /* synthetic */ ConfirmLegalNameBottomSheetFragment A01;

    public C20298AFg(ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment) {
        this.A01 = confirmLegalNameBottomSheetFragment;
    }

    public void onGlobalLayout() {
        String str;
        ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment = this.A01;
        if (confirmLegalNameBottomSheetFragment.A0B != null) {
            boolean A002 = AnonymousClass1L4.A00(confirmLegalNameBottomSheetFragment.A26());
            if (A002 != this.A00) {
                this.A00 = A002;
                ScrollView scrollView = confirmLegalNameBottomSheetFragment.A03;
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                    return;
                }
                str = "scrollView";
            } else {
                return;
            }
        } else {
            str = "imeUtils";
        }
        C18070vi.A11(str);
        throw null;
    }
}
