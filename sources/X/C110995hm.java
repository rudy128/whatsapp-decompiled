package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;

/* renamed from: X.5hm  reason: invalid class name and case insensitive filesystem */
public final class C110995hm extends C27461We {
    public final /* synthetic */ BloksCDSBottomSheetActivity A00;

    public void A06(Fragment fragment, AnonymousClass1GP r5) {
        if (fragment instanceof BkCdsBottomSheetFragment) {
            BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = this.A00;
            int i = bloksCDSBottomSheetActivity.A00 - 1;
            bloksCDSBottomSheetActivity.A00 = i;
            if (i == 0) {
                bloksCDSBottomSheetActivity.finish();
                bloksCDSBottomSheetActivity.overridePendingTransition(0, 0);
            }
        }
    }

    public C110995hm(BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity) {
        this.A00 = bloksCDSBottomSheetActivity;
    }
}
