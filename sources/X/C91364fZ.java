package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.WaViewPager;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.4fZ  reason: invalid class name and case insensitive filesystem */
public class C91364fZ implements E3d {
    public final int A00;
    public final Object A01;

    public C91364fZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C4a(NestedScrollView nestedScrollView, int i) {
        switch (this.A00) {
            case 0:
                GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A01;
                WaViewPager waViewPager = greenAlertActivity.A02;
                if (waViewPager == null) {
                    C18070vi.A11("viewPager");
                    throw null;
                } else {
                    GreenAlertActivity.A0c(greenAlertActivity, waViewPager.getCurrentLogicalItem());
                    return;
                }
            case 1:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A01;
                UserNoticeBottomSheetDialogFragment.A02(userNoticeBottomSheetDialogFragment, false, false);
                UserNoticeBottomSheetDialogFragment.A01(userNoticeBottomSheetDialogFragment);
                Runnable runnable = userNoticeBottomSheetDialogFragment.A0B;
                if (runnable != null) {
                    AnonymousClass1KB r0 = userNoticeBottomSheetDialogFragment.A04;
                    if (r0 != null) {
                        r0.A0I(runnable);
                    }
                    AnonymousClass3MW.A1C();
                    throw null;
                }
                if (!UserNoticeBottomSheetDialogFragment.A03(userNoticeBottomSheetDialogFragment)) {
                    C21448AkF akF = new C21448AkF(userNoticeBottomSheetDialogFragment, 36);
                    userNoticeBottomSheetDialogFragment.A0B = akF;
                    AnonymousClass1KB r2 = userNoticeBottomSheetDialogFragment.A04;
                    if (r2 != null) {
                        r2.A0K(akF, 600);
                        return;
                    }
                    AnonymousClass3MW.A1C();
                    throw null;
                }
                return;
            default:
                View findViewById = ((AnonymousClass01E) this.A01).findViewById(2131430779);
                if (findViewById != null) {
                    int i2 = 8;
                    if (i > 0) {
                        i2 = 0;
                    }
                    findViewById.setVisibility(i2);
                    return;
                }
                return;
        }
    }
}
